import java.util.Scanner;
class Employee{
	int id;
	String name;
	double[] basic_salary;
	
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setBasicSalary(double[] basic_salary){
		for(int i=0;basic_salary.length;i++){
			this.basic_salary=basic_salary[i];
		}
	}
	double calcBonus(double basic_salary){
		double Bonus=0.0;
		if(basic_salary>=100000){
			 Bonus=10000;	
		}else{
			 Bonus=5000;
		}
			return Bonus;
	}
	double calcTex(double sub_salary){
		double tax=0.0;
		
		if (sub_salary>=150000){
			tax=sub_salary*0.05;
		}else{
			tax=sub_salary*0.03;
		}
			return tax;
	}
	double calcSalary(){
		double subsalary=this.basic_salary+this.calcBonus(this.basic_salary);
		double net_salary= subsalary-this.calcTex(subsalary);
			return net_salary;
	}
	void display(){
		System.out.println("id"+this.id);
		System.out.println("name"+this.name);
		System.out.println("basic_salary"+this.basic_salary);
		double bons=this.calcBonus(this.basic_salary);
		System.out.println("bonus"+bons);
		double subsalary=this.basic_salary+bons;
		double tx=this.calcTex(subsalary);
		System.out.println("tex"+tx);
		double ntsalary=this.calcSalary();
		System.out.println("netsalary"+ntsalary);
	}
	
		
		
	
}
	
