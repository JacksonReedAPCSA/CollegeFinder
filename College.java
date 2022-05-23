import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class College
{
  private String name;
  private double minGPA;
  private int minSAT;
  private int minACT;
  private ArrayList<Student> studentList;
 
  public College(String n, double minG, int minS, int minA)
  {
    name = n;
    if(minG>= 0.0 && minG<=5.0)
    {
      minGPA =minG;
    }else{minGPA = 2.5;}
    if(minS>=100 && minS<=1600)
    {
      minSAT = minS;
    }else{minSAT = 800;}
   
    if(minA>=1 && minA<=36)
     
    {
      minACT = minA;
    }else{minACT = 18;}
   
    studentList = new ArrayList<>();
  }
  
  public double getMinGpa()
  {
    return minGPA;
  }
  
  public int getMinSat()
  {
    return minSAT;
  }
  
  public int getMinAct()
  {
    return minACT;
  }
  
  /**
   * ArrayList of all the colleges within the text file
   */
  public static ArrayList <College> load()
  {
    ArrayList<College> collegeList = new ArrayList<>();
    try (Scanner scan = new Scanner(new File("Colleges.txt")))
    {
      while(scan.hasNextLine())
      {
        String line = scan.nextLine();
        String[] parts = line.split("\\|");
        String n = parts[0];
        double g = Double.parseDouble(parts[1]);
        int s = Integer.parseInt(parts[2]);
        int a = Integer.parseInt(parts[3]);
        College tempCollege = new College(n, g, s, a);
        collegeList.add(tempCollege);
      }
    } catch(Exception e)
    {
      e.printStackTrace();
    }
    return collegeList;
  }
 
  /**
   * compare to see if the college
   * is compatible with the student parameter
   * return a list of students who got into this particular college
  */
 
  public ArrayList<Student> rightStudent(ArrayList<Student> studentParam)
  {
    for(int i = 0; i<studentParam.size(); i++)
    {
      Student s = studentParam.get(i);
      if(s.getGPA() >= this.minGPA && s.getACT()>= this.minACT && s.getSAT()>= this.minSAT )
      {
        studentList.add(s);
      }
    }
    return studentList;
  }
  
  public String toString()
  {
    return "\n" + name + " has a GPA of: "+ minGPA + " A SAT score of: "+ minSAT + " A ACT score of: "+ minACT;
  }
}//class