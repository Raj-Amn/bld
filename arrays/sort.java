import java.util.Scanner;
public class sort {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);	

		int t = in.nextInt();
		for(int i=0;i<t;i++){
			solve();
			System.out.println();
		}
	}

	static void solve(){
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[] arr = new int[n];
		// todo --> we filled the array
		for (int i=0; i<n;i++){
			arr[i]  = in.nextInt();
		}

		int count0=0;
		int count1=0;
		//tod --> count kar liya
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				count0++;
			}else{
				count1++;
			}
		}

		for (int i=0; i<count0;i++){
			System.out.print(0+" ");
		}
		for (int i=0; i<count1;i++){
			System.out.print(1+" ");
		}
		
	}
}
