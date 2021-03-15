#include <stdio.h>
int main()
{
    int i, j, k;
    k = 5;
    for (i = 1; i <= k; i++)
    {
        for (j = i; j >= 1; j--)
        {
            printf("%d", j);
        }
        printf("\n");
    }
    return 0;
}
