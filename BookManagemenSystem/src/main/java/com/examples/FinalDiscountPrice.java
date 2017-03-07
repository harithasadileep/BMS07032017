package com.examples;

import java.util.ArrayList;

public class FinalDiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
int prices[]={5,4,3,2,4};
int nodiscountindex[]= {0,0,0,0,0};
for(int i=0;i<prices.length;i++){
	int discount=0;
	if(prices[i]<i+1){
		sum=sum+prices[i];
		nodiscountindex[i]=1;
	}
	else{
		discount=prices[i+1];
		sum=sum+(prices[i]-discount);
	}
}
System.out.println(sum);
System.out.println("no discount items");
for(int i=0;i<nodiscountindex.length;i++)
{
	if(nodiscountindex[i]==1)
		System.out.println(i);
}
	}

}
