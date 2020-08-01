/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dao;

import com.kasolution.domain.Funcionario;
import com.kasolution.util.Parametrizador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 130955800299
 */
public class FuncionarioDAO implements DAO<Funcionario> {

    private static final String SQL_INSERT = "INSERT INTO FUNCIONARIO (NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO)"
            + " VALUES (?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE FUNCIONARIO SET "
            + " NOME = ?, "
            + " SEXO = ?, "
            + " IDADE = ?, "
            + " CIDADE = ?, "
            + " ESTADO = ?, "
            + " SALARIO = ? "
            + " WHERE CODIGO = ? ";
    private static final String SQL_DELETE = "DELETE FROM FUNCIONARIO WHERE CODIGO = ?";
    private static final String SQL_QUERY_ALL = "SELECT CODIGO, NOME, SEXO, IDADE, CIDADE,"
            + " ESTADO, SALARIO FROM FUNCIONARIO";
    private static final String SQL_QUERY_ONE = "SELECT CODIGO, NOME, SEXO, IDADE, CIDADE,"
            + " ESTADO, SALARIO FROM FUNCIONARIO WHERE CODIGO = ?";

    private Connection con;

    public FuncionarioDAO() {
        String url = Parametrizador.getInstance().getProperties("url");
        String username = Parametrizador.getInstance().getProperties("usuario");
        String password = Parametrizador.getInstance().getProperties("senha");
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Erro ao obter conexão com o MySQL ! " + ex.getMessage());
        }//fim try
    }//fim metodo

    @Override
    public void salvar(Funcionario t) throws DAOException {
        //NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO
        try (PreparedStatement stmt = con.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, t.getNome());
            stmt.setString(2, String.valueOf(t.getSexo()));
            stmt.setInt(3, t.getIdade());
            stmt.setString(4, t.getCidade());
            stmt.setString(5, t.getEstado());
            stmt.setDouble(6, t.getSalario());
            int qtdLinhas = stmt.executeUpdate();

            if (qtdLinhas != 1) {
                throw new DAOException("Erro ao INSERIR funcionario! Retorno != (1)");
            }
        } catch (SQLException ex) {
            throw new DAOException("Erro ao INSERIR Funcionario! " + ex.getMessage());
        }
    }//fim salvar

    @Override
    public void atualizar(Funcionario t) throws DAOException {
        try (PreparedStatement stmt = con.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, t.getNome());
            stmt.setString(2, String.valueOf(t.getSexo()));
            stmt.setInt(3, t.getIdade());
            stmt.setString(4, t.getCidade());
            stmt.setString(5, t.getEstado());
            stmt.setDouble(6, t.getSalario());
            stmt.setInt(7, t.getCodigo());
            int qtdLinhas = stmt.executeUpdate();

            if (qtdLinhas != 1) {
                throw new DAOException("Erro ao ATUALIZAR funcionario! Retorno != (1)");
            }

        } catch (SQLException ex) {
            throw new DAOException("Erro ao ATUALIZAR Funcionario! " + ex.getMessage());
        }
    }//fim atualizar

    @Override
    public boolean excluir(Funcionario t) throws DAOException {
        try (PreparedStatement stmt = con.prepareStatement(SQL_DELETE)) {
            stmt.setInt(1, t.getCodigo());
            return stmt.execute();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao EXCLUIR Funcionario! " + ex.getMessage());
        }
    }//fim excluir

    @Override
    public Funcionario buscarId(int id) throws DAOException {
        //NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO
        Funcionario f = null;
        try (PreparedStatement stmt = con.prepareStatement(SQL_QUERY_ONE)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    f = ormFuncionario(rs);
                }
            } catch (SQLException ex) {
                throw new DAOException("Erro ao BUSCAR FUNCIONARIO POR ID! " + ex.getMessage());
            }
            return f;
        } catch (SQLException ex) {
            throw new DAOException("Erro ao  BUSCAR FUNCIONARIO POR ID! " + ex.getMessage());
        }
    }//fim buscarId

    @Override
    public List<Funcionario> buscarTodos() throws DAOException {
        //NOME, SEXO, IDADE, CIDADE, ESTADO, SALARIO
        List<Funcionario> fs = new ArrayList<>();
        try (PreparedStatement stmt = con.prepareStatement(SQL_QUERY_ALL)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    fs.add(ormFuncionario(rs));
                }
            } catch (SQLException ex) {
                throw new DAOException("Erro ao BUSCAR FUNCIONARIOS! " + ex.getMessage());
            }
            return fs;
        } catch (SQLException ex) {
            throw new DAOException("Erro ao BUSCAR FUNCIONARIOS! " + ex.getMessage());
        }
    }//fim buscarTodos

    @Override
    public void close() throws DAOException {
        try {
            con.close();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao encerrar conexão com o BD!" + ex.getMessage());
        }
    }

    private Funcionario ormFuncionario(ResultSet rs) throws SQLException {
        return new Funcionario.Builder()
                .codigo(rs.getInt(1))
                .nome(rs.getString(2))
                .sexo(rs.getString(3).charAt(0))
                .idade(rs.getInt(4))
                .cidade(rs.getString(5))
                .estado(rs.getString(6))
                .salario(rs.getDouble(7))
                .build();
    }
}
