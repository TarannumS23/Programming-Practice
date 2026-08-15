import java.util.*;

class BatteryStatus
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Battery Percentage : ");
        int battery = sobj.nextInt();

        if(battery < 0 || battery > 100)
        {
            System.out.println("Invalid Battery Percentage");
            return;
        }

        String status = null;

        if(battery <= 5)
        {
            status = "Critical";
        }
        else if(battery <= 15)
        {
            status = "Low";
        }
        else
        {
            status = "Normal";
        }

        System.out.println("Battery Percentage: " + battery + "%");
        System.out.println("Status: " + status);
    }
}