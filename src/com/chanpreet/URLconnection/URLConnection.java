package com.chanpreet.URLconnection;

import java.io.InputStream;
import java.net.URL;

public class URLConnection {

	public static void main(String[] args) {
		try{  
			URL url=new URL("https://www.google.com/");  
			java.net.URLConnection urlcon=url.openConnection();  
			InputStream stream=urlcon.getInputStream();  
			int i;  
			while((i=stream.read())!=-1){  
			System.out.print((char)i);  
			}  
			}catch(Exception e){System.out.println(e);}  
	}

}
