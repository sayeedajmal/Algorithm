#include <stdio.h>
#define infinity 999
int path[10];
void main()
{
    int tot_nodes, i, j, cost[10][10], dist[10], s[10];
    void create(int tot_nodes, int cost[][10]);
    void Dijkstra(int tot_nodes, int cost[][10], int i, int dist[10]);
    void display(int i, int j, int dist[10]);
    printf("\n\t\tCreating of Graph");
    printf("\n Enter total number of Nodes: ");
    scanf("%d", &tot_nodes);
    create(tot_nodes, cost);
    for (i = 0; i < tot_nodes; i++)
    {
        printf("\n\t\t press any Key to Continue....");
        printf("\n\t When sources=%d\n", i);
        for (j = 0; i < tot_nodes; j++)
        {
            Dijkstra(tot_nodes, cost, i, dist);
            if (dist[j] == infinity)
                printf("\n There is no path to %d\n", j);
            else
            {
                display(i, j, dist);
            }
        }
    }
}
void create(int tot_nodes, int cost[][10])
{
    int i, j, val, tot_edges, count = 0;
    for (i = 0; i < tot_nodes; i++)
    {
        for (j = 0; j < tot_nodes; j++)
        {
            if (i == j)
                cost[i][j] = 0;
            else
                cost[i][j] = infinity;
        }
    }
    printf("\n Total numbers of edges: ");
    scanf("%d", &tot_edges);
    while (count < tot_edges)
    {
        printf("\nEnter vi and vj");
        scanf("%d%d", &i, &j);
        printf("\nEnter the Cost along this edges: ");
        scanf("%d", &val);
        cost[j][i] = val;
        cost[i][j] = val;
        count++;
    }
}
void Dijkstra(int tot_nodes, int cost[10][10], int source, int dist[])
{
    int i, j, v1, v2, min_dist;
    int s[10];
    for (i = 0; i < tot_nodes; i++)
    {
        dist[i] = cost[source][i];
        s[i] = 0;
        path[i] = source;
    }
    s[source] = 1;
    for (i = 0; i < tot_nodes; i++)
    {
        min_dist = infinity;
        v1 = -1;
        for (j = 0; j < tot_nodes; j++)
        {
            if (s[j] == 0)
            {
                if (dist[j] < min_dist)
                {
                    min_dist = dist[j];
                    v1 = j;
                }
            }
        }
        s[v1] == 1;
        for (v2 = 0; v2 < tot_nodes; v2++)
        {
            if (s[v2] == 0)
            {
                if (dist[v1] + cost[v1][v2] < dist[v2])
                {
                    dist[v2] = dist[v1] + cost[v1][v2];
                    path[v2] = v1;
                }
            }
        }
    }
}
void display(int source, int destination, int dist[])
{
    int i;
    printf("\nStep be Step sortest path is.....\n");
    for (i = destination; i != source; i = path[i])
    {
        printf("%d", i);
    }
    printf("%d", i);
    printf("The length=%d", dist[destination]);
}