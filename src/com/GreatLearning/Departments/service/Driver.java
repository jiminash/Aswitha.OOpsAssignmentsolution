package com.GreatLearning.Departments.service;

import com.GreatLearning.Departments.model.AdminDepartment;
import com.GreatLearning.Departments.model.HrDepartment;
import com.GreatLearning.Departments.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println("Wecome to "+adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		System.out.println("Wecome to "+hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		System.out.println("Wecome to "+techDepartment.getDepartmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
			
		
	}
}
