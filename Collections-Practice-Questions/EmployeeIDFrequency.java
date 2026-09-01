/*
    A company records employee IDs whenever employees enter the office :
    101 102 103 101 104 102 101 105

    Write a java program that displays how many times each employee entered the office.
    Expected output :
    101 -> 3
    102 -> 2
    103 -> 1
    104 -> 1
    105 -> 1
*/

import java.util.*;

class EmployeeIDFrequency
{
    public static void main(String A[])
    {
        int Arr[] = {101,102,103,101,104,102,101,105};

        HashMap <Integer, Integer> frequency = new HashMap<Integer, Integer>();

        for(int id : Arr)
        {
            frequency.put(id, frequency.getOrDefault(id, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> eobj : frequency.entrySet())
        {
            System.out.println(eobj.getKey()+"->"+eobj.getValue());
        }
    }
}