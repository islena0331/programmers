class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i < 20; i++){
            if(7 * i >= n){
                answer = i;
                break;
            }
        }
        return answer;
    }
}