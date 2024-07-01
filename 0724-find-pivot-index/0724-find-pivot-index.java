class Solution {
    public int pivotIndex(int[] nums) {
        // Calcular la suma total del arreglo
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Inicializar la suma acumulada a la izquierda
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            // Si la suma acumulada a la izquierda es igual a la suma acumulada a la derecha
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Actualizar la suma acumulada a la izquierda
            leftSum += nums[i];
        }
        
        // Si no se encuentra el índice pivote, retornar -1
        return -1;
    }
}
