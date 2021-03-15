#include <stdio.h>
#define TRUE 1
#define FALSE 0
int main()
{
    int i, j, k;
    int n, a[10][10], in[10], visit[10];
    int count = 0;
    printf("\n\n \t Topological Sorting: ");
    n = 4;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            a[i][j] = 0;
        }
    }
    printf("\n Graph is Created as Follows: ");
    printf("\n The Node '0' and '1' are Connected: ");
    a[0][1] = 1;
    printf("\n The Node '0' and '2' are Connected: ");
    a[0][2] = 1;
    printf("\n The node '3' & '2' are Connected: ");
    a[3][2] = 1;
    for (i = 0; i < n; i++)
    {
        in[i] = 0;
        visit[i] = FALSE;
    }
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            in[i] = in[i] + a[j][i];
    printf("\n The Topological Order is: ");
    while (count < n)
    {
        for (k = 0; k < n; k++)
        {
            if ((in[k] == 0) && (visit[k] == 0))
            {
                printf("%d", k);
                visit[k] = TRUE;
            }
            for (i = 0; i < n; i++)
            {
                if (a[i][k] == 1)
                    in[k]--;
            }
        }
        count++;
    }
    return 0;
}