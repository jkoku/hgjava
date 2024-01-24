package com.yedam.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassExe {
	public static void main(String[] args) throws FileNotFoundException {
		Class cls = String.class;
		String str = "";
		cls = str.getClass();

		try {
			cls = Class.forName("com.yedam.api.Member");			
		}catch(ClassNotFoundException e){
							
		}	
			// 특별히 기능구현하기보다 정보확인용.
			// 해당클래스에 메소드 확인.
			Method[] methods = cls.getDeclaredMethods();
			for(Method method : methods) {
				System.out.println(method.getName()); 
			}
			// 해당클래스에 필드 확인. 
			Field[] fields = cls.getDeclaredFields(); // 정의되어진 필드들을 볼 수 있따		
			for(Field Field : fields) {
				System.out.println(Field.getName());
			}
	
			// 경로정보.
			String path = cls.getResource("sample.txt").getPath(); // cls를 기준으로 상대경로를 가져옴.
			System.out.println(path);
			
			Scanner scn = new Scanner(new File(path)); //import 후 throw
			System.out.println(scn.nextLine());
	}
}
