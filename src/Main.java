import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by cyprien on 23/02/16.
 */
public class Main {
    public static void main (String[] args) {
        try{
            String serveur="localhost";
            int port=1099;

            if( args.length > 0 )
                serveur=args[0];
            if( args.length > 1 )
                port=Integer.parseInt(args[1]);

            Registry rg = LocateRegistry.getRegistry(serveur,port);



            TableauBlanc tableau = new TableauBlanc();
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }
}