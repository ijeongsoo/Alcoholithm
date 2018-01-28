package Day002Sorting1.Escape;

import java.util.ArrayList;
import java.util.Scanner;

public class EscapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.next());
		
		ArrayList<Person> list = new ArrayList();
		
		for(int i=0; i<input; i++){
			Person p = new Person();
			p.age=Integer.parseInt(sc.next());
			p.name=sc.next();
			p.gender=sc.next();
			p.isClub=sc.next();
			list.add(p);
		}
		
		sort(list);
		
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i).name + " ");
		}
		
		
		
	}
	
	public static void sort(ArrayList<Person> list){
		for(int i=list.size(); i>1; i--){
			for(int j=1; j<i-1; j++){
				if(list.get(j).isClub.compareTo(list.get(j+1).isClub) < 0){
					Person temp = new Person();
					temp.name=list.get(j+1).name;
					temp.age=list.get(j+1).age;
					temp.isClub=list.get(j+1).isClub;
					temp.gender=list.get(j+1).gender;
					
					list.add(j, temp);;
					list.remove(j+2);	
				}else if(list.get(j).isClub.equals(list.get(j+1).isClub)){
					if(list.get(j).gender.compareTo(list.get(j+1).gender) < 0){
						Person temp = new Person();
						temp.name=list.get(j+1).name;
						temp.age=list.get(j+1).age;
						temp.isClub=list.get(j+1).isClub;
						temp.gender=list.get(j+1).gender;
						
						list.add(j, temp);
						list.remove(j+2);
					}else if(list.get(j).gender.equals(list.get(j+1).gender)){
						if(list.get(j).age > list.get(j+1).age){
							Person temp = new Person();
							temp.name=list.get(j+1).name;
							temp.age=list.get(j+1).age;
							temp.isClub=list.get(j+1).isClub;
							temp.gender=list.get(j+1).gender;
							
							list.add(j, temp);
							list.remove(j+2);
						}else if(list.get(j).name.compareTo(list.get(j+1).name) > 0){
							Person temp = new Person();
							temp.name=list.get(j+1).name;
							temp.age=list.get(j+1).age;
							temp.isClub=list.get(j+1).isClub;
							temp.gender=list.get(j+1).gender;
							
							list.add(j, temp);
							list.remove(j+2);
						}
					}
				}
			}
		}
	}

}
