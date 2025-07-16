import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] digits = Long.toString(n).toCharArray(); // ① 숫자를 char 배열로
        Arrays.sort(digits);                            // ② 오름차순 정렬
        String desc = new StringBuilder(
                          new String(digits))
                          .reverse()                    // ③ 뒤집어 내림차순
                          .toString();
        return Long.parseLong(desc);                    // ④ long으로 변환
    }
}