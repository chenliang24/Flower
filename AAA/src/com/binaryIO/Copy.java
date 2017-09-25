package com.binaryIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		if(args.length!=2){
			System.out.println("������Ҫ�����ļ���");
			System.exit(1);
		}
		File source = new File(args[0]);
		if(!source.exists()){
			System.out.println("ԭ�ļ������ڣ�");
			System.exit(2);
		}
		File targetFile = new File(args[1]);
		if(targetFile.exists()){
			System.out.println("Ŀ���ļ��Ѵ���");
			System.exit(3);
		}
		
		try(BufferedInputStream input = 
				new BufferedInputStream(new FileInputStream(source));
				
			BufferedOutputStream output =
				new BufferedOutputStream(new FileOutputStream(targetFile));	
		){
			int r, o=0;
			while((r=input.read()) != -1){
				output.write((char)r);
				o++;
			}
			
			System.out.printf("������%d���ֽ�",o);
			
			
		}
		
		
	}
		
	
	

	
}
