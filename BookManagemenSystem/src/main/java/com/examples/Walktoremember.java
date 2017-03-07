package com.examples;

import java.util.HashSet;
import java.util.Set;

public class Walktoremember {
	//Walktoremember
	static String directions = "rrlrlr";
	static int length = 6;
	static int starting = 1;
	static int end = 2;
	static int currentPoint = starting;
	static Set<String> lPossiblePaths = new HashSet<>();
	static StringBuffer sbCurrentPath = new StringBuffer("");
	public static Set<String> generatePerm(String input) {
		Set<String> set = new HashSet<String>();
		if (input == "")
			return set;
		Character a = input.charAt(0);
		if (input.length() > 1) {
			input = input.substring(1);
			Set<String> permSet = generatePerm(input);
			for (String x : permSet) {
				for (int i = 0; i <= x.length(); i++) {
					set.add(x.substring(0, i) + a + x.substring(i));
				}
			}
		} else {
			set.add(a + "");
		}
		return set;
	}
	public static void main(String[] args) {
		Set<String> generatePerm = generatePerm(directions);
		for (String s : generatePerm) {
			for (int i = 0; i < s.length(); i++) {
				moveTo(s.substring(i, i + 1));
			}
			System.out.println("Compleeted Perm s: "+ s + " paths are \n" + lPossiblePaths);
			sbCurrentPath.setLength(0);
			currentPoint = starting; 
		}
		System.out.println(lPossiblePaths.size());
	}
	static void moveTo(String sMoveDir) {
		int nextPoint = sMoveDir.equalsIgnoreCase("R") ? currentPoint + 1 : currentPoint - 1;
		if ((sMoveDir.equalsIgnoreCase("R") && nextPoint <= length)
				|| (sMoveDir.equalsIgnoreCase("L") && nextPoint >= starting)) {
			sbCurrentPath.append(sMoveDir.equalsIgnoreCase("R") ? "R" : "L");
			if ((sMoveDir.equalsIgnoreCase("R") && nextPoint == end)
					|| sMoveDir.equalsIgnoreCase("L") && nextPoint == starting) {
				lPossiblePaths.add(sbCurrentPath.toString());
				// sbCurrentPath.setLength(0);
			}
			currentPoint = nextPoint;
		}
		// else ignore
	}

}
