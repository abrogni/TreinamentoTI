package connection;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://3306/treinamentoti";
    private final static String USER = "root";
    private final static String PASS = "";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: " + ex);
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR" + ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stnt) {
        closeConnection(con);
        try {
            if (stnt != null) {
                stnt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stnt, ResultSet rs) {
        closeConnection(con, stnt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class).log(Level.SEVERE, null, ex);
        }
    }

}
