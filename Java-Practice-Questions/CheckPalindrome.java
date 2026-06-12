class CheckPallindrome
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}
class Logic
{
    void checkPalindrome(int num)
    {
        int rev = 0;
        while(num > 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of the number: " + rev);
    }
}

