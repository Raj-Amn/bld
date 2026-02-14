class linearsearch {
	public static void main (String[] args) {
		int[] arr = {4,7,9,11};	
		int target = 9;
		boolean flag = false;

		for (int i=0; i<arr.length; i++){
			if(arr[i]==target){
				flag = true;
			}
			else{
				flag = false;
			}
		}
		if(flag){
			System.out.println("found");
		}else{
			System.out.println("NOT found"); }


	}
}
