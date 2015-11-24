package com.hj;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScanner {

	public static void main(String[] args) throws UnknownHostException {
		
		String host = "localhost";
		if(args.length>0)
			host = args[0];
		InetAddress addr1 = InetAddress.getLocalHost(); 
//		new PortScanner().scan(host);
	}

	private void scan(String host) {

		Socket socket = null;
		for(int port=1;port<1024;port++){
			
			try {
				
				socket =new Socket(host, port);
				System.out.println("There is a server on port"+port);
			} catch (IOException e) {

				System.out.println("Can't connect to port "+port);
				
			}finally{
				
				try {
					
					if(socket!=null){
						socket.close();
					}
				} catch (Exception e2) {

					e2.printStackTrace();
				}
			}
		}
	}
}
