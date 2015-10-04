package Conexao;

import java.sql.*;
import javax.swing.*;

public class ConexaoFuncionario {

    private Connection con;
    private Statement stm;
    private ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    public String url = "jdbc:mysql://192.168.1.108:3306/enfersystem";
    public String user = "root";
    public String password = "";
    public String registro, nome, cargo, especialidade;

    public void Conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na conexão !\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void InserirFuncionario(int funcional, String registro, String nome, String cargo, String especialidade) {
        try {
            Conectar();
            stm = con.createStatement();
            stm.executeUpdate("insert into enfer_funcionario values('" + funcional + "','" + registro + "','" + nome + "','" + cargo + "','" + especialidade + "')");
            con.close();
            stm.close();
            JOptionPane.showMessageDialog(null, "Funcionario " + funcional + "\ncadastrado com sucesso !", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void inserirLoginSenha(int funcional, String senha) {
        try {
            Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from enfer_funcionario where id_func = '" + funcional + "'");
            int result = 0;
            while (rs.next()) {
                result = 1;
                rs.getInt("id_func");
            }
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Funcionario não cadastrado !", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
                    Conectar();
                    stm = con.createStatement();
                    stm.executeUpdate("insert into enfer_login_senha values ('" + funcional + "','" + senha + "')");
                    con.close();
                    stm.close();
                    JOptionPane.showMessageDialog(null, "Login e senha cadastrados com sucesso !", "Cadastrado", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluirLoginSenha(int funcional, String senha) {
        try {
            Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from enfer_login_senha where id_func ='" + funcional + "' and senha = '" + senha + "'");
            int result = 0;
            while (rs.next()) {
                result = 1;
                rs.getInt("id_func");
                rs.getString("senha");
            }
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta(s) para\n executar este evento !", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este login e senha ?", "Escolha uma das opções", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    try {
                        Conectar();
                        stm = con.createStatement();
                        stm.executeUpdate("delete from enfer_login_senha where id_func = '" + funcional + "'");
                        con.close();
                        stm.close();
                        JOptionPane.showMessageDialog(null, "Login e senha excluidos com sucesso !", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarLoginSenha(int funcional, String senhaAnterior, String novasenha) {
        try {
            Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from enfer_login_senha where id_func ='" + funcional + "' and senha = '" + senhaAnterior + "'");
            int result = 0;
            while (rs.next()) {
                result = 1;
                rs.getInt("id_func");
                rs.getString("senha");
            }
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha anterior incorreta para\n executar este evento !", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar senha ?", "Escolha uma das opções", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resp == JOptionPane.YES_OPTION) {
                    try {
                        Conectar();
                        stm = con.createStatement();
                        stm.executeUpdate("update enfer_login_senha set senha = '" + novasenha + "' where id_func = '" + funcional + "'");
                        con.close();
                        stm.close();
                        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso !", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultarFuncionario(int funcional) {
        try {
            Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from enfer_funcionario where id_func = '" + funcional + "'");
            int result = 0;
            while (rs.next()) {
                result = 1;
                registro = rs.getString("registro");
                nome = rs.getString("nome");
                cargo = rs.getString("cargo");
                especialidade = rs.getString("especialidade");
            }
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Funcionario não cadastrado !", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarFuncionario(int funcional, String nome, String carg, String especial) {
        try {
            Conectar();
            stm = con.createStatement();
            stm.executeUpdate("update enfer_funcionario set nome = '" + nome + "', cargo = '" + carg + "', especialidade = '" + especial + "' where id_func = '" + funcional + "'");
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso !", "Alteração", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void excluirFuncionario2(int funcional) {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este funcionário ?", "Escolha uma das opções", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resp == JOptionPane.YES_OPTION) {
            try {
                Conectar();
                stm = con.createStatement();
                stm.executeUpdate("delete from enfer_funcionario where id_func = '" + funcional + "'");
                JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso !", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
                con.close();
                stm.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void excluirFuncionario1(int funcional) {
        try {
            Conectar();
            stm = con.createStatement();
            stm.executeUpdate("delete from enfer_login_senha where id_func = '" + funcional + "'");
            con.close();
            stm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultarMedico(int funcional) {
        try {
            Conectar();
            stm = con.createStatement();
            rs = stm.executeQuery("select * from enfer_funcionario where id_func = '" + funcional + "' and cargo = 'MÉDICO(A)'");
            int result = 0;
            while (rs.next()) {
                result = 1;
                nome = rs.getString("nome");
            }
            if (result == 0) {
                JOptionPane.showMessageDialog(null, "Funcionario não cadastrado !", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
            con.close();
            stm.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado !\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
