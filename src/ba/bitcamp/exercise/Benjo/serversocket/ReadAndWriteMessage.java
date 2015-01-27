package ba.bitcamp.exercise.Benjo.serversocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadAndWriteMessage {

	private InputStream in;
	private OutputStream out;

	public ReadAndWriteMessage(InputStream in, OutputStream out) {
		this.in = in;
		this.out = out;

	}

	public String recieveMessage() {
		String recieveMsg = "";

		try {
			int msgLength = in.read();
			byte[] buffer = new byte[msgLength];
			StringBuilder sb = new StringBuilder();
			int num = 0;
			while ((num += in.read(buffer)) > 0) {
				sb.append(new String(buffer).replaceAll("\\s+", " "));

				if (num >= msgLength) {
					break;
				}
				recieveMsg = sb.toString();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recieveMsg;
	}

	public void sendMessage(String msg) {

		try {

			byte[] buffer = msg.getBytes();
			out.write(buffer.length);

			out.write(buffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
