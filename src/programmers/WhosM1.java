package Programmers;


public class WhosM1 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		
		int[] result = ssolution(answers);
		for(int i =0; i<result.length; i++) {
			System.out.print(result[i]);
		}
		System.out.println(ssolution(answers));
	}
	public static int[] ssolution(int[] answers) {
		int[] answer = new int[3];
		int[] person1 = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		for (int i = 0; i < answers.length; i++) {
			if (person1[i % person1.length] == answers[i]) {
				answer[0]++;
			}
			if (person2[i % person2.length] == answers[i]) {
				answer[1]++;
			}
			if (person3[i % person3.length] == answers[i]) {
				answer[2]++;
			}
		}
		if (answer[0]>answer[1] && answer[0]>answer[2]) 
			return new int[] {1};
		if (answer[1]>answer[0] && answer[1]>answer[2]) 
			return new int[] {2};
		if (answer[2]>answer[1] && answer[2]>answer[0]) 
			return new int[] {3};
		if (answer[0]==answer[1] && answer[0]>answer[2])
			return new int[] {1,2};
		if (answer[1]==answer[2] && answer[1]>answer[0])
			return new int[] {2,3};
		if (answer[0]==answer[2] && answer[0]>answer[1])
			return new int[] {1,3};
		return new int[] {1,2,3};
	}
}