class Solution {
    public int calPoints(String[] ops) {
        List<Integer> score = new ArrayList<>();
        
        for(String op:ops){
            try{
                score.add(Integer.parseInt(op));
            }
            catch(NumberFormatException ex){
                if(op.equals("C")){
                    score.remove(score.size()-1);
                }
                
                else if(op.equals("D")){
                    score.add(2*score.get(score.size()-1));
                }
                else{
                    score.add(score.get(score.size()-1)+score.get(score.size()-2));
                }
            }
        }
        
        
        int totalScore = score.stream().reduce(0, (subtotal, element) -> subtotal + element);
        return totalScore;
    }
}