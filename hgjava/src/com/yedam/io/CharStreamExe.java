package com.yedam.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// 문자기반 입출력.
		try {
			FileReader fr = new FileReader("c:/temp/text.dat");
			BufferedReader br = new BufferedReader(fr);
		while(true) {	
			String read = br.readLine(); // 한라인씩
			if(read == null) { // eof => null 반환.
				break;
			}
			System.out.println(read);
		}
		br.close();
		fr.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end of prog.");
	}

	static void read() {
		// 문자기반 입출력.
		Class cls = CharStreamExe.class;
		String path = cls.getResource("ByteStreamExe.class").getPath();
		System.out.println(path);
		path = "C:/Users/admin/git/hgjava/hgjava/src/com/yedam/io/ByteStreamExe.java";

		try {
			FileReader fr = new FileReader(path);
			while (true) {
				int read = fr.read(); // 한캐릭터씩씩읽어들이겠다
				if (read == -1) {
					break;
				}
				System.out.print((char) read);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void write() {
		// 문자기반 입출력.
		try {
			FileWriter fw = new FileWriter("c:/temp/text.dat");
			while (true) {
				System.out.println("입력>> ");
				String str = scn.nextLine();
				if (str.equals("stop")) {
					break;
				}
				fw.write(str + "\n");
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} // end of class
