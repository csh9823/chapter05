package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		
		//파일 읽는 법
		Reader fr = new FileReader("E:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine(); //한줄 씩 읽기  -->줄바꿈기호는 제외 기본적으로 4번 출력 5번째는 빈값
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
	}

}
