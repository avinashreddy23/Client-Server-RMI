package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import client.ChatClientInterface;

public interface ChatServerInterface extends Remote {
	void registerChatClient(ChatClientInterface chatClient) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
	

}
