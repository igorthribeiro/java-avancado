/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasolution.dao;

import com.kasolution.domain.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igordev
 */
public class FuncionarioDAO implements DAO<Funcionario> {

    private static final String SQL_INSERT = "INSERT INTO FUNCIONARIO (NOME, SALARIO)"
            + " VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE FUNCIONARIO SET "
            + " NOME = ?, "
            + " SALARIO = ? "
            + " WHERE CODIGO = ? ";
    private static final String SQL_DELETE = "DELETE FROM FUNCIONARIO WHERE CODIGO = ?";
    private static final String SQL_QUERY_ALL = "SELECT CODIGO, NOME, SALARIO FROM FUNCIONARIO";
    private static final String SQL_QUERY_ONE = "SELECT CODIGO, NOME, SALARIO FROM FUNCIONARIO WHERE CODIGO = ?";

    private Connection con;

    public FuncionarioDAO() {
        String url = "jdbc:mysql://localhost:3306/HR?useTimezone=true&serverTimezone=UTC";
        String username = "root";
        String password = "oracle_4U";
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Erro ao obter conexão com o MySQL ! " + ex.getMessage());
        }//fim try
    }//fim metodo

    @Override
    public void salvar(Funcionario f) throws DAOException {
        try (PreparedStatement stmt = con.prepareStatement(SQL_INSERT)) {
            stmt.setString(1, f.getNome());
            stmt.setDouble(2, f.getSalario());
            if (stmt.executeUpdate() != 1) {
                throw new DAOException("Erro ao inserir. Retorno != 1.");
            }
        } catch (SQLException e) {
            throw new DAOException("Erro ao inserir. " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Funcionario f) throws DAOException {
        try (PreparedStatement stmt = con.prepareStatement(SQL_UPDATE)) {
            stmt.setString(1, f.getNome());
            stmt.setDouble(2, f.getSalario());
            stmt.setInt(3, f.getCodigo());
            if (stmt.executeUpdate() != 1) {
                throw new DAOException("Erro ao atualizar. Retorno != 1.");
            }
        } catch (SQLException e) {
            throw new DAOException("Erro ao atualizar. " + e.getMessage());
        }
    }

    @Override
    public boolean excluir(Funcionario t) throws DAOException {
        try (PreparedStatement stmt = con.prepareStatement(SQL_DELETE)) {
            stmt.setInt(1, t.getCodigo());
            return stmt.execute();
        } catch (SQLException ex) {
            throw new DAOException("Erro ao excluir! " + ex.getMessage());
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
            }
            return f;
        } catch (SQLException ex) {
            throw new DAOException("Erro ao buscar por ID! " + ex.getMessage());
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
            }
            return fs;
        } catch (SQLException ex) {
            throw new DAOException("Erro ao buscar TODOS! " + ex.getMessage());
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
                .codigo(rs.getInt("CODIGO"))
                .nome(rs.getString("NOME"))
                .salario(rs.getDouble("SALARIO"))
                .build();
    }
}
