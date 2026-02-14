import java.util.ArrayList;

class Occurence {
	public static void main (String[] args) {
		int[] arr = {2,2,3,18,9,4,5,5};
		int target = 5;
		int count = 0;
		ArrayList<Integer>list = new ArrayList();

		for (int i=0; i<arr.length; i++){
			if(arr[i]==target){
				count++;
				list.add(i);
			}
		}

		if(count == 0){
			System.out.println("Not found");
		}else{
			System.out.println(count);
			System.out.println(list);
		}

	}
}
