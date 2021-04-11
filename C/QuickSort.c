#include <stdio.h>
#include <time.h>

void Quick(int A[10], int, int);
int partition(int A[10], int, int);
void swap(int A[10], int *, int *);

/* MAIN */
int main()
{
    int begin, clock_time, end;
    double time_required = 1.0 * ((double)(end - begin)) / CLOCKS_PER_SEC;
    int A[10];
    printf("\n\t\t Sorting Using QuickSort: ");
    printf("\nEnter Total number of  Elements: ");
    int number;
    scanf("%d", &number);
    for (int i = 0; i < number; i++)
    {
        printf("\nEnter the number %d: ", i + 1);
        scanf("%d", &A[i]);
    }
    begin = clock_time;
    Quick(A, 0, number - 1);
    end = clock_time;

    printf("\n\nSorted Element is :: ");
    for (int i = 0; i < number; i++)
    {
        printf("\t%d", A[i]);
        printf("\nThe Time required is: %.2f", time_required);
    }
    return 0;
}
/* Partition */
int partition(int A[10], int low, int high)
{
    int pivot = A[low], i = low, j = high;
    while (i <= j)
    {
        while (A[i] <= pivot)
            i++;
        while (A[j] > pivot)
            j--;
        if (i < j)
            swap(A, &i, &j);
    }
    swap(A, &low, &j);
    return j;
}

/* Swap */
void swap(int A[10], int *i, int *j)
{
    int temp;
    temp = A[*i];
    A[*i] = A[*j];
    A[*j] = temp;
}

/* Quick */
void Quick(int A[10], int low, int high)
{
    int m, i;
    if (low < high)
    {
        m = partition(A, low, high);
        Quick(A, low, m - 1);
        Quick(A, m + 1, high);
    }
}