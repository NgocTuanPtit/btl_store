/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.mapper;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Tony-Tuan
 */
public interface RowMapper<T>{
    public List<T> rowMapper(ResultSet resultSet);
}
