package ba.bitcamp.exercise.Benjo.serversocket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class User {

	public static final String serverAddress = " 127.0.0.1";
	public static final int PORT = 4255;

	public static void connectToServer() throws UnknownHostException,
			IOException {
		Socket user = new Socket(serverAddress, PORT);
		ReadAndWriteMessage rawm =  new ReadAndWriteMessage (user.getInputStream(), user.getOutputStream());
		Scanner scan =  new Scanner(System.in);
		while ( true){
			String msg = rawm.recieveMessage();
			System.out.println("Message recieved : ");
			System.out.println(msg);
			user.close();
		}
	}
	
	public static void main(String[] args) {
		try {
			connectToServer();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
