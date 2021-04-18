package Programmers;


public class 서울에서김서방찾기 {
	
	public static void main(String[] args) {
		String[] aa = {"Jane","Kim"};
		
		System.out.println(ssolution(aa));
	}
	
	
    public static String ssolution (String[] seoul) {
        int i = 0;
        for (i = 0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
               break;
            }
        }
        
        String answer = "김서방은 "+ i + "에 있다";
        return answer;
    }
}