
public class Sds_11gl {

	public static void main(String[] args) {
		Person per[] = new Person[7];
		int length = per.length;
		
		per[0] = new Person(27, "������", 'm', true);
		per[1] = new Person(29, "������", 'm', false);
		per[2] = new Person(28, "�ǿϺ�", 'm', true);
		per[3] = new Person(28, "����ȣ", 'm', true);
		per[4] = new Person(27, "���Ѿ�", 'f', false);
		per[5] = new Person(26, "������", 'f', false);
		per[6] = new Person(29, "������", 'm', false);
		
		
		
		
		
		int min = 0;
		for(int i = 0; i<length; i++){
				min = i;
			for(int j = i+1; j<length; j++){
				if(per[min].cj != true){
					min = j;
				}
			}
			Person temp = per[i];
			per[i] = per[min];
			per[min] = temp;
		}
		
		System.out.println("�������Ƹ� �ֿ켱 ����");
		for(int i = 0; i<7; i++){
			System.out.print(per[i].name + " ");
		}
		System.out.println();
		min = 0;
		
		for(int i = 0; i<length; i++){
				min = i;
			for(int j = i+1; j<length; j++){
				if(per[min].cj == per[j].cj){
					if(per[min].gender> per[j].gender){
						min = j;
					}
				}
			}
			Person temp = per[i];
			per[i] = per[min];
			per[min] = temp;
		}
		
		System.out.println("���ں��� ���ڸ� �켱 ����");
		for(int i = 0; i<7; i++){
			System.out.print(per[i].name + " ");
		}
		System.out.println();
		min = 0;
		
		for(int i = 0; i<length; i++){
				min = i;
			for(int j = i+1; j<length; j++){
				if(per[min].cj == per[j].cj){
					if(per[min].gender == per[j].gender){
						if(per[min].age > per[j].age){
							min = j;
						}
					}
				}
			}
			Person temp = per[i];
			per[i] = per[min];
			per[min] = temp;
		}
		
		System.out.println("���̰� � ����� ���� ����");
		for(int i = 0; i<7; i++){
			System.out.print(per[i].name + " ");
		}
		System.out.println();
		min = 0;
		
		for(int i = 0; i<length; i++){
				min = i;
			for(int j = i+1; j<length; j++){
				if(per[min].cj == per[j].cj){
					if(per[min].gender == per[j].gender){
						if(per[min].age == per[j].age){
							if(per[min].name.compareTo(per[j].name) > 0){
								min = j;
							}
						}
					}
				}
			}
			Person temp = per[i];
			per[i] = per[min];
			per[min] = temp;
		}
		
		System.out.println("��� ������ ���ٸ� �̸������� ����");
		for(int i = 0; i<7; i++){
			System.out.print(per[i].name + " ");
		}
	}

}

class Person{
	int age;
	String name;
	char gender;
	boolean cj;
	

	public Person(int age, String name, char gender, boolean cj) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.cj = cj;
	}
	public boolean isCj() {
		return cj;
	}
	public void setCj(boolean cj) {
		this.cj = cj;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
