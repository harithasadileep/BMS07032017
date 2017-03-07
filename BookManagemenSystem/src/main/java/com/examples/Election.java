package com.examples;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Election
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		HashMap<String,Integer> tm=new  HashMap<String,Integer>();
		TreeMap<String,Integer> hm=new TreeMap <String,Integer>();
		String[] ece = new String[t];
		for (int i=0;i<t;i++)
		{
			ece[i]=in.next();            
		}

		for (int i = 0; i < ece.length; i++) {
			int vote = 0;
			String cacdvote = ece[i];
			for (int k = 0; k < ece.length; k++) {
				if (cacdvote.equals(ece[k])){
					vote++;

				}
			}
			tm.put(cacdvote,vote);
			/** for(int j=0;j<ece.length;j++)
	        {

	        }**/
		}
		// Collections.sort(tm,new votecomparotor());  
		// Collections.so
		int max=0;
		for(Map.Entry m:tm.entrySet()){

			if(max < (int)m.getValue())
				max=(int)m.getValue();
		}  
		for(Map.Entry m:tm.entrySet()){

			if(max ==(int)m.getValue())
				hm.put((String) m.getKey(),(int) m.getValue());
		}  
		String last=hm.lastKey();
		// System.out.println(max);
		System.out.println(last);
	}}
/**class votecomparotor  implements Comparator<TreeMap>{
	private TreeMap<String,Integer> map;

	@Override
	public int compare(TreeMap o1, TreeMap o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}**/