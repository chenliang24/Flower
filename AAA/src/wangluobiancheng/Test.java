package wangluobiancheng;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Test {
	//http://news.baidu.com/   
	public static void main(String[] args){
		System.out.println("������ַ��");
		@SuppressWarnings("resource")
		String s = new Scanner(System.in).next();
		
		
		try {
			URL url = new URL(s);
			int count=0;
			int count2=0;
			Scanner input=new Scanner(url.openStream());
			while(input.hasNext()){
				String line=input.nextLine();
				System.out.println(line);
				count+=line.length();
				count2+=1;
			}
			System.out.printf("һ��"+count+"���ֽ�\n һ��%d��",count2);
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}catch (IOException ex) {
			
			ex.printStackTrace();
		}
		
	/*	File file = new File("tt.txt");
		file.delete();
		if(file.exists()){
			System.out.println("���ļ��Ѿ�����");
			System.exit(1);
		}
		try(PrintWriter output = new PrintWriter(file);
				Scanner input = new Scanner(new File("aa.txt"))){
			while(input.hasNextLine()){
				output.println(input.nextLine());
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}
}
