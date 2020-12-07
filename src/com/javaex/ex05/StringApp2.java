package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 메소드
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//concat은 문자열을 합쳐줌.
		System.out.println(a.concat(b));
		System.out.println(a);  //a변하지 않음
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim()  --> 공백을 없애줌.
		a = a.trim();
		System.out.println(a);
		System.out.println("__" + a + "__");	//공백확인용
		
		//갖고있는 문자열을 바꿔치기해주는 replace()
		a = a.replace("c", "123");
		System.out.println(a);
		
		System.out.println("=================================");
		
		String[] sArray = a.split(","); //,를 기준으로 잘라달라. 
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str = "Hello java";
		
		String result01 = str.substring(3);  //substring()은 [3]방부터 끝까지 출력
		System.out.println(result01);
		System.out.println(str);
		
		String result02 = str.substring(3, 7);  
		System.out.println(result02);
		
		char c = str.charAt(1);
		System.out.println(c);
		
		String c2 = str.substring(1, 2);
		System.out.println(c2);
	}

}
