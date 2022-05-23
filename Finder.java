import java.util.ArrayList;
public class Finder
{
 
 public static void main(String[] args)
  {
    College umd = new College("umd", 3.5, 1100, 27);
    ArrayList<College> tempList = College.load();
    //System.out.println(tempList+ "\n");
    Student ray = new Student("Ray", 3.8, 1200, 29);
    Student john = new Student("John", 3.3, 1000, 20);
    Student anthony = new Student("Anthony", 3.6, 1135, 20);
    Student johnatan = new Student("Johnatan", 3.2, 1320, 23);
    Student emanuel = new Student("Emanuel", 2.4, 1225, 31);
    Student moses = new Student("Moses", 3.7, 1135, 28);
    Student mike = new Student("Mike", 2.5, 1300, 29);
    ArrayList<Student> studentTemp = new ArrayList<>();
    studentTemp.add(ray);
    studentTemp.add(john);
    studentTemp.add(anthony);
    studentTemp.add(johnatan);
    studentTemp.add(emanuel);
    studentTemp.add(moses);
    studentTemp.add(mike);
    ArrayList<Student> admittedStud = umd.rightStudent(studentTemp);
    System.out.println("Students admitted into umd: \n"+ admittedStud);
    
   // ArrayList<College> potentCollege = ray.rightCollege(tempList);
   // System.out.println(potentCollege);
   
     
     
   
    //System.out.println(anthony);
  }//method
}// class