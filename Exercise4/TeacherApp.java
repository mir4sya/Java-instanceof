
/**
 * Write a description of class TeacherApp here.
 *
 * (Nuramirah Hasya binti Mohd Nizam, 2020840206)
 * (CS2535C)
 */
public class TeacherApp
{
    public static void main(String[] args)
    {
        //N is number of teachers
        final int N = 5;
        
        //declares tList array of sized 5
        Teacher tList[] = new Teacher[N];
        
        tList[0] = new SchoolTeacher("Nur Ain","910521102560",3,"DG48");
        tList[1] = new KindergartenTeacher("Nur Aiman","910118015871",5,15);
        tList[2] = new SchoolTeacher("Zakiah","83012044540",7,"DG41");
        tList[3] = new KindergartenTeacher("Mohd Ashraf","851003013453",15,10);
        tList[4] = new SchoolTeacher("Ramlan","930701106673",7,"DG48");
        
        //1. Display the list of name and salary of school teachers with grade DG41 or DG48.
        System.out.println("-----------------------------------------");
    System.out.println("School teachers with grade DG41 or DG48 :");
    for(Teacher tc : tList) 
    {
       if (tc instanceof SchoolTeacher)
       {
        SchoolTeacher sc = (SchoolTeacher) tc;
            if (sc.getGrade().equals("DG41") || sc.getGrade().equals("DG48"))
            {
            System.out.printf("%s: %.2f\n", sc.getName(), sc.calculateSalary());
        }
           } 
    }
    
        
        //2. Calculate and display the total overtime hours done by the kindergarten teachers.
    int totalOT = 0;
    for(Teacher tc : tList)
    {
        if (tc instanceof KindergartenTeacher) 
        {
        KindergartenTeacher k = (KindergartenTeacher) tc;
        totalOT += k.getOTHours();
        }
    }
        System.out.println("-----------------------------------------");
     System.out.printf("Total OT done by kindergarten teachers: %d\n ", totalOT);
    System.out.println("-----------------------------------------");

        
        //3. Display the information of kindergarten teacher who got the highest salary.
    KindergartenTeacher highestSalaryTc = null;
    double highestSalary = 0;
    for (Teacher tc: tList)
    {
       if (tc instanceof KindergartenTeacher)
       {
         KindergartenTeacher kt = (KindergartenTeacher) tc;
         double salary = kt.calculateSalary();
         if (salary > highestSalary) 
         {
        highestSalary = salary;
        highestSalaryTc = kt;
         }
       }
        }
    if (highestSalaryTc != null) 
    {
       System.out.println("-----------------------------------------");
       System.out.printf("%s has the highest salary of the kindergarten teachers : %.2f", highestSalaryTc.getName(), highestSalary);
       System.out.println("\n-----------------------------------------");
    }
     }
}  
        

