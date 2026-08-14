import java.util.*;

class StudentResultClassification 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 : ");
        int Marks1 = sobj.nextInt();

        System.out.print("Enter marks of subject 2 : ");
        int Marks2 = sobj.nextInt();

        System.out.print("Enter marks of subject 3 : ");
        int Marks3 = sobj.nextInt();

        System.out.print("Enter marks of subject 4 : ");
        int Marks4 = sobj.nextInt();

        System.out.print("Enter marks of subject 5 : ");
        int Marks5 = sobj.nextInt();

        if(Marks1 > 100 || Marks1 < 0 ||
           Marks2 > 100 || Marks2 < 0 ||
           Marks3 > 100 || Marks3 < 0 ||
           Marks4 > 100 || Marks4 < 0 ||
           Marks5 > 100 || Marks5 < 0)
        {
            System.out.println("Invalid Marks");
            System.out.println("Please provide correct marks");
            return;
        }

        if(Marks1 < 35 || Marks2 < 35 || Marks3 < 35 || Marks4 < 35 || Marks5 < 35)
        {
            System.out.println("Fail");
        }
        else
        {
            int Average = 0;

            Average = (Marks1 + Marks2 + Marks3 + Marks4 + Marks5) / 5;

            if(Average >= 75)
            {
                System.out.println("Average Marks : "+Average);
                System.out.println("Final Result : Distinction");
            }
            else if(Average >= 60)
            {
                System.out.println("Average Marks : "+Average);
                System.out.println("Final Result : First Class");
            }
            else if(Average >= 50)
            {
                System.out.println("Average Marks : "+Average);
                System.out.println("Final Result : Second Class");
            }
            else
            {
                System.out.println("Average Marks : "+Average);
                System.out.println("Final Result : Pass");
            }
        }
    }
}
