package com.ext4;

import java.io.*;
import java.net.Socket;

public class Client {
	public static void main(String args[]) {
		String msg = "Client Data";
		try {
			// ����һ��Socket����������8080�˿�����
			Socket socket = new Socket("127.0.0.1", 8080);
			// ʹ��Socket����PrintWriter��BufferedReader���ж�д����
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader is = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			// ��������
			pw.println(msg);
			pw.flush();
			// ��������
			String line = is.readLine();
			System.out.println("received from server: " + line);
			// �ر���Դ
			pw.close();
			is.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}