class Solution {
    public boolean solution(String[] phone_book) {
       // 한 번호가 다른 번호의 접두어인 경우
        // false 아니면 true
        // for문으로 돌리고 
        // false일 경우, break문으로 answer 값을 반환
    	// 한 쪽이 더 길 경우?
    	// i가 j보다 더 짧아야 비교할 수 있다. 나머지는 넘어간다.
    	
        boolean answer = true;
        int plength = phone_book.length;
        
OUT: for (int i = 0; i < plength; i++) {
			for (int j = 0; j < plength; j++) {
				if (i != j) {
					int result = compareTwo(phone_book[i], phone_book[j]);
					if (result != -1) {
						String first = phone_book[i];
						String second = phone_book[j];

						if (first.equals(second.substring(0, first.length()))) {
							answer = false;
							break OUT;
						}
					}

				}
			}
		}

        return answer;
    }
    
      public static int compareTwo(String first, String second) {
    	if(first.length() > second.length()) {
    		return -1;
    	}else if(first.length() == second.length()) {
    		return 0;
    	}else {
    		return 1;
    	}
    }
}
