import java.util.*;

class Array2 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[2][];
		int sum = 0;

		//input
		for (int i=0; i<arr.length; i++){

			for (int j=0; j<arr[i].length;j++){
				arr[i][j]=in.nextInt();
			}
		}

		//output
		for (int i=0; i<arr.length; i++){

			for (int j=0; j<arr[i].length;j++){
				sum = sum + arr[i][j];
			}
		}

		System.out.println(sum);

	}
}
