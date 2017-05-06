package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Uslugi;



public class UslugiDao implements Dao<Uslugi>{

     private final Connection con;
     public UslugiDao(Connection con) {
          this.con = con;
     }
    @Override
    public Integer create(Uslugi entity) {
       String sql = "INSERT INTO `komp_firma`.`usluga` (`name`, `opisanie`, `stoimost`) VALUES (?, ?, ?);";
         try (PreparedStatement st = con.prepareStatement(sql);) {
             st.setString(1, entity.getName());
             st.setString(2, entity.getOpisanie());
             st.setFloat(4, entity.getStoimost());
             st.execute();
             ResultSet keys;
             keys = st.getGeneratedKeys();
             
             Integer id = null;
             if (keys.next()) {
                 id = keys.getInt(1);
             }
             st.close();
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
         return null;
    }

    @Override
    public Uslugi read(Integer id) {
        Uslugi d = null;
        String sql ="SELECT * FROM uslugi WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
             if (rs.next())
                 d = new Uslugi();
                 d.setId(rs.getInt("id"));
                 d.setName(rs.getString("name"));
                 d.setOpisanie(rs.getString("opisanie"));
                 d.setStoimost(rs.getFloat("stoimost"));
        } catch (SQLException e) {
             e.printStackTrace();
         }
         return d;
    }

    @Override
    public List<Uslugi> readAll() {
        List<Uslugi> uslugi = new ArrayList<>();
        String sql ="SELECT * FROM uslugi";
        try (Statement st = con.createStatement();) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Uslugi d = new Uslugi();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOpisanie(rs.getString("opisanie"));
                d.setStoimost(rs.getFloat("stoimost"));
                uslugi.add(d);                
            }
        } catch (SQLException ex) {
             ex.printStackTrace();
         }
         return uslugi;
    }

    @Override
    public void update(Uslugi entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delite(Uslugi entity) {
        String sql = "DELITE FROM dolzhnost WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, entity.getId());
            st.execute();
        } catch (Exception ex) {
             ex.printStackTrace();
         }
    }
    
}
