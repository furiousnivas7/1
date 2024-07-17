class Student6{
	int id;
	String fname;
	String lname;
	
	Student6(int id){
		this.id=id;
	}
	void setfullname(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	String getfullName(){
		String fullname=this.fname+" "+this.lname;
		return fullname;
	}
	void display(){
		System.out.println("id:-"+this.id);
		System.out.println("fname:-"+this.fname);
		System.out.println("lname:-"+this.lname);
		String fullna=this.getfullName();
		System.out.println("fullname:-"+fullna);
	}
		
}
		