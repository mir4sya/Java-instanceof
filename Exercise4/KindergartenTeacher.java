
/**
 * Write a description of class KindergartenTeacher here.
 *
 * (Nuramirah Hasya binti Mohd Nizam, 2020840206)
 * (CS2535C)
 */
public class KindergartenTeacher extends Teacher
{
    private int OTHours; //overtime hours per month
    
    //constructor
    public KindergartenTeacher( String name, String icNo, int YOS, int oh)
    {
        super( name, icNo, YOS );
        OTHours = oh;
    }
    
    public int getOTHours()
    {
        return OTHours;
    }
    
    public void setOTHours(int OTHours)
    {
        this.OTHours = OTHours;
    }
    
    @Override
    public String toString()
    {
         return "Teacher name :" + getName() + " IC Card No :" + getIcNo() + " OT Hours :" + OTHours;
    }
    
    public double calculateSalary()
    {
        double salary = 0.0;
        double OTPay = OTHours * 10.0;
        if( getYOS() <= 2)
        {
            salary = 1200;
        }
        else if( getYOS() > 2 && getYOS() <= 5)
        {
            salary = 1800;
        }
        else if( getYOS() > 5 )
        {
            salary = 2000;
        }
        salary = salary + OTPay;
        return salary;
    }
}
        
        
