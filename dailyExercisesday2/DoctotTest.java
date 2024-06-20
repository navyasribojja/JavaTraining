package com.java.dailyExercisesday2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoctotTest {

	public static void main(String[] args) {
		BufferedReader b1 =new BufferedReader(new InputStreamReader(System.in));
		Employee dr1=new Employee();
		
		Doctor dr = new Doctor();
		dr1.setName("Dr.Manasa");
		dr1.setSalary(45000);
		dr.setSpeciality("Genereal specialist");
		dr.setOfficeVisit_fees(200);
		System.out.println(dr1);
		System.out.println(dr);
	}

	}
