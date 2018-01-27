package EscapeStudy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ObjectSort {

	public static void main(String[] args) {
		/*
		 * ����5. Java�� �̿��Ͽ� ������ �ذ��Ͻÿ�. ���ѵ���Ÿ�ý��� 11�� 7���� ù ������ ����ϱ� ���� �踦Ÿ�� �̱�������
		 * ����� �Ͽ���. ������ ���൵�� ����ġ ���� ��ǳ�츦 ���� �谡 ������ ���⿡ ó�ߴ�. �Ʒ��� �켱������ �˸°� 11��
		 * ������� Ż�� ��Ű��! 
		 * 
		 * �켱���� 1. �������Ƹ��� �ֿ켱���� �����϶� 
		 * �켱���� 2. ���ں��� ���ڸ� ���� �����϶� 
		 * �켱���� 3. ���̰� � ����� ���� �����϶� 
		 * �켱���� 4. ��� ��찡 ���ٸ� �̸������� �����϶� 
		 * �켱������ 1>2>3>4 ���̸� �� �켱���������� ������ ���ٸ� ���� �켱������ �����Ͽ� �����϶�. 
		 * �Է��� ���� ù���� �� �ο��� ���� ���� �ٺ��� �� �ο��� ������ �Էµȴ�. 
		 * 
		 * �Է� ����) 7 27 ������ �� Y 29 ������ �� N 28 �ǿϺ� �� Y 28 ����ȣ �� Y 27 ���Ѿ� �� N 26 ������ �� N 29 ������ �� N
		 * ��� ����) ������ �ǿϺ� ����ȣ ������ ���Ѿ� ������ ������ �÷����� �̿��ص� �����ϳ� Comparator�� ��� ����
		 */
		/*
		 * Limky Solution
		 * ���Ƹ� : 50�� / �̸� : ù���� / ���� : 30 / ���� : 100-����
			27 ������ �� Y   73 + �� + 0 + 50 = 123 ��
			29 ������ �� N   71 + �� + 0 + 0  = 71   ��
			28 �ǿϺ� �� Y   72 + �� + 0 + 50 = 122 ��
			28 ����ȣ �� Y   72 + �� + 0 + 50 = 122 �� 
			27 ���Ѿ� �� N   73 + �� + 30 + 0 = 103 ��
			26 ������ �� N   74 + �� + 30 + 0 = 104 ��
			29 ������ �� N   71 + �� + 0 + 0  = 71   ��

		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Person> list = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			Person p = new Person();
			p.setAge(sc.nextInt());
			p.setName(sc.next());
			p.setGender(sc.next());
			p.setStudy(sc.next());
			list.add(p);
		}
		
//			printList(list);

		
		solution(list);

	}

	//���Ƹ� : 50�� / �̸� : ù���� / ���� : 30 / ���� : 100-����
	private static void solution(ArrayList<Person> list) {
		
		//int score[] = new int[list.size()];
		//���Ƹ� : 500��
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getStudy().equals("Y")){
				list.get(i).setScore(list.get(i).getScore()+50);
			}
		}
		//���� : 30
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getGender().equals("��")){
				list.get(i).setScore(list.get(i).getScore()+30);
			}
		}
		//���� : 100-����
		for(int i=0; i<list.size(); i++){
			list.get(i).setScore(list.get(i).getScore()+(100-(list.get(i).getAge()*2)));
		}
	
		//�̸� ��
		for(int i=0; i<list.size(); i++){
			String str = list.get(i).getName();
			for(int j=0; j<list.size();j++){
				if(j!=i && list.get(i).getScore() == list.get(j).getScore()){
					if(1 > str.compareTo(list.get(j).getName())){
						//���� str�� ������ ����
						list.get(i).setScore(list.get(i).getScore()+1);
					}
				}
			}
		}
		
		//printList(list);
		
		//Score �ջ� ��� ���
		Person p;
		int index = 0;
		while(!list.isEmpty()){
			index = 0;
			for(int j=0; j<list.size(); j++){
				if(list.get(index).getScore() < list.get(j).getScore()){
					index = j;
				}
			}
			System.out.print(list.get(index).getName()+" ");
			list.remove(index);
		}


		
	
	}


	private static void moveStackToList(ArrayList<Person> list, Stack<Person> stack) {
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}	
	}
	
	private static void printList(ArrayList<Person> list) {
		for(Person p : list){
			System.out.println(p.toString());
		}
		
	}

}

class Person {
	private String name;
	private int age;
	private String gender;
	private String study;
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudy() {
		return study;
	}

	public void setStudy(String study) {
		this.study = study;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", study=" + study + ", score=" + score
				+ "]";
	}



}
