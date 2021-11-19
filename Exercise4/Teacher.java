
/**
 * Abstract class Teacher - write a description of the class here
 *
 * (Nuramirah Hasya binti Mohd Nizam, 2020840206)
 * (CS2535C)
 */
public abstract class Teacher
{
    private String name;
    private String icNo; //id card no
    private int YOS;     //year of service

    public abstract double calculateSalary();
    
    //constructor
    public Teacher( String n, String io, int y)
    {
        name = n;
        icNo = io;
        YOS = y;
    }
    
    //accessor methods
    public String getName()
    {
        return name;
    }
    public String getIcNo()
    {
        return icNo;
    }
    public int getYOS()
    {
        return YOS;
    }
    
    public String toString()
    {
        return "Name :" + name + "IC Card No :" + icNo + "Year of service :" + YOS;
    }
    
}
