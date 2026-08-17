/*
    An online election system stores votes by voter ID. Every voter can vote only once.
    If the same ID apprears again, the vote must be rejected and counted as duplicate.

    Input : Number of votes N
            N voter IDs
    Validations : N >= 0
                  IDs must be non-negative integers
    Expected Output : Valid Votes : <count>
                      Rejected Duplicate Votes : <count>
*/
import java.util.*;

class DuplicateVoteDetection 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        HashSet <Integer>voterIds = new HashSet<Integer>();

        System.out.println("Enter number of votes : ");
        int N = sobj.nextInt();

        if(N < 0)
        {
            System.out.println("Invalid number of votes");
            return;
        }

        int i = 0;
        int validVotes = 0;
        int duplicateVotes =  0;

        for(i = 1; i <= N; i++)
        {
            System.out.println("Enter Voter Id"+i+" : ");
            int ID = sobj.nextInt();

            if(ID < 0)
            {
                System.out.println("Invalid Voter ID");
                return;
            }

            if(voterIds.contains(ID))
            {
                duplicateVotes++;
            }
            else
            {
                voterIds.add(ID);
                validVotes++;
            }
        }

        System.out.println("Valid Votes : "+validVotes);
        System.out.println("Rejected Duplicate Votes : "+duplicateVotes);
    }
}

