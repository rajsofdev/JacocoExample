package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void test1() {
		Palindrome obj1=new Palindrome();
		obj1.containsOrNot("Seleniam is Test Automation Tool");
	}

}
