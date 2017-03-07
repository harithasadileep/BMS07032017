package com.examples;

import java.util.Scanner;

public class FleetofVehicles {
//FleetofVehicles
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	int combinations=0;	
int number=sc.nextInt();
if(number%2 ==0){
for(int i=0;i<=number/2;i++){
	for(int j=0;j<=number/4;j++){
		if((2*i+4*j)==number)
			combinations=combinations+1;
	}
}
System.out.println(combinations);}
else{
	combinations=0;
	System.out.println(combinations);
}
	

	}

}
