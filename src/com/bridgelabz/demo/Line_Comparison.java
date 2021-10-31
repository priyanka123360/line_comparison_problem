package com.bridgelabz.demo;

import java.util.Scanner;

public class Line_Comparison {
	public static void main(String[] args) {

		int x1, x2, y1, y2;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1,x2,y1,y2 point");

		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();

		double length = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("length of line = " + length);

	}
}
