package com.hj;

import java.io.IOException;
import java.net.ServerSocket;

public class SimpleServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ServerSocket serverSocket = new ServerSocket(8000,3);
		Thread.sleep(360000);
	}
}
