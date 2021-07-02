package com.cg.spring.labbook;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Double salary;
	private String businessUnit;
	private int age;
	
	private SBU sbu;

	public SBU getSbu() {
		return sbu;
	}


	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}


	public Employee() {
		super();
	}
	
	
	public Employee(int employeeId, String employeeName, Double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}
	

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessUnit=" + businessUnit + ", age=" + age + ", sbu=" + sbu + "]";
	}

	

	
}
