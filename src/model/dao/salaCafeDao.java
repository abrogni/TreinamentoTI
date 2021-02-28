package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.SalaCafe;

public class salaCafeDao {
    
    public void create(SalaCafe sc){
        Connection conc = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        try {
            stmt = conc.prepareStatement("INSERT INTO salaCafe (nome, lotacao)VALUES(?,?)");
            stmt.setString(1,sc.getNomeSala());
            stmt.setInt(2,sc.getLotacao());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR"+ex);
        } finally {
            ConnectionFactory.closeConnection(conc, stmt);
        }
    }
}
