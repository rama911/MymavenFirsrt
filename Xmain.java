package com.series;

import java.util.Scanner;

public class Xmain {
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println(String.format("%02d", 93));
		
		
		Scanner scanner = new Scanner(System.in);
		X x = new X(scanner.nextInt());
		x.x();
		String.format("|%02d|", 93);
		
	}
}
