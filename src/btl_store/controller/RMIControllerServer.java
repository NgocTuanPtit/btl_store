
package btl_store.controller;
import btl_store.dao.impl.CustomerDAO;
import btl_store.dao.impl.ItemDAO;
import btl_store.dbconnection.DBConnection;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Tony-Tuan
 */
public class RMIControllerServer extends UnicastRemoteObject implements IRMIControllerServer{

    private final int port = 2019;
    private Registry registry;
    private Connection connection;
    private String rmiService = "rmiService";
    private CustomerDAO customerDAO;
    private ItemDAO itemDAO;
    
    public RMIControllerServer() throws RemoteException {
        connection = DBConnection.getConnection();
        registry = LocateRegistry.createRegistry(port);
        registry.rebind(rmiService, this);
        customerDAO = new CustomerDAO();
        itemDAO = new ItemDAO();
    }

    @Override
    public long addCustomer(String name, String addr, String phone, Date birth) throws RemoteException {
        return customerDAO.add(name, addr, phone, birth);
    }

    @Override
    public int updateCustomer(String name, String addr, String phone, Date birth, long id) throws RemoteException {
        return customerDAO.update(name, addr, phone, birth, id);
    }

    @Override
    public int deleteCustomer(Long id) throws RemoteException {
        return customerDAO.delete(id);
    }

    @Override
    public long addItem(String name, String type, String status, long cost) throws RemoteException {
        return itemDAO.add(name, type, status, cost);
    }
    
    @Override
    public long updateItem(String name, String type, String status, long cost, long id) throws RemoteException {
        return itemDAO.update(name, type, status, cost, id);
    }

    @Override
    public int deleteItem(Long id) throws RemoteException {
        return itemDAO.delete(id);
    }
    
    public static void main(String[] args) throws RemoteException {
        RMIControllerServer rmi = new RMIControllerServer();
    }
    
}
