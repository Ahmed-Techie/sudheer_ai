public class Multida {
    public static void main(String[] args) {
        System.out.println();
         int nums [][]= new int[3][3];
        int num1[] = new int[3];
for (int i = 0; i < 3; i++) { // Iterate over rows
for (int j = 0; j < 3; j++) { // Iterate over columns
    nums[i][j] = (int)(Math.random()*10);
System.out.print(nums[i][j] + " ");
}
System.out.println(); // Move to the next line after each row
}
System.out.println();
for(int k=0; k<3; k++){
    num1[k]=(int)(Math.random()*100);
    System.out.print(num1[k] + " ");
    
}
System.out.println();
int nums1 [][]= {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
System.out.println();
for (int[] row : nums1) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
System.out.println();
    }
}