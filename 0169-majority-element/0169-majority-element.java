class Solution {
    public int majorityElement(int[] nums) {
        int candidato = nums[0];
        int contador = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidato) {
                contador++;
            } else {
                contador--;
            }

            if (contador == 0) {
                candidato = nums[i];
                contador = 1;
            }
        }

        return candidato;
    }
}