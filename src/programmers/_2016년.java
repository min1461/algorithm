package Programmers;


import java.util.Scanner;

public class _2016년 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇월? : ");
		int a = in.nextInt();
		System.out.print("몇일? : ");
		int b = in.nextInt();
		System.out.print(ssolution(a, b));
	}

	public static String ssolution (int a, int b) {
	        String[] dow = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
			int totalDays = 0;
			for(int i=1;i<a;i++) {
				if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
					totalDays += 31;
				}else if(i==2){
					totalDays += 29;
				}else{
					totalDays += 30;
				}
			}
			totalDays+=b+4;
	        return dow[totalDays%7];
	    }
}