package test.main;

import java.io.IOException;
import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			socket=new Socket("192.168.0.2", 5000);
			System.out.println("Socket 연결 성공!");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(socket!=null)socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
