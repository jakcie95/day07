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
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.println(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				while(true) {
				System.out.println("이름 입력");
				name = sc.next();
				if(nameArr.indexOf(name) == -1) {
					break;
				}
				System.out.println("존재하는 이름. 다시.");
			}
				System.out.println("전화번호 입력");
				phNum = sc.next();
				nameArr.add(name);
				numArr.add(phNum);
				System.out.println("저장 완료");
				break;
			case 2 : 
				System.out.println("이름 입력");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {
					System.out.println("존재하지 않는 정보 입니다.");
				}else {
					System.out.println("이름 : " +name);
					System.out.println("전화번호 : "+
										numArr.get(temp));
				}
				break;
			case 3 : 
				System.out.println("이름 입력");
				name = sc.next();
				temp = nameArr.indexOf(name);
				if(temp == -1) {
					System.out.println("존재하지 않는 정보 입니다.");
				}else {
					//nameArr.remove(temp);
					nameArr.remove(name);
					//numArr.remove(temp);
					numArr.remove(numArr.get(temp));
					System.out.println("삭제 완료");
				}
				break;
			case 4 : 
					System.out.println("이름\t전화번호");
					System.out.println("===============");
				for(int i = 0; i <numArr.size(); i++) {
					System.out.println(nameArr.get(i)+"\t");
					System.out.println(numArr.get(i));
					System.out.println("===============");
				}
				break;
			case 5 : 
				System.exit(1); //프로그램 강제 종료
			}
		}
}
}
