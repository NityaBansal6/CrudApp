import com.school.manage.School;
import com.school.manage.SchoolDataBase;
import java.util.*;
public class Start {
	public static void main(String[] args) {
		System.out.println("Welcome to School Management App");
		Scanner sc= new Scanner(System.in);
		int opt ;
		while(true)
		{	
			System.out.println("Press 1 to Create School");
			System.out.println("Press 2 to Delete School");
			System.out.println("Press 3 to Read School");
			System.out.println("Press 4 to Update School");
			System.out.println("Press 5 to Exit");
			opt= sc.nextInt();
			if(opt==1)
			{
				System.out.println("Enter School id :");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter School Name :");
				String sch_name=sc.nextLine();
				System.out.println("Enter Description :");
				String des=sc.nextLine();
				System.out.println("Enter Establish date (dd-mm-yy) :");
				String date=sc.nextLine();
				System.out.println("Enter Status :");
				String status=sc.nextLine();
				School sl=new School(id, sch_name, des, date, status);
				boolean answer=SchoolDataBase.insertSchoolToDB(sl);
				if(answer)
					System.out.println("Student is added Successfully!!");
				else
					System.out.println("Something went wrong Try Again!!!");
				System.out.println(sl);
			}
			else if (opt==2)
			{
				System.out.println("Enter student id to delete");
				int id = sc.nextInt();
				boolean f =SchoolDataBase.deleteSchool(id);
				if(f)
				{
					System.out.println("Successfully deleted");
				}
				
			}
			else if (opt ==3)
			{
				SchoolDataBase.showAllSchools();
				
			}
			else if (opt==4)
			{
				System.out.println("Enter the school id that needs updation");
				int id =  sc.nextInt();
				System.out.println("Enter the new status");
				sc.nextLine();
				String status = sc.nextLine();
				SchoolDataBase.updateSchool(id,status);
			}
			else if (opt==5)
			{
				System.out.println("Thankyou for using my Application!!");
				break;
			}
			else {
				
				
			}
			
		}

	}

}
