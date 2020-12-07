package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n01 = new Integer(23);
		Integer n02 = new Integer(100);
		
		Integer sum = n01 + n02;
		System.out.println(sum);
		
		Integer sum2 = new Integer(50) + new Integer(51);
		System.out.println(sum2);
		
		int num = 123;
		
		Integer i01 = 23;  //박싱
		i01.parseInt("12313");   //박싱 메소드 포함...
		
		int no = n02;  //언박싱
		
		//메소드 사용(Integer 예제)
		//문자열 --> 정수로 변경
		
		int result = i01.parseInt("12345");
		System.out.println(result);
		
		//이상한점
		//"13579" --> 숫자 13579로 변형
		Integer no03 = new Integer("131313");
		int result01 = no03.parseInt("13579");
		
		int result02 = Integer.parseInt("13579");
		System.out.println(result02);
		
		//정수를 문자열
		//12345 --> "12345"
		String value = String.valueOf(12345);
		System.out.println(value);
		
		String result04 = "" + 12345;
	}

}
