package day07;

import java.util.ArrayList;

public class Ex01 {
public static void main(String[] args) {
	/*
	 �÷��� ������ ��ũ
	 �÷���
	 - �ټ��� ������, ������ �׷�
	 -������ �������� ���� - �ڹ��� �ڷᱸ��
	 ������ ��ũ
	 - �ϳ��� Ʋ
	 -ǥ��ȭ�� ���α׷��� ���
	 List, set, Map
	 List(�θ�)
	 - ArrayList
	 - LinkedList
	 - Stack...
	 
	 ArrayList
	 -������ �����Ѵ�.
	 -�������� �ߺ��� ����Ѵ�.
	 */
	ArrayList arr = new ArrayList(); //Ŭ���� ���·� ������ ����� ������ ��ü��� ��
	arr.add("123");					 //��ü�� �������� ��ɵ��� ������
	arr.add("456");
	System.out.println(arr.get(0));
	System.out.println(arr.get(1));//ArrayList�� ����� ���� ������
	
	int s =arr.size();//ArrayList�� ����� ������ ����
	System.out.println(s);
	
	int[] a = new int[3];
	System.out.println(a.length);
	
	boolean bool = arr.contains("123");
	if(bool == true) {
		System.out.println("123�� �����մϴ�");
	}
	
	System.out.println(bool); //ArrayList�� ����� ������ true �ƴϸ� false
	System.out.println(arr.contains("12311"));
	
	System.out.println(arr.remove("123"));
	System.out.println(arr.get(0));
	System.out.println(arr.size());
	arr.clear();
	System.out.println(arr.size());
	
	arr.add("���"); arr.add("�ұ�");
	arr.add("����");
	String index = "�ұ�";
	int i = arr.indexOf(index);
	System.out.println(i+"��° ������");
	System.out.println("���� �� : "+arr.get(1));
	arr.set(i, "�ݱ�");
	System.out.println("���� �� : "+arr.get(1));
}
}
