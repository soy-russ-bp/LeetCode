class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int producto=1;
        int productZero=0;
        //calculo el producto contemplando todos los elementos del array
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                producto*=nums[i];
            }else{//es decir, si hay un 0 en el array
                productZero++;
            }
        }
        
        //dividiré el producto entre nums[i] para cada caso, ya que nums[i]/nums[i]=1
        //de esta forma tendré e producto de todos los números, excepto nums[i]
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0 ){//como no se puede dividir entre 0
                if(productZero>0){ //si hay algún 0 en nums[], todo answer[] será 0, excepto las posiciones donde está en 0 en el array nums[]
                    answer[j]=0;
                }else{
                    answer[j]=producto/nums[j];
                }
            }else{//esta es la posición que tiene el cero en nums[], por lo que en answers no se toma en cuenta el 0 y el resultado será el producto omitiendo los 0;
                if(productZero>1){
                    answer[j]=0;
                }else{
                    answer[j]=producto;
                }
                
            }
            
        }
        
        return answer;
    }
}