/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.mapper;

import btl_store.model.Customer;
import btl_store.model.Item;
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
public class ItemMapper implements RowMapper<Item>{
    List<Item> lists = new ArrayList<>();
    @Override
    public List<Item> rowMapper(ResultSet resultSet) {
        try {
            while(resultSet.next()){
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                String image = resultSet.getString("image");
                String status = resultSet.getString("status");
                long cost = resultSet.getLong("cost");
                Item item = new Item(id, name, type, image, status, cost);
                lists.add(item);
            }
            return lists;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
