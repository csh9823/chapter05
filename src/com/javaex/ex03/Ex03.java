package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream is = new FileInputStream("E:\\javaStudy\\file\\MS949.txt"); //컴퓨터 언어로 읽어준다
		InputStreamReader isr = new InputStreamReader(is,"MS949"); // "MS949" "UTF-8" 에 의미는 텍스트 파일 문자 해석 코드
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();
	}

}
