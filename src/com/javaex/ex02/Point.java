package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드-getter/setter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//메소드-일반
	public void showInfo() {
		System.out.println("점 x : " + x + ", 점 y : " + y );
	}

	//주소값 대용, 변경해 사용할 수 있다.
	/*
	public int hashCode() {
		return 123;
	}
	*/

}
