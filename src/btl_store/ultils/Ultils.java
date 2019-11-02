/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.ultils;

import btl_store.dbconnection.DBConnection;
import btl_store.mapper.RowMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tony-Tuan
 */
public class Ultils {

    public static void setParameter(PreparedStatement preparedStatement, Object... parameter) {
        try {
            for (int i = 0; i < parameter.length; i++) {
                Object param = parameter[i];
                if (param instanceof Integer) {
                    preparedStatement.setInt(i + 1, (int) param);
                } else {
                    if (param instanceof String) {
                        preparedStatement.setString(i + 1, (String) param);
                    } else {
                        if (param instanceof Float) {
                            preparedStatement.setFloat(i + 1, (float) param);
                        } else {
                            if (param instanceof Timestamp) {
                                preparedStatement.setTimestamp(i + 1, (Timestamp) param);
                            } else {
                                if (param instanceof Long) {
                                    preparedStatement.setLong(i+1, (long) param);
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ultils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static <T> List<T> query(String sql, RowMapper<T> mapRow, Object... parameter){
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement prepareStatement = conn.prepareStatement(sql);
            setParameter(prepareStatement, parameter);
            ResultSet resultSet = prepareStatement.executeQuery();
            return mapRow.rowMapper(resultSet);
            
        } catch (SQLException ex) {
            Logger.getLogger(Ultils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
