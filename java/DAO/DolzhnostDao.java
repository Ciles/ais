
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
import model.Dolzhnost;


public class DolzhnostDao implements Dao<Dolzhnost>{
    
    private final Connection con;

    public DolzhnostDao(Connection con) {
        this.con = con;
    }
    
    

    @Override
    public Integer create(Dolzhnost entity) {
        String sql = "INSERT INTO `komp_firma`.`dolzhnost` (`name`, `oklad`, `obrazovanie`, `trebovania`) VALUES (?, ?, ?, ?);";
        
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObyazannost());
            st.setString(4, entity.getObrazovanie());
            st.setString(5, entity.getTrebovaniya());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);            
          } catch (SQLException ex) {
            ex.printStackTrace();
          }
          return null;
        }

    @Override
    public Dolzhnost read(Integer id) {
        Dolzhnost d = null;
        String sql ="SELECT * FROM dolzhnost WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next())
                d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObyazannost(rs.getString("obyazannost"));
                d.setObrazovanie(rs.getString("obrazovanie"));
                d.setTrebovaniya(rs.getString("trebovaniya"));

        } catch (SQLException e) {
             e.printStackTrace();
                }
               
        return d;
    }

    @Override
    public List<Dolzhnost> readAll() {
        List<Dolzhnost> dolzhnosti = new ArrayList<>();
        String sql ="SELECT * FROM dolzhnost";
        try (Statement st = con.createStatement();) {
              ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Dolzhnost d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObyazannost(rs.getString("obyazannost"));
                d.setObrazovanie(rs.getString("obrazovanie"));
                d.setTrebovaniya(rs.getString("trebovaniya"));
                dolzhnosti.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return dolzhnosti;
    }
        

    @Override
    public void update(Dolzhnost entity) {
        String sql = "UPDATE `komp_firma`.`dolzhnost` SET (`name`, `oklad`, `obrazovanie`, `trebovania`) VALUE (?, ?, ?, ?) WHERE id =?;";
    try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObyazannost());
            st.setString(4, entity.getObrazovanie());
            st.setString(5, entity.getTrebovaniya());
            st.setInt(6, entity.getId());
            st.executeUpdate();
                      
          } catch (SQLException ex) {
            ex.printStackTrace();
          }
    }

    @Override
    public void delite(Dolzhnost entity) {
        String sql = "DELITE FROM dolzhnost WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);) {
         st.setInt(1, entity.getId());
         st.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    }

 

