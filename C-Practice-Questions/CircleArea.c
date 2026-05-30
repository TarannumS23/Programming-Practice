// write a program which accepts radius of a circle and calculates its area.
// Consider the value of pi as 3.14. (area of circle = pi * radius * radius)
// Input: 5.3
// Output : 88.2026
// input: 10.4
// output: 339.6224

#include <stdio.h>

#define PI 3.14

double CircleArea(float fRadius)
{
    double dArea = 0.0;

    dArea = PI * fRadius * fRadius;

    return dArea;
}

int main()
{
    float fValue = 0.0;
    double dRet = 0.0;

    printf("Enter radius : ");
    scanf("%f", &fValue);

    dRet = CircleArea(fValue);

    printf("Area of circle is : %lf", dRet);

    return 0;
}