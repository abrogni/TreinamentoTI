package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Participante;

public class participanteDao {
    
    public void create(Participante p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt =null;
        try {
            stmt = con.prepareStatement("INSERT INTO pessoas (codigo, nome, sobreNome)VALUES(?,?,?)");
            stmt.setInt(1,p.getId());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getSobrenome());
            
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR"+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
