class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1]; 
        
        for(int i=0;i<n+1;i++){
            int count=0;
            String bin= Integer.toBinaryString(i);
            System.out.println(bin);
            
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1'){
                    count++;
                }
            }
            ans[i]=count;
            
        }
        return ans;
    }
}

//código más eficiente de chat, sea i cada binario:
/*
Si i es par, entonces countBits(i) = countBits(i / 2).
Si i es impar, entonces countBits(i) = countBits(i / 2) + 1.

Ejemplo 1: i = 4 (Par)
Representación binaria de 4 es 100.
i / 2 = 2, cuya representación binaria es 10.
countBits(4) = countBits(2) = 1.


Ejemplo 2: i = 5 (Impar)
Representación binaria de 5 es 101.
i / 2 = 2, cuya representación binaria es 10.
countBits(5) = countBits(2) + 1 = 2.
*/
//class Solution {
//    public int[] countBits(int n) {
//        int[] ans = new int[n + 1]; 
        
//        for (int i = 1; i <= n; i++) {
//            ans[i] = ans[i >> 1] + (i & 1);
            
//        }
        
//        return ans;
//    }
//}
