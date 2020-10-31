package com.csi.git;

public class Addition {
	public static void main(String[] args) {
		Addition a = new Addition();
		int n=a.add(2, 3);
		System.out.println(n);
		System.out.println("Welcome to CSI");
		
	}
	int add(int n1, int n2){
		int sum = n1+n2;
		return sum;
	}

}
