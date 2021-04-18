package Programmers;

public class 수박수박수박수 {
	public static void main(String[] args) {
		System.out.print(Solution(20));
	}

	public static String Solution(int n) {
		String answer = "";
		if (n % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				answer += "수박";
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				answer += "수박";
			}
			answer += "수";
		}
		return answer;
	}
}
