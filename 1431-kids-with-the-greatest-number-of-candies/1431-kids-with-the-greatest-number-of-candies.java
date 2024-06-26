class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies=0;
        List<Boolean> result = new ArrayList<Boolean>(); 
        
        for(int i=0;i<candies.length;i++){
            result.add(false); //cargo el Arraylist por defecto con el valor false
            if(candies[i]>greatestCandies){
                greatestCandies=candies[i];//encuentro la mayor cantidad de dulces
            }
        }
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=greatestCandies){ //compruebo si la cantidad de dulces de i-ésimo niño + la cantidad extra lo hace ser el que tiene más dulces
                result.set(i,true);
            }
        }
        
        return result;  
        
    }
}