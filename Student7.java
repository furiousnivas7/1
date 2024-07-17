class Student7{
	int id;
	int [] marks;
	String name;
	
	
	Student7(int id ,String name){
		this.id=id;
		this.name=name;
	}
	
	void setmarks(int[] marks){
		this.marks=marks;
		
	}
	

	int caltotal(){
		int total=0;
		for(int i=0; i<marks.length;i++){
			total=total+marks[i];
		}
		return total;
		
	}
	
	double calavg(int total){
		
	double avg;
	avg=total/marks.length;
	return avg;
		
	}
	
	char getresult(double avg){
		char result;
		
		if(avg>=75){
			result='A';
		}
		else if(avg>=65){
			result='B';
		}
		else if(avg>=55){
			result= 'C';
		}
		else if(avg>=45){
			result= 'S';
		}
		else{
			result= 'F';
		}
		
		return result;
				
	}
	
	
	void display(){
		int total=this.caltotal();
		double avg=this.calavg(total);
		char result=this.getresult(avg);
		
		System.out.println("ID:"+this.id);
		System.out.println("Name:"+this.name);
		
		for(int i=0; i<marks.length;i++){
		System.out.println("Mark"+(i+1)+" "+this.marks[i]);
			
		}
		
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
		System.out.println("Result:"+result);
		
	}
	
	
	
}
