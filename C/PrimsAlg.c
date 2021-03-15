#include <stdio.h>
#define SIZE 20
#define INFINITY 32767
void prim(int G[SIZE][SIZE], int nodes)
{
    int select[SIZE], i, j, k;
    int min_dist, v1, v2, total = 0;
    for (i = 0; i < nodes; i++)
        select[i] = 0;
    printf("\n\nThe minimal Spinning tree is: \n");
    select[0] = 1;
    for (k = 1; k < nodes; k++)
    {
        min_dist = INFINITY;
        for (i = 0; i < nodes; i++)
        {
            for (j = 0; j < nodes; j++)
            {
                if (G[i][j] && ((select[i] && !select[j]) || (!select[i] && select[i])))
                {

                    if (G[i][j] < min_dist)
                    {
                        min_dist = G[i][j];
                        v1 = i;
                        v2 = j;
                    }
                }
            }
        }
        //This is out of Prims Logic
        printf("\n Edges(%d%d)and weight=%d", v1, v2, min_dist);
        select[v1] = select[v2] = 1;
        total = total + min_dist;
    }
    printf("\n\t Total path length is=%d", total);
}
void main()
{
    int G[SIZE][SIZE], nodes;
    int v1, v2, length, i, j, n;
    printf("\n\t Prims Algorithm \n");
    printf("\n Enter the number of Nodes in the Graph: ");
    scanf("%d", &nodes);
    printf("\n Enter the Number of Edges in the Graph: ");
    scanf("%d", &n);
    for (i = 0; i < nodes; i++)
        for (j = 0; j < nodes; j++)
            G[i][j] = 0;
    printf("\nEnter edges in the Graphs");
    for (i = 0; i < n; i++)
    {
        printf("\n Enter eges by v1 and v2:");
        scanf("%d%d", &v1, &v2);
        printf("Enter corresponding weights: ");
        scanf("%d", &length);
        G[v1][v2] = G[v2][v1] = length;
    }
    printf("\n\t");
    prim(G, nodes);
}