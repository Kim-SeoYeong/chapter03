package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p01 = new Point(6, 5);
		Point p03 = new Point(5, 4);
		Point p04 = new Point(6, 5);
		//System.out.println(p01.toString());
		System.out.println("toString()==========================");

		//Object 클래스가 부모이다.
		//Object 클래스의 메소드 + Point클래스의 메소드를 사용할 수 있다.
		//겹치는 메소드 주의
		
		//테스트 Point클래스의 메소드를 지운다.
		System.out.println(p01.toString());
		
		//메소드 오버라이딩
		Object p02 = new Point();
		System.out.println(p02.toString());
		
		//println toString()찾아서 실행한다.
		System.out.println(p01);	//주소의 toString()
		
		//getClass()
		System.out.println("getClass()==========================");
		System.out.println(p01.getClass());
		
		//hashCode() 주소대용으로 사용할 수 있다.
		System.out.println("hashCode()==========================");
		System.out.println(p01.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		//equals() 같은지 비교
		System.out.println("equals()==========================");
		System.out.println(p01.equals(p03));
		//주소값이 다르면 false로 처리
		System.out.println(p01.equals(p04));
		
		//주소값을 직접 비교할때  사용
		System.out.println(p01==p03);
		System.out.println(p01==p04);

		String str = "안녕";
		if (str == "안녕") {
			
		}
	}

}
