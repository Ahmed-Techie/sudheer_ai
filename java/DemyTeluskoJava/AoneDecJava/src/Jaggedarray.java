public class Jaggedarray {
    public static void main(String[] args) {
        
        /*int nums[][] = new int[3][]; // Declaring a jagged array with 3 rows
        nums[0] = new int[3]; // First row with 3 elements
        nums[1] = new int[2]; // Second row with 2 elements
        nums[2] = new int[4]; // Third row with 4 elements
        for (int i = 0; i < nums.length; i++) {
for (int j = 0; j < nums[i].length; j++) {
nums[i][j] = (int) (Math.random() * 10);
System.out.print(nums[i][j] + " ");
}
System.out.println(); } // Move to the next line after each row
*/
        
        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];
        
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random()*10);

            }
        }

        for(int [] row : nums) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}