import java.util.Scanner;


public class Hanoi {
	int count = 0;
/*
 * circle(1<= circle <= 15)
 * 1 tower = origin of circle position
 * 2 tower = center
 * 3 tower = moving position
 * 
 * if 3 circles 2X2X2 -1 = 7 2의3승
 * if 4 circles 2X2X2X2-1 = 15 2의 4승
 * finally Time Complexity = 2의n승 
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int circle = in.nextInt();
		Hanoi hanoi = new Hanoi();
		hanoi.moveCircle("A", "B", "C", circle);
		hanoi.showResult();
		
		
	}
	public void moveCircle(String origin, String center, String moving, int circle){
		if(circle == 1){
			count++;
			System.out.println(circle + " : " + origin +  " -> " + moving);
		}
		else{
			moveCircle(origin, moving, center, (circle-1));  //a, c, b
			count++;
			System.out.println(circle + " : " + origin + " -> " + moving);
			moveCircle(center, origin, moving, circle-1);    //b, a, c
		}
	}
	public void showResult(){
		System.out.println("moving Count : " + count);
	}
}
