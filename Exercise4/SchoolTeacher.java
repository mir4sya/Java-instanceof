
/**
 * Write a description of class SchoolTeacher here.
 *
 * (Nuramirah Hasya binti Mohd Nizam, 2020840206)
 * (CS2535C)
 */
public class SchoolTeacher extends Teacher
{ 
    private String grade; //e.g DG41, DG44, DG48, DG52
    
    //constructor
    public SchoolTeacher(String name, String icNo, int YOS, String g)
    {
        super( name, icNo, YOS );
        grade = g;
    }
    
    //accessor
    public String getGrade()
    {
        return grade;
    }
    
    //mutator
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    @Override
    public String toString()
    {
         return "Name :" + getName() + "IC Card No :" + getIcNo() + "Grade :" + grade;
    }
    
    public double calculateSalary()
    {
        double salary = 0.0;
        if(getGrade().equals("DG41"))
        {
            salary = 1900;
        }
        else if(getGrade().equals("DG44"))
        {
            salary = 3300;
        }
        else if(getGrade().equals("DG48"))
        {
            salary = 4900;
        }
        else if(getGrade().equals("DG52"))
        {
            salary = 5500;
        }
        return salary;
    }
}
