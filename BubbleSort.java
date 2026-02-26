class Main {
    public static void main(String[] args) {
       
       int nums[] = {5,2,1,16,9,15,2,3,4,45,78};
       int size = nums.length;
       int temp = 0;
       System.out.println("Before sort");
       for(int num:nums){
           System.out.print(num + " ");
       }
           
       for(int i = 0 ; i < size ; i++){
           for(int j = 0 ; j<size - i - 1 ; j++){
               if(nums[j]>nums[j+1]){
                   temp = nums[j];
                   nums[j] = nums[j+1];
                   nums[j+1] = temp;
               }
           }
       }
       System.out.println();
       System.out.println("After sort");
       for(int num:nums){
           System.out.print(num + " ");
       } 
       
    }
}
