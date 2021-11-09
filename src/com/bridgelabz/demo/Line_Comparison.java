package com.bridgelabz.demo;

import java.util.Scanner;

public class Line_Comparison {
	int x1, x2, y1, y2;

	public double Length() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter x1, x2, y1, y2 point");
		x1 = sc.nextInt();
		x2 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();

		double length = (double) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("length of line = " + length);
		return length;
	}

	public static void compareTo(double length1, double length2) {

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

	public static void main(String[] args) {
		double length1, length2;
		Line_Comparison length = new Line_Comparison();
		length1 = length.Length();
		length2 = length.Length();
		compareTo(length1, length2);
	}

}
