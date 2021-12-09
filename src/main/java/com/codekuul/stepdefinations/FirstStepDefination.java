package com.codekuul.stepdefinations;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefination {
	int num1, num2, total;

	@Given("take two numbers input from the user")
	public void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

	}

	@When("i add them")
	public void m2() {
		total = num1 + num2;
	}

	@Then("verify if addition is prime")
	public void m3() {
		int count = 0;
		for (int i = 1; i < total; i++) {
			if (total % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("total is not prime " + total);
		} else {
			System.out.println("total is prime " + total);
		}

	}

}
