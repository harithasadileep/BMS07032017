package com.test;

public class BitGame {
  public static void main(String[] args) {
	System.out.println(maxXor(1,3,3));
}
	
 
  static int maxXor(int left, int right, int k) {
    
	  
	  int m=0;
		int f=left;
	
		 while(f<right){
			// System.out.println("f:"+f);
			 int s=f+1;
			// System.out.println("s:"+s);
			 while(s<=right){
				 int xor = f^s;
			//	 System.out.println("xor:"+xor);
			//	 System.out.println("m:"+m);
	                if (xor>m)
	                	m=xor;
	                s++;
	                
	           //     System.out.println("s++:"+s);
			       }
			   f++;
			   //System.out.println("f++:"+f);
		      }
	     return m;
	     
	     
      }

	
	
	
	
}
