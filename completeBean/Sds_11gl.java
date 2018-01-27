
public class Sds_11gl {

	public static void main(String[] args) {
		Person per[] = new Person[7];
		int length = per.length;
		
		per[0] = new Person(27, "이정수", 'm', true);
		per[1] = new Person(29, "김지민", 'm', false);
		per[2] = new Person(28, "권완빈", 'm', true);
		per[3] = new Person(28, "설인호", 'm', true);
		per[4] = new Person(27, "최한아", 'f', false);
		per[5] = new Person(26, "성연진", 'f', false);
		per[6] = new Person(29, "이종민", 'm', false);
		
		
		
		
		
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
		
		System.out.println("이직동아리 최우선 구출");
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
		
		System.out.println("남자보다 여자를 우선 구출");
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
		
		System.out.println("나이가 어린 사람을 먼저 구출");
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
		
		System.out.println("모든 조건이 같다면 이름순으로 구출");
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
