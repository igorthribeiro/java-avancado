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