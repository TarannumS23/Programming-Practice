/*
    A fitness app records steps foor 7 days. It wants to show how many days user achieved 
    the goal and what the highest step count was.

    Input : 7 integers(steps)
    Validations : steps must be >= 0
    Expected Output : Goal Acheived Days : <count>
                      Maximum Steps in Week : <value>
    Assumption : Goal per day : 10000 steps
*/
import java.util.*;

class WeeklyStepAnalysis 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int[] steps = new int[7];
        int max = 0;
        int goalDays = 0;
        int goal = 10000;

        for(i = 0; i < 7; i++)
        {
            System.out.println("Enter Step Count of day"+(i+1)+" : ");
            steps[i] = sobj.nextInt();

            if(steps[i] < 0)
            {
                System.out.println("Invalid Steps");
                return;
            }

            if( steps[i] >= goal)
            {
                goalDays++;
            }

            if(steps[i] > max)
            {
                max = steps[i];
            }     
        }

        System.out.println("Goal Achieved Days : "+goalDays);
        System.out.println("Maximum Steps in Week : "+max);
        
    }
}


