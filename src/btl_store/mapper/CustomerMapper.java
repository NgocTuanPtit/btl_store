/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.mapper;

import btl_store.model.Customer;
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
public class CustomerMapper implements RowMapper<Customer>{
    List<Customer> lists = new ArrayList<>();
    @Override
    public List<Customer> rowMapper(ResultSet resultSet) {
        try {
            while(resultSet.next()){
                long id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String addr = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                Timestamp timestamp = resultSet.getTimestamp("birthday");
                Date date = new Date(timestamp.getTime());
                Customer c = new Customer(id, name, phone, date, addr);
                lists.add(c);
            }
            return lists;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
