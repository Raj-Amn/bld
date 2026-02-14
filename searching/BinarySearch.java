class BinarySearch {

	public static void main (String[] args) {

		int[] arr = {2,3,4,5,8};
		int target = 4;
		int res = search(arr,target);
		System.out.println(res);
	}

	static int search(int[] arr,int target){
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start + end)/2;
			if(target ==arr[mid]){
				return mid;
			}
			else if(arr[mid]<target){
				end = mid -1;
			}
			else{
				start = mid + 1;
			}
		}
		return -1;
	}


}
