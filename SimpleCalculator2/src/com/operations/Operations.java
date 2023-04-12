package com.operations;

import java.util.Scanner;

import com.addition.AdditionMain;
import com.average.AverageMain;
import com.cube.CubeMain;
import com.division.DivisionMain;
import com.even.or.odd.EvenOrOddMain;
import com.factors.FactorsMain;
import com.modulus.ModulusMain;
import com.multiplication.MultiplicationMain;
import com.square.SquareMain;
import com.subtraction.SubtractionMain;

public class Operations {

	public static void main(String[] args) {

		System.out.println("Welcome to console based application... Ram");
		System.out.println("Below Are The Choices You Have...");
		System.out.println("1. Addition of two number\n" + "2. Subtraction of two number\n"
				+ "3. Multiplication of two number\n" + "4. Division of two number\n" + "5. Modulus of two number\n"
				+ "6. Square of number\n" + "7. Cube of number\n" + "8. Average of numbers\n"
				+ "9. Factors of numbers\n" + "10. Find out even or odd number");


		// taking choice input from ram
		System.out.println("Enter the choice>>");
		// create one scanner class & use that scanner for all choices
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		// writing switch case for Ten Functions
		switch (choice) {
		case 1:
			System.out.println("Enter First Number>>");
			int first = sc.nextInt();
			System.out.println("Enter Second Number>>");
			int second = sc.nextInt();

			AdditionMain addi = new AdditionMain(); // creating object
			int add = addi.getAddition(first, second); // calling method
			System.out.println("Addition of Two Number>> " + add);
			break;

		case 2:
			System.out.println("Enter First Number>>");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number>>");
			int num2 = sc.nextInt();

			SubtractionMain subtr = new SubtractionMain();
			int sub = subtr.getSubtraction(num1, num2);
			System.out.println("Subtraction of Two Number>> " + sub);
			break;

		case 3:
			System.out.println("Enter First Number>>");
			int num3 = sc.nextInt();
			System.out.println("Enter Second Number>>");
			int num4 = sc.nextInt();

			MultiplicationMain multi = new MultiplicationMain();
			int mul = multi.getMultiplication(num3, num4);
			System.out.println("Multiplication of Number>> " + mul);
			break;

		case 4:
			System.out.println("Enter First Number>>");
			double num5 = sc.nextDouble();
			System.out.println("Enter Second Number>>");
			double num6 = sc.nextDouble();

			DivisionMain divi = new DivisionMain();
			double div = divi.getDivision(num5, num6);
			System.out.println("Division Of Number>> " + div);
			break;

		case 5:
			System.out.println("Enter First Number>>");
			int num7 = sc.nextInt();
			System.out.println("Enter Second Number>>");
			int num8 = sc.nextInt();

			ModulusMain modu = new ModulusMain();
			int mod = modu.getModulus(num7, num8);
			System.out.println("Modulus of two number>> " + mod);
			break;

		case 6:
			System.out.println("Enter The Number>>");
			long num9 = sc.nextLong();

			SquareMain squa = new SquareMain();
			long sq = squa.getSquare(num9);
			System.out.println("Square Of Number>> " + sq);
			break;

		case 7:
			System.out.println("Enter The Number>>");
			long num10 = sc.nextLong();

			CubeMain cube = new CubeMain();
			long cu = cube.getCube(num10);
			System.out.println("Cube Of Number>> " + cu);
			break;

		case 8:
			System.out.println("Enter First Number>>");
			double num11 = sc.nextDouble();
			System.out.println("Enter Second Number>>");
			double num12 = sc.nextDouble();
			System.out.println("Enter Third Number>>");
			double num13 = sc.nextDouble();
			System.out.println("Enter Fourth Number>>");
			double num14 = sc.nextDouble();
			System.out.println("Enter Fifth Number>>");
			double num15 = sc.nextDouble();

			AverageMain aver = new AverageMain();
			double avg = aver.getAverage(num11, num12, num13, num14, num15);
			System.out.println("Average of Numbers>> " + avg);
			break;

		case 9:
			System.out.println("Enter The Number>>");
			int num16 = sc.nextInt();

			System.out.println("Factors Of " + num16 + " Are>>");
			FactorsMain fact = new FactorsMain();
			fact.getFactors(num16);
			break;

		case 10:
			System.out.println("Enter The Number>>");
			int num17 = sc.nextInt();

			EvenOrOddMain e = new EvenOrOddMain();
			e.getEvenOrOddNumber(num17);
			break;

		default:
			System.out.println("You have entered Invalid Choice.......");
			break;
		}

	}

}
