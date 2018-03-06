package galgeleg;

import java.net.MalformedURLException;
import java.net.NotBoundException;
import java.net.RemoteException;
import javax.xml.ws.Endpoint;

public class GalgeServer {

    public static void Main(String[] arg)throws RemoteException, MalformedURLException, NotBoundException{

        Galgelogik spil = new Galgelogik();

        try {
            spil.hentOrdFraDr();

        }catch (Exception e){

            e.printStackTrace();


        }
        Endpoint.publish(""http://[::]:8080/galgele", spil);

        System.out.println("starter server!")

                spil.reset();
    }


}
