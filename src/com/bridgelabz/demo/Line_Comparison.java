package com.bridgelabz.demo;

import java.util.Scanner;

public class Line_Comparison {
	public static void main(String[] args) {

		int x1, x2, y1, y2, p1, p2, q1, q2;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1, x2, y1, y2, p1, p2, q1, q2 point");

		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		p1 = sc.nextInt();
		p2 = sc.nextInt();
		q1 = sc.nextInt();
		q2 = sc.nextInt();

		double length1 = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double length2 = (double) Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1));
		System.out.println("length of line1 = " + length1);
		System.out.println("length of line2 = " + length2);
		if (length1 == length2) {
			System.out.println(" Both lines are equal in length");

		} else {
			if (length1 < length2) {
				System.out.println(" Length of line 2 is greater than line 1 ");
			} else {
				if (length1 > length2) {
					System.out.println(" Length of line 1 is greater than line 2 ");
				} else {
					System.out.println(" Both lines have different Length ");
				}
			}

		}

	}
}
