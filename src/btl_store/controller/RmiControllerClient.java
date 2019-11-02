/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_store.controller;
import btl_store.controller.IRMIControllerServer;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tony-Tuan
 */
public class RmiControllerClient {
    private static String serverHost = "localhost";
    private static int serverPort = 2019;
    private static IRMIControllerServer rmiServer;
    private static Registry registry;
    private static String rmiService = "rmiService";

    public static IRMIControllerServer getServiceRMI() throws NotBoundException {
        try {
            registry = LocateRegistry.getRegistry(serverHost, serverPort);
            rmiServer = (IRMIControllerServer)registry.lookup(rmiService);
            return rmiServer;
        } catch (RemoteException ex) {
            Logger.getLogger(RmiControllerClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
