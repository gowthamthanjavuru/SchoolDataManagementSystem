import java.util.List;
import java.util.Scanner;

public class School {
private List<Student> students;
private List<Teacher> teachers;
private static int moneyEarned;
private static int moneySpent;
private static int totalmoney;
public List<Student> getStudents() {
	return students;
}
public List<Student> getStudentDetails()
{
	//List<Student> students=SchoolDao.getStudents();
	
	  for(Student student : students) {
	  System.out.printf("id : %-5d name : %-10s fees : %d\n",student.getId(),
	  student.getName(),student.getFees()); }
	 return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
public List<Teacher> getTeacher(){
	return teachers;
}
public List<Teacher> getTeacherDeatils() {
	
	//List<Teacher> teachers=SchoolDao.getTeachers();
	
	 for(Teacher teacher : teachers) {
	 System.out.printf("id : %-5d name : %-10s\n",teacher.getId(),teacher.getName());
	  } 
	 return teachers;
	 
}
public void setTeachers(List<Teacher> teachers) {
	this.teachers = teachers;
}
public static int getMoneyEarned() {
	return moneyEarned;
}

public static int getMoneySpent() {
	return moneySpent;
}

public static int getTotalmoney() {
	return totalmoney;
}
public void payFees(int id)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the money to pay");
	 int feeMoney=sc.nextInt();
	int res= SchoolDao.updateFee(feeMoney, id);
	if(res>0)
	{
		SchoolDao.updateMoney(feeMoney);
		System.out.println("Fee successfully paid ");
	}
}
public void paySalary(int id)
{
	
}
public School(List<Student> students, List<Teacher> teachers) {
	super();
	this.students = students;
	this.teachers = teachers;
	moneyEarned=0;
	moneySpent=0;
	totalmoney=0;
}
}
