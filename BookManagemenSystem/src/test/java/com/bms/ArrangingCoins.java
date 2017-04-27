package com.test;

public class ArrangingCoins {
public static void main(String[] args) {
	 long[] coins={2,8,5,3};
	 arrangeCoins(coins);
}

private static void arrangeCoins(long[] coins) {
	 for(int i=0;i<coins.length;i++){
		    long currrentCoins=coins[i];
		    int  c=1;
		    while(c*(c+1)<=2*currrentCoins){
		    	  c++;
		    	 continue;
		    	
		    }
		    System.out.println(--c);
	    }
	
}
}
