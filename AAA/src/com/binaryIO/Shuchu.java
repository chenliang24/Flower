package com.binaryIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Shuchu {

	public static void main(String[] args) {
		
		try (OutputStream is = new FileOutputStream(
			 "C:\\aeclipse\\java��Ŀ\\Test\\aa.txt",true)) {//��true������ԭ�ı���׷������
            is.write('h');
            byte[] buffer={'a','b','c','d','e','f','g','h'};
            is.write(buffer);
            is.write(buffer,2, 5);
            String s ="qwer";
            is.write(s.getBytes()); //getBytes()������һ��String����ת��Ϊһ��Byte����
            	
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	    
	}
}
