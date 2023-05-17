# 2023May17 • 문자열 내 p와 y의 개수

### **문제 설명 :**

대문자와 소문자가 섞여있는 문자열 `s`가 주어집니다. `s`에 '`P`'의 개수와 '`Y`''의 개수를 비교해 같으면 `true`, 다르면 `false`를 `return` 하는 solution를 완성하세요. '`P`', '`Y`' 모두 하나도 없는 경우는 항상 `true`를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

예를 들어 `s`가 "pPoooyY"면 `true`를 `return`하고 "Pyy"라면 `false`를 `return`합니다.


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

### **문제 해결 과정 :**

문제 조건에서 대소문자 구별없이 문자 개수를 카운팅하기때문에 `toLowerCase()` 함수를 이용해 전부 소문자로 변경해줬다.

문자의 개수를 카운팅하기위해서 `replace()` 함수를 사용해 “” 공백으로 바뀐값의 length를 비교해서

같다면  또  두 문자 개수가 전부 0 이라면 `true`값을 리턴하도록 했고 length 값이 다르다면 `false`값을 리턴하도록 if문을 작성해서 완성했다.
