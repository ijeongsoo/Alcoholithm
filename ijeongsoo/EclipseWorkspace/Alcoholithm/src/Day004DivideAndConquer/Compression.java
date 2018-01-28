package Day004DivideAndConquer;

import java.util.Scanner;

public class Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int[][] inputArr = new int[input][input];
		
		for(int i=0; i<input; i++){
			String inputLine= sc.nextLine();
			for(int j=0; j<input; j++){
				inputArr[i][j]=inputLine.charAt(j)-48;
			}
		}
		
		
		System.out.println(comp(inputArr, input, 0, 0));
	}
	
	public static String comp(int[][] arr,int n, int s, int e){
		int turm = n/2;
		if(n==1){
	        return arr[s][e]+"";
		}
		String first = String.valueOf(arr[s][e]);
		String lu=comp(arr, n/2, s, e);
		String ru=comp(arr, n/2, s, e+turm);
		String ld=comp(arr, n/2, s+turm,e);
		String rd=comp(arr, n/2, s+turm, e+turm);
		
		if(lu.equals(first)&&ru.equals(first)&&ld.equals(first)&&rd.equals(first)){
			return first;
		}
		
		return "("+lu+ru+ld+rd+")";
		
	}
	

}
