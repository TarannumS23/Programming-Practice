/*
    User enters usage: calls(min), data(GB), SMS(count).
    App suggests the cheapest plan among 4 plans.

    If usage exceeds plan limits, extra charges are added.

    Input : mins, gb, sms
    Output : recommendedPlan, totalCost

    Assumptions:
    Basic    : 100 min, 2 GB, 100 SMS  -> Rs.199
    Standard : 300 min, 5 GB, 500 SMS  -> Rs.299
    Premium  : 600 min, 10 GB, 1000 SMS -> Rs.499
    Unlimited: 1000 min, 20 GB, 2000 SMS -> Rs.699

    Extra charges:
    Calls -> Rs.1 per minute
    Data  -> Rs.20 per GB
    SMS   -> Rs.0.50 per SMS
*/

import java.util.*;

class MobilePlanRecommendation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter calls used in minutes : ");
        int mins = sobj.nextInt();

        System.out.println("Enter data used in GB : ");
        double data = sobj.nextDouble();

        System.out.println("Enter SMS used : ");
        int sms = sobj.nextInt();

        if(mins < 0 || data < 0 || sms < 0)
        {
            System.out.println("Values cannot be negative");
            return;
        }

        double basicCost = 0;
        double standardCost = 0;
        double premiumCost = 0;
        double unlimitedCost = 0;

        basicCost = 199;
        standardCost = 299;
        premiumCost = 499;
        unlimitedCost = 699;

        if(mins > 100)
        {
            basicCost = basicCost + (mins - 100) * 1;
        }

        if(data > 2)
        {
            basicCost = basicCost + (data - 2) * 20;
        }

        if(sms > 100)
        {
            basicCost = basicCost + (sms - 100) * 0.50;
        }

        if(mins > 300)
        {
            standardCost = standardCost + (mins - 300) * 1;
        }

        if(data > 5)
        {
            standardCost = standardCost + (data - 5) * 20;
        }

        if(sms > 500)
        {
            standardCost = standardCost + (sms - 500) * 0.50;
        }

        if(mins > 600)
        {
            premiumCost = premiumCost + (mins - 600) * 1;
        }

        if(data > 10)
        {
            premiumCost = premiumCost + (data - 10) * 20;
        }

        if(sms > 1000)
        {
            premiumCost = premiumCost + (sms - 1000) * 0.50;
        }

        if(mins > 1000)
        {
            unlimitedCost = unlimitedCost + (mins - 1000) * 1;
        }

        if(data > 20)
        {
            unlimitedCost = unlimitedCost + (data - 20) * 20;
        }

        if(sms > 2000)
        {
            unlimitedCost = unlimitedCost + (sms - 2000) * 0.50;
        }

        String recommendedPlan = null;
        double totalCost = 0.0;

        if(basicCost <= standardCost &&
           basicCost <= premiumCost &&
           basicCost <= unlimitedCost)
        {
            recommendedPlan = "Basic";
            totalCost = basicCost;
        }
        else if(standardCost <= premiumCost &&
                standardCost <= unlimitedCost)
        {
            recommendedPlan = "Standard";
            totalCost = standardCost;
        }
        else if(premiumCost <= unlimitedCost)
        {
            recommendedPlan = "Premium";
            totalCost = premiumCost;
        }
        else
        {
            recommendedPlan = "Unlimited";
            totalCost = unlimitedCost;
        }

        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Total Cost: Rs." + totalCost);
    }
}