package ba.bitcamp.exercise.Benjo.serversocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static final int PORT = 4255;

	public static void startServer() {
		try {
			ServerSocket server = new ServerSocket(PORT);
			

			while (true) {
				System.out.println("waiting for user to connect..");
				Socket user = server.accept();
				ReadAndWriteMessage rawm =  new ReadAndWriteMessage (user.getInputStream(), user.getOutputStream());
				Scanner scan =  new Scanner(System.in);
				String msg = scan.nextLine();	
				
				while ( true){
					String msgServer = printNum();
					rawm.sendMessage(msgServer);
					user.close();
				}
				

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String printNum(){
		String str ="";
		for (int i=0; i<30; i++){
			str += i+ ", ";
		}
		return str;
	}
	
	public static void main(String[] args) {
		startServer();
	}

}
