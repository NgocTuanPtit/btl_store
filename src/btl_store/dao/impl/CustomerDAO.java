
package btl_store.dao.impl;

import btl_store.dao.GenericDAO;
import btl_store.dbconnection.DBConnection;
import btl_store.ultils.Ultils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tony-Tuan
 */
public class CustomerDAO implements GenericDAO{

    @Override
    public long add(Object... parameter) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO customer (name,address,phone,birthday) VALUES (?,?,?,?)";
            PreparedStatement prepareStatement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            Ultils.setParameter(prepareStatement, parameter);
            prepareStatement.executeUpdate();
            ResultSet result = prepareStatement.getGeneratedKeys();
            if(result.next()){
                return result.getLong(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int update(Object... parameter) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "UPDATE customer SET name=?, address=?, phone=?, birthday=? WHERE id=?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            Ultils.setParameter(prepareStatement, parameter);
            prepareStatement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(Object... parameter) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "DELETE FROM customer WHERE id=?";
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            Ultils.setParameter(prepareStatement, parameter);
            prepareStatement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(ItemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
