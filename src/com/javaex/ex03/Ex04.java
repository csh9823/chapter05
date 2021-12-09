package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		InputStream is = new FileInputStream("E:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is,"UTF-8"); //  
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] db = str.split(",");
			String name = db[0];
			String hp = db[1];
			String company = db[2];
			System.out.println("이름 : "+name);
			System.out.println("핸드폰 : "+hp);
			System.out.println("회사" + company);
			System.out.println("");
		}
		br.close();
		sc.close();

	}

}
