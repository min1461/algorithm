package Programmers;


import java.util.*;

public class 같은숫자는싫어 {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		
		int[] arr2 = {4,4,4,3,3};
		같은숫자는싫어 sn = new 같은숫자는싫어();
		int[] result = sn.solution(arr);

		System.out.println("길이는" + result.length);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		for (int num : result) {
			System.out.println(num);
		}

	}

	public int[] solution(int[] arr) {
		int[] answer = {};
		int size = 0;
		
		int[] result = new int[arr.length];
		result[0] = arr[0];
		
		
        for (int i=1;i<arr.length;i++){
        	if(result[size]!=arr[i]) {
        		result[size+1] = arr[i];
        		size++;
        	}
        }
        int[] newSize = new int[size+1];
        for (int i=0; i<newSize.length;i++) {
        	newSize[i]=result[i];
        }
        return newSize;
	}

}
