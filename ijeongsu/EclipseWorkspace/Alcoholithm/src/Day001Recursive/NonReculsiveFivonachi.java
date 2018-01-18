package Day001Recursive;

import java.util.Scanner;

public class NonReculsiveFivonachi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int now=0;
		int before=1;
		int bbefore=0;
		
		for(int i=0; i<input; i++){
			if(i==0 || i==1){
				now=i;
				System.out.print(i+" ");
			}else{
				now=before+bbefore;
				bbefore=before;
				before=now;
				System.out.print(now+" ");
			}
		}
		

	}

}
