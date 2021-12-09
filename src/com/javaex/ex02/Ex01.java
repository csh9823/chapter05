package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[]ages) throws IOException{
		
		InputStream in = new FileInputStream("E:\\javaStudy\\file\\img.jpg"); //in에 파일 위치를 입력
		BufferedInputStream bin = new BufferedInputStream(in); //bin에 복사할 파일위치를 알려주고 파일을 읽어(넣어)주는 역할
		
		OutputStream out = new FileOutputStream("E:\\javaStudy\\file\\buff2img.jpg"); // 복사 파일을 넣어주는 위치와 복사파일 이름을 oit에 넣어줌
		
		BufferedOutputStream bout = new BufferedOutputStream(out); // bout에 out의 복사 할 위치와 이름을 받고  복사 해서 배출해 주는 역할
		
		while(true) {
			
			int data = bin.read(); //읽어와라
			
			if(data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				break;
			}
			bout.write(data); // 불러와라
		}
		bin.close();
		bout.close();
	}
}
