package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCodeCove {
	@Test
	public void test1() {
		CompareString obj1=new CompareString();
		obj1.containsOrNot("Seleniam is Test Automation Tool");
	}

}
