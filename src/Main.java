
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	List<Teacher> teacher=new ArrayList<>();
	List<Student> student=new ArrayList<>();
	School maharshi=new School(student,teacher);
	System.out.println("------->WELCOME TO MAHARSHI SCHOOL<>--------");
	System.out.println();
	maharshi.setStudents(SchoolDao.getStudents());
	maharshi.setTeachers(SchoolDao.getTeachers());
	while(true)
	{
		System.out.println();
		System.out.println();
		System.out.println("Enter 1 : To add Student\nEnter 2 : To add Teacher\nEnter 3 : To get Student list\nEnter 4 : To get Teacher List\nEnter 5 : To get TotalMoney\nEnter 6 : To pay Student fees\nEnter 7 : To exit");
		int res=sc.nextInt();
		switch(res)
		{
		case 1:
			SchoolDao.insertStudent();
			break;
		case 2:
             SchoolDao.insertTeacher();
			break;
		case 3:
             maharshi.getStudentDetails();
			break;
		case 4:
			maharshi.getTeacherDeatils();
			break;
		case 5:
		    SchoolDao.getMoney();
			break;
		case 6:
			System.out.println("Enter the id");
			int id=sc.nextInt();
		   maharshi.payFees(id);
			break;
		case 8:
			System.exit(0);
			break;
		}
	}
}
}
