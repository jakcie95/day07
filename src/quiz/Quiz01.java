package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList nameArr = new ArrayList();
		ArrayList numArr = new ArrayList();
		int num, temp=0;
		String name=null, phNum=null;
		while(true) {
			System.out.println("1.����ó ���");
			System.out.println("2.����ó ����");
			System.out.println("3.����ó ����");
			System.out.println("4.��� ����ó ����");
			System.out.println("5.����");
			System.out.println(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				while(true) {
				System.out.println("�̸� �Է�");
				name = sc.next();
				if(nameArr.indexOf(name) == -1) {
					break;
				}
				System.out.println("�����ϴ� �̸�. �ٽ�.");
			}
				System.out.println("��ȭ��ȣ �Է�");
				phNum = sc.next();
				nameArr.add(name);
				numArr.add(phNum);
				System.out.println("���� �Ϸ�");
				break;
			case 2 : 
				System.out.println("�̸� �Է�");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
				}else {
					System.out.println("�̸� : " +name);
					System.out.println("��ȭ��ȣ : "+
										numArr.get(temp));
				}
				break;
			case 3 : 
				System.out.println("�̸� �Է�");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {
					System.out.println("�������� �ʴ� ���� �Դϴ�.");
				}else {
					//nameArr.remove(temp);
					nameArr.remove(name);
					//numArr.remove(temp);
					numArr.remove(numArr.get(temp));
					System.out.println("���� �Ϸ�");
				}
				break;
			case 4 : 
					System.out.println("�̸�\t��ȭ��ȣ");
					System.out.println("===============");
				for(int i = 0; i <numArr.size(); i++) {
					System.out.println(nameArr.get(i)+"\t");
					System.out.println(numArr.get(i));
					System.out.println("===============");
				}
				break;
			case 5 : 
				System.exit(1); //���α׷� ���� ����
			}
		}
}
}
