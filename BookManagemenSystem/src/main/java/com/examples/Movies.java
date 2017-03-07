package com.examples;

import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9,-1,-3,4,5
		int counter=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of movies");
		int n=sc.nextInt();
		int rating=0;
		int[] movies=new int[n];
		for(int i=0;i<n;i++)
			movies[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			if(movies[i]<0)
				counter=counter+1;
		}
		if(counter==movies.length){
			int evenrating=0;
			int oddrating=0;
			for(int i=0;i<n;i++){
				if(i%2 ==0){
					evenrating=evenrating+movies[i];
				}
				else
					oddrating=oddrating+movies[i];
				/**if(movies[i]<movies[i+1]){
					rating=rating+movies[i+1];
				}**/
			}
			if(evenrating<oddrating)
				rating=oddrating;
			else
				rating=evenrating;
		}
		else{
			
		
		for(int i=0;i<n;i++){
			if(movies[i]>0){
				rating=rating+movies[i];
				movies[i]=0;
			}
		}
		for(int i=0;i<n;i++){
			if(movies[i]<0 && movies[i+1]<0){
				if(movies[i]<movies[i+1])
				{
					rating=rating+movies[i+1];
			//	movies[i]=0;
				}
				else
				{
					rating=rating+movies[i];
					//movies[i+1]=0;
			}
		}
	}
		}
		System.out.println(rating);

}}
