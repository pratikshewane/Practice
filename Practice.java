class Practice {
    public static void main(String[] args) {
        int arr[] = {2,5,9,10,15,42,72};
        int target = 15;
        search(arr,target);
    }

    public static int  search(int arr[] , int target) {
        int start = arr[0];
        int end = arr[arr.length-1];

        while(start <= end ) {
            int mid = (start+end) / 2;
            if(arr[mid] == target) return mid;
            if(arr[mid] > target) { 
                end = mid-1;
            } else {
                start = mid+1;
            }
            
        }
        return -1;
    }
}