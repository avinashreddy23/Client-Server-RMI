package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ChatServerDriver {
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		//Setting java.rmi.server.hostname property to local host 
		//so clients can reach rmiregistry over the network.
		System.setProperty("java.rmi.server.hostname","localhost");
		Naming.rebind("RMIChatServer", new ChatServer());
		
	}

}
