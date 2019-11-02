/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.dao;

/**
 *
 * @author Tony-Tuan
 */
public interface GenericDAO {
    public long add(Object... parameter);
    public int update(Object... parameter);
    public int delete(Object... parameter);
}
