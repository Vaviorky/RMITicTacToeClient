import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PlayerInterface extends Remote, Observator {
    
    public void setName(String n) throws RemoteException;
    public String getName() throws RemoteException;
    public void setSymbol(String s) throws RemoteException;
    public String getSymbol() throws RemoteException;
    public void setMyTurn(boolean b) throws RemoteException;
    public void printGameInfo(String info) throws RemoteException;
            
}
