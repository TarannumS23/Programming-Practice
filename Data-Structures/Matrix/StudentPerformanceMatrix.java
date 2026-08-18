/*
    A college stores marks of students in multiple subjects using a 2D matrix.

    Rows represent students.
    Columns represent subjects.

    Requirements :
        1] Calculate total marks of each student.
        2] Identify the topper.
        3] Calculate average marks for each subject.
        4] Print students who failed in any subject (marks < 35).

    Input :
        N = Number of students
        M = Number of subjects
        N x M marks

    Validations :
        N > 0
        M > 0
        Marks must be between 0 and 100.

    Expected Output :
        Student Totals
        Topper
        Subject Averages
        Failed Students
*/
import java.util.*;

class StudentPerformanceMatrix
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of students : ");
        int N = sobj.nextInt();

        System.out.println("Enter number of subjects : ");
        int M = sobj.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int[][] marks = new int[N][M];

        System.out.println("Enter marks of students : ");

        for(int i = 0; i < N; i++)
        {
            System.out.println("Enter marks for Student " + (i + 1) + " : ");

            for(int j = 0; j < M; j++)
            {
                marks[i][j] = sobj.nextInt();

                if(marks[i][j] < 0 || marks[i][j] > 100)
                {
                    System.out.println("Invalid Marks");
                    return;
                }
            }
        }

        StudentPerformance pobj = new StudentPerformance(marks);

        int[] studentTotals = pobj.calculateStudentTotals();
        int topper = pobj.findTopper(studentTotals);
        double[] subjectAverages = pobj.calculateSubjectAverages();
        boolean[] failedStudents = pobj.findFailedStudents();

        System.out.println();
        System.out.println("----- Student Totals -----");

        for(int i = 0; i < studentTotals.length; i++)
        {
            System.out.println("Student " + (i + 1) + " : " + studentTotals[i]);
        }

        System.out.println();
        System.out.println("Topper : Student " + (topper + 1));

        System.out.println();
        System.out.println("----- Subject Averages -----");

        for(int i = 0; i < subjectAverages.length; i++)
        {
            System.out.printf("Subject %d : %.2f%n",
                              (i + 1), subjectAverages[i]);
        }

        System.out.println();
        System.out.println("----- Failed Students -----");

        boolean failedStudentFound = false;

        for(int i = 0; i < failedStudents.length; i++)
        {
            if(failedStudents[i])
            {
                System.out.println("Student " + (i + 1));
                failedStudentFound = true;
            }
        }

        if(!failedStudentFound)
        {
            System.out.println("No students failed");
        }
    }
}

class StudentPerformance
{
    private int[][] marks;

    public StudentPerformance(int[][] marks)
    {
        this.marks = marks;
    }

    public int[] calculateStudentTotals()
    {
        int[] totals = new int[marks.length];

        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                totals[i] = totals[i] + marks[i][j];
            }
        }

        return totals;
    }

    public int findTopper(int[] totals)
    {
        int topper = 0;

        for(int i = 1; i < totals.length; i++)
        {
            if(totals[i] > totals[topper])
            {
                topper = i;
            }
        }

        return topper;
    }

    public double[] calculateSubjectAverages()
    {
        int numberOfStudents = marks.length;
        int numberOfSubjects = marks[0].length;

        double[] averages = new double[numberOfSubjects];

        for(int j = 0; j < numberOfSubjects; j++)
        {
            int subjectTotal = 0;

            for(int i = 0; i < numberOfStudents; i++)
            {
                subjectTotal = subjectTotal + marks[i][j];
            }

            averages[j] = (double) subjectTotal / numberOfStudents;
        }

        return averages;
    }

    public boolean[] findFailedStudents()
    {
        boolean[] failedStudents = new boolean[marks.length];

        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                if(marks[i][j] < 35)
                {
                    failedStudents[i] = true;
                    break;
                }
            }
        }

        return failedStudents;
    }
}