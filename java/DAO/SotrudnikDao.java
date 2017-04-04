package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Sotrudnik;


public class SotrudnikDao implements Dao<Sotrudnik> {

    private final Connection con;

    public SotrudnikDao(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Sotrudnik entity) {
        String sql = "INSERT INTO `komp_firma`.`sotrudnik` (`fio`, `date`, `pol`, `addres`, `telephone`, `pasport`, `dolozhnost`) VALUES (?, ?, ?, ?, ?, ?, ?);";
        try (PreparedStatement stmt = con.prepareStatement(sql);) { 
             
             stmt.setString(1, entity.getFio());
             stmt.setDate(2, new java.sql.Date(entity.getRozdenie().getTime()));
             stmt.setInt(3, entity.getPol());
             stmt.setString(4, entity.getAddres());
             stmt.setString(5, entity.getTelephone());
             stmt.setInt(6, entity.getPasport().getId());
             stmt.setInt(7, entity.getDolznost().getId());
             stmt.execute();
             ResultSet keys = stmt.getGeneratedKeys();
              int id;
              Integer id = null;
              if (keys.next()) {
                  id = keys.getInt(1)
                          }
             stmt.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(SotrudnikDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Sotrudnik read(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sotrudnik> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Sotrudnik entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delite(Sotrudnik entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
