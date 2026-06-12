// Write a program to display the grade of a student based on the marks.
class DisplayGrades 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    } 
}

class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 90)
        {
            System.out.println("Grade: A");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade: B");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade: C");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}
