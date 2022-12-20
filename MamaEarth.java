package com.amazon.mamaearth.skincare.facewash;

import java.util.*;

public class MamaEarth {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Welcome to MamaEarth");
		System.out.println("Select your choice from below list");
		System.out.println("1. Neem Face Wash");
		System.out.println("2. Ubtan Face Wash");
		System.out.println("3. Charchol Face Wash");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your choice for face wash");
		
		int FaceWash = scan.nextInt();
		
		switch (FaceWash) {
		
		case 1 :
		System.out.println("Thank you for purchase Neem Face Wash");
		break;
		
		case 2 :
		System.out.println("Thank you for purchase Ubtan Face Wash");
		break;
		
		case 3 :
		System.out.println("Thank you for purchase Charchol Face Wash");
		break;
		
		default :
		System.out.println("You enter wrong choice");
	  }
	}
  }
