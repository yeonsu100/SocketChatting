package test.main;

import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ServerMain {
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			// 5000번 port를 사용할 준비를 한다.
			serverSocket=new ServerSocket(5000);
			System.out.println("클라이언트의 연결요청을 대기중입니다...");
			while(true) {
				// 5000번 port의 연결 요청을 기다린다. (클라이언트가 접속 요청을 하기 전까지는 블록킹 되어있다)
				socket=serverSocket.accept();
				// 접속된 클라이언트의 ip 주소 얻어오기
				String ip=socket.getInetAddress().getHostAddress();
				System.out.println("접속된 클라이언트의 ip: "+ip);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
				if(socket!=null)socket.close();
			}catch(Exception e) {}
		}
		System.out.println("ServerMain main() 메소드가 종료됩니다.");
	}
}
