package test.main2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		System.out.println("서버에 전송할 문자열: ");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		Socket socket=null;
		try {
			// new Socket (접속할  ip address, port number)
			socket=new Socket("192.168.0.2", 5000);
			System.out.println("Socket 연결 성공!");
			
			// 서버에 출력할 수 있는 객체의 참조값 얻어오기
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			
			bw.write(msg);		// 문자열을 서버에 출력하기
			bw.newLine();		// 개행기호 출력
			bw.flush();			// 밀어내기
			
			// 서버로부터 입력받을 객체
			InputStream is=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			//서버가 출력한 문자열 읽어들이기
			String fromServer=br.readLine();
			//출력하기
			System.out.println("From Server: "+fromServer);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if(socket!=null)socket.close();
				} catch (Exception e) {}
			System.out.println("ClientMain main() 메소드가 종료 됩니다.");	
		}
	}
}
