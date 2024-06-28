class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        

        for (int num : nums) {
            if (num <= first) {// hallamos i, la primer iteración entrará aquí, por lo que aquí captará los valores más menores
                first = num;
            } else if (num <= second) { //la segunda iteración entrará aquí, por lo que será i, es decir i<j
                second = num;
            } else {//cuando num no es menor o igual que first ni que second, entonces,este significa que es k, y se cumple i<j<k
                return true;
            }
        }
        
        return false;
    }
}
