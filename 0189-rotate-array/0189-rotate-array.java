class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //utilizamos el módulo en caso de que k sea mayor que n;
        
        rotate(nums, 0, n-1); //rotamos todo el array [1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
        rotate(nums, 0, k-1); //rotamos los primeros k elementos, si k=3 [7,6,5][4,3,2,1] -> [5,6,7][4,3,2,1]
        rotate(nums, k, n-1); //rotamos los elementos restantes, para tener:[1,2,3,4,5,6,7] -> [5,6,7,1,2,3,4]
    }
    
    public void rotate(int[] nums, int start, int end){ //invierte completamente un subgrupo del arreglo
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            
            start++;
            end--;
        }
    }
}