package may17;
// p와 y 갯수가 같거나 하나도 없으면 트루 아니면 펄스 
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String l = s.toLowerCase();
        int pLength = l.replace("p","").length();
        int yLength = l.replace("y","").length();
        
        if(pLength == yLength) {
        	answer = true;
        }else if(pLength == 0 && yLength == 0) {
        	answer = true;
        }else if(pLength != yLength) {
        	answer = false;
        }
        
       
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
		boolean result = s.solution("pPooyY");
		System.out.println(result);
		
		
	}
}