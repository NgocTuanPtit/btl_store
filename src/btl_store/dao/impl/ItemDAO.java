/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class ItemDAO implements GenericDAO{
    
    @Override
    public long add(Object... parameter) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO item (name,type,status,cost) VALUES (?,?,?,?)";
            PreparedStatement prepareStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
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
            String sql = "UPDATE item SET name=?, type=?, status=?, cost=? WHERE id=?";
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
            String sql = "DELETE FROM item WHERE id=?";
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
