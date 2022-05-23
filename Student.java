import java.util.ArrayList;
public class Student
{
  private String name;
  private double GPA;
  private int SAT;
  private int ACT;
  private ArrayList<College> collegeList;
 
  public Student(String n, double g, int s, int a)
  {
    name = n;
    if(g>= 0.0 && g<=5.0)
    {
      GPA =g;
    }else{GPA = 2.5;}
    if(s>=100 && s<=1600)
    {
      SAT = s;
    }else{SAT = 800;}
   
    if(a>=1 && a<=36)
   
    {
      ACT = a;
    }else{ACT = 18;}
  }//constructor
 
  public double getGPA()
  {
    return GPA;
  }
  
  public String getName()
  {
    return name;
  }
  public int getSAT()
  {
    return SAT;
  }
  public int getACT()
  {
    return ACT;
  }
 
  public ArrayList<College> rightCollege(ArrayList<College> collegeParam)
  {
    for(int i= 0; i<collegeParam.size(); i++)
    {
      College tempCol = collegeParam.get(i);
      if(this.getGPA() >= tempCol.getMinGpa() && this.getACT()>= tempCol.getMinAct() && this.getSAT()>=tempCol.getMinSat())
      {
        collegeList.add(tempCol);
      }
    }
    return collegeList ;
  }
 
  public String toString()
  {
    return name + " has a GPA of: "+ GPA + "\n A SAT score of: "+ SAT + "\n A ACT score of: "+ ACT + "\n";
  }
 
}//class