package btl_store.controller;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface IRMIControllerServer extends Remote{
    public long addCustomer(String name, String addr, String phone, Date birth) throws RemoteException;
    public int updateCustomer(String name, String addr, String phone, Date birth,long id) throws RemoteException;
    public int deleteCustomer(Long id) throws RemoteException;
    public long addItem(String name, String type, String status, long cost) throws RemoteException;
    public long updateItem(String name, String type, String status,long cost,long id) throws RemoteException;
    public int deleteItem(Long id) throws RemoteException;
}
