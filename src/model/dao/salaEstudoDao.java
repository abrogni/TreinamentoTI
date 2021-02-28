package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.SalaEstudo;

public class salaEstudoDao {

    public void create(SalaEstudo se){
        Connection cone = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        try {
            stmt = cone.prepareStatement("INSERT INTO salaCafe (nome, lotacao)VALUES(?,?)");
            stmt.setString(1,se.getNomeSala());
            stmt.setInt(2,se.getLotacao());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR"+ex);
        } finally {
            ConnectionFactory.closeConnection(cone, stmt);
        }
    }
}
