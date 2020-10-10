package programmers.month10.week2;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int len = strings.length;
        
        for(int i=0; i<len-1;i++){
            for(int j=i+1;j<len;j++){
                int k = strings[i].compareTo(strings[j]);
                if(k>=0){
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }
        return answer;
    }
}