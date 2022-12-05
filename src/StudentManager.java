class Student
{
	String name;
	int rollnum;
	String course;
	String email;
	int mobilenum;
	String address;
	char gender;
	int yearofjoin;
	public void printStudent(){
	System.out.println("Student Name : "+name);
	System.out.println("Student Rollnum : "+rollnum);
	System.out.println("Student Course : "+course);
	System.out.println("Student Email : "+email);
	System.out.println("Student Mobilenum : "+mobilenum);
        System.out.println("Student Address : "+address);
	System.out.println("Student Gender : "+gender);
	System.out.println("Student year of joining : "+yearofjoin);
	}
}	
class StudentManager
{
	public static void main(String[] args)
	{
		Student s=new Student();
		s.name="raja";
		s.rollnum=105;
		s.course="java";
		s.email="raja@gmail.com";
		s.mobilenum=95986755;
		s.address="hyd";
		s.gender='m';
		s.yearofjoin=2002;
		s.printStudent();
	}
}
		
			



