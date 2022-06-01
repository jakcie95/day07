package day07;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	/*
	 컬렉션 프레임 워크
	 컬렉션
	 - 다수의 데이터, 데이터 그룹
	 -무한한 데이터의 집합 - 자바의 자료구조
	 프레임 워크
	 - 하나의 틀
	 -표준화된 프로그래밍 방식
	 List, set, Map
	 List(부모)
	 - ArrayList
	 - LinkedList
	 - Stack...
	 
	 ArrayList
	 -순서를 유지한다.
	 -데이터의 중복을 허용한다.
	 */
	ArrayList arr = new ArrayList(); //클래스 형태로 변수를 만들면 변수를 객체라고 함
	arr.add("123");					 //객체형 변수들은 기능들이 제공됨
	arr.add("456");
	System.out.println(arr.get(0));
	System.out.println(arr.get(1));//ArrayList에 저장된 값을 가져옴
	
	int s =arr.size();//ArrayList에 저장된 갯수를 얻어옴
	System.out.println(s);
	
	int[] a = new int[3];
	System.out.println(a.length);
	
	boolean bool = arr.contains("123");
	if(bool == true) {
		System.out.println("123은 존재합니다");
	}
	
	System.out.println(bool); //ArrayList에 저장된 값으면 true 아니면 false
	System.out.println(arr.contains("12311"));
	
	System.out.println(arr.remove("123"));
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	arr.clear();
	System.out.println(arr.size());
	
	arr.add("라면"); arr.add("소금");
	arr.add("순대");
	String index = "소금";
	int i = arr.indexOf(index);
	System.out.println(i+"번째 존재함");
	System.out.println("변경 전 : "+arr.get(1));
	arr.set(i, "금금");
	System.out.println("변경 후 : "+arr.get(1));
}
}
