package com.test;

public class AshaKelly {
	
	
 public static void main(String[] args) {
	System.out.println(printDays(2,3,4));
 }
 
 
 

private static int printDays(int a, int k, int p) {
	int ashaWorkCount=a+p;
	int kellyWorkCount=k;
	   if(ashaWorkCount>kellyWorkCount){
		   int ashaWorkCurrenrCount=ashaWorkCount;
		   int dayCounter=1;
		   int kellyCurrentCount=kellyWorkCount;
		    while(ashaWorkCurrenrCount>=kellyCurrentCount){
		    	ashaWorkCurrenrCount=ashaWorkCurrenrCount+a;
		    	kellyCurrentCount=kellyCurrentCount+k;
		    	dayCounter++;
		    }
		    return dayCounter;
	   
	   }
	   else if(ashaWorkCount<kellyWorkCount){
		    return 1;
	   }else{
		   return 2;
	   }
}




}
