package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[]args) throws IOException{
		
		
		Scanner sc = new Scanner(System.in);
		Reader fr = new FileReader("E:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
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
			System.out.println("회사 : " + company);
			System.out.println("");
		}
		sc.close();
		br.close();
	}

}
