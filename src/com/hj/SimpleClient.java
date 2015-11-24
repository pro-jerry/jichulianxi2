package com.hj;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		
		Socket s1 = new Socket("localhost",8000);
		System.out.println("第一次连接成功");
		
		Socket s2 = new Socket("localhost",8000);
		System.out.println("第2次连接成功");
		
		Socket s3 = new Socket("localhost",8000);
		System.out.println("第3次连接成功");
	}
	
}
