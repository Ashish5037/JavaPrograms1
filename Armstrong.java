package com;

import java.util.Scanner;

public class Armstrong {

// 	public static void main(String[] args) {
// 		Scanner ip=new Scanner(System.in);
// 		System.out.println("enter a number ");
// 		int n1=ip.nextInt();
// 		int n2=n1,n3=n1;
// 		int count=0;
// 		while(n2!=0) {
// 			count++;
// 			n2=n2/10;
// 		}
// 		int sum=0,rem=0;
// 		while(n3!=0) {
// 			rem=n3%10;
// 			int power=1;
// 			for(int i=1;i<=count;i++) {
// 				power*=rem;
// 			}
// 			sum+=power;
// 			n3=n3/10;
// 		}
// 		if(sum==n1) {
// 			System.out.println("armstrong number");
// 		}
// 		else {
// 			System.out.println("not a armstrong number");
// 		}
// 	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an Input No");
	int input=sc.nextInt();
	for(int i=0;i<=input;i++) {
		double result =0;
		int count=0;
		
		for(int temp=i;temp!=0;count++) {
			temp=temp/10;
			
		}
		for(int temp=i;temp!=0;temp=temp/10) {
			int remainder=temp%10;
			result+=Math.pow(remainder, count);
		}
		if(i==result) {
			System.out.println(i+ " is Armstrong Number");
		}
	}
}

}
