class MainEmployee{
	public static void main(String args[]){
		Employee Emp=new Employee(100,"nivash");
		double[] basicSalary={490933,234234,545322};
		Emp.setBasicSalary(basicSalary);
		Emp.display();
	}
}