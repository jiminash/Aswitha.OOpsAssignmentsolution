package com.GreatLearning.Departments.model;

public class HrDepartment extends SuperDepartment{

	public String getDepartmentName() {
		return "HR Department";
	}
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}
