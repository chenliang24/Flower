package com.binaryIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Shuru {

	public static void main(String[] args) throws IOException {
		DataOutputStream is= new DataOutputStream(new FileOutputStream("C:\\aeclipse,��Ŀ\\java��Ŀ\\aa.txt"));
        is.writeDouble(33.33);
        is.writeBoolean(true);
        is.close();
        
        
		DataInputStream input = new DataInputStream(new FileInputStream("C:\\aeclipse,��Ŀ\\java��Ŀ\\aa.txt"));
        System.out.println(input.readDouble());
         System.out.println(input.readBoolean());
        input.close();
		
	}

}
