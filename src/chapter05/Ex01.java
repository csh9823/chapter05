package chapter05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception{
		
		
		InputStream in = new FileInputStream("E:\\javaStudy\\file\\img.jpg");
		
		OutputStream out  = new FileOutputStream("E:\\javaStudy\\file\\byteimg.jpg");
		
		byte[] buff = new byte[1024];
		 
		System.out.println("복사시작");
		 while(true) {
			  int data = in.read(buff);
			  
			  if(data == -1) {
				  System.out.println("복사가 완료되었습니다.");
				  break;
			  }
			  out.write(buff);
		 }
		 
		 
			 
		 
		 
		 
		 /*
		System.out.println("복사시작");
		while(true) {
			
			int data = in.read();
			
			System.out.println(data);
			
			if(data == -1) //-1이 종료 코드 음수가 제일 마지막에 옴 {
				System.out.println("복사가 완려되었습니다." + data);
				break;
			}
			
			out.write(data);
			*/
		
		in.close();
		out.close();
		
	}

}
