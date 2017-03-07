package com.examples;

import java.util.Scanner;

public class MoneyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MoneyCollection
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of students");
int n=sc.nextInt();
System.out.println("enter the unlucky number");
int u=sc.nextInt();
int sum=0;
for(int i=0;i<n;i++){
	sum=sum+i;
	if(sum==u){
		sum=sum-1;
		
	}
		
	}
System.out.println(sum);}

}
