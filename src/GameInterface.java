import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GameInterface extends Remote, Observer {
    public boolean addPlayer(PlayerInterface player) throws RemoteException;
    public void removePlayer(PlayerInterface player) throws RemoteException;
    public PlayerInterface findPlayer(PlayerInterface player) throws RemoteException;
    public String getFreeSymbol() throws RemoteException;
    public String getGameInfo() throws RemoteException;
    public boolean WAITING() throws RemoteException;
    public boolean PLAYING() throws RemoteException;
    
    public PlayerInterface getActualPlayer() throws RemoteException;
    public String[] getFields() throws RemoteException;
    public void setField(int i) throws RemoteException;
    public void setNextPlayer() throws RemoteException;
}
