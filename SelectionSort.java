// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {

        int nums[] = { 2, 7, 19, 2, 1, 5, 66, 0 };
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sort");
        
        // Printing array before sorting
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // ============================
        //    SELECTION SORT LOGIC
        // ============================
        
        // Outer loop for each position
        for (int i = 0; i < size - 1; i++) {   
            
            minIndex = i; // Assume current element is the smallest
            
            // Inner loop to find the actual smallest element
            for (int j = i + 1; j < size; j++) {
                
                // Update minIndex if a smaller element is found
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            // Swap only after the smallest element in the remaining array is found
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        // Printing array after sorting
        System.out.println("\nAfter Sort");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
