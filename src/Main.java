import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
                Scanner sc=new Scanner(System.in);
                System.out.println("enter no of students");
                int n=sc.nextInt();
                StudentGroup sg=new StudentGroup(n);
                while(true)
                { 
                   System.out.println("MENU");
                   System.out.println("1.GetStudents");
                   System.out.println("2.SetStudents");
                   System.out.println("3.GetStudent");
                   System.out.println("4.SetStudent");
                   System.out.println("5.addFirst"); 
                   System.out.println("6.addLast");
                   System.out.println("7.add");
                   System.out.println("8.removebyindex");
                   System.out.println("9.removebystudent");
                   System.out.println("10.removefromindex");
                   System.out.println("11.removefromelement");
                   System.out.println("12.removetoindex");
                   System.out.println("13.removetoelement");
                   System.out.println("14.getByBirthDate");
                   System.out.println("15.getBetweenBirthDates");
                   System.out.println("16.getNearBirthDate");
                   System.out.println("17.getCurrentAgeByDate");
                   System.out.println("18.getStudentsByAge");
                   System.out.println("19.getStudentsWithMaxAvgMark");
                   System.out.println("20.getNextStudent");
                   System.out.println("enter choice");
                   int ch=sc.nextInt();
                   switch(ch)
                   {
                      case 1: Student[] stud=sg.getStudents();
                              for(Student sl:stud)
                                 System.out.println(sl);
                              break;
                      case 2:Student[] stu=new Student[n];
                             for(int i=0;i<n;i++)
                             {
                              System.out.println("enter id");
                              int id=sc.nextInt();
                              System.out.println("enter fullname");
                              String name=sc.next();
                              System.out.println("enter DateOfBirth");
                              Date d=new Date(sc.next());
                              System.out.println("enter average marks");
                              double avg=sc.nextDouble();
                             }
                             break;
                      case 3:System.out.println("enter the index from the student has to get");
                             int index=sc.nextInt();
                             Student stu1=sg.getStudent(index);
                             System.out.println(stu1.getId());
                             System.out.println(stu1.getFullName());
                             System.out.println(stu1.getBirthDate());
                             System.out.println(stu1.getAvgMark());
                             break;
                      case 4:break;
                      case 5:break;
                      case 6:break;
                      case 7:break;
                      case 8:break;
                      case 9:break;
                      case 10:break;
                      case 11:break;
                      case 12:break;
                      case 13:break;
                      case 14:break;
                      case 15:break;
                      case 16:break;
                      case 17:break;
                      case 18:break;
                      case 19:break; 
                      case 20:break;
                   }
             } 
       }

}
