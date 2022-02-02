package com.codekuul.stepdefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParametrizationDemo {
	int x,y,result=0;
	String first,second;
	List<Integer> numbers;
	 Map<String, List<Integer>> m;
	@Given("i have {int} and {int}")
	public void m1(Integer int1, Integer int2) {
	    x = int1;
	    y = int2;
	}

	@When("i make sum of  them")
	public void m2() {
	   result = x + y;
	}

	@Then("print result")
	public void print_result() {
	   System.out.println("result is " + result);
	}
	
	@Given("I have {string} and {string}")
	public void m1(String first, String second) {
	   this.first = first;
	   this.second = second;
	}
	@Then("print them in alphabeatical order")
	public void printingInAlphabeaticalOrder() {
		if(first.compareTo(second) == 0) {
			System.out.println("strings are identical");
		}
		else if(first.compareTo(second)>0) {
			System.out.println(second + " " +first);
		}
		else {
			System.out.println(first + " " +second);
		}

	}
	
	@Given("i have following list")
	public void m4(io.cucumber.datatable.DataTable dataTable) {
	    numbers = dataTable.asList(Integer.class);
	}

	@Then("i print it")
	public void m5() {
		for(Integer num:numbers)
	    System.out.println(num);
	}
	
	@Given("i have following table")
	public void i_have_following_table(io.cucumber.datatable.DataTable dataTable) {
	  // Map<String,List<Integer>>  m = dataTable.asMap(String.class,List.class );
		 List l = dataTable.column(1);
	    System.out.println(l);
	}

	@Then("i print table")
	public void i_print_table() {
	    System.out.println(m);
	}

}
