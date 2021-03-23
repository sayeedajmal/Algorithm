#include <stdio.h>
#include <time.h>
#define max 20
int partition(int a[max], int, int);
void qsort(int a[], int low, int high)
{
    int j;
    if (low < high)
    {
        j = partition(a, low, high);
        qsort(a, low, j - 1);
        qsort(a, j + 1, high);
    }
}
int partition(int a[], int low, int high)
{
    int pivot, i, j, temp;
    pivot = a[low];
    i = low + 1;
    j = high;
    while (1)
    {
        while (pivot > a[i] && i <= high)
            i++;
        while (pivot < a[j])
            j--;
        if (i < j)
        {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        else
        {
            temp = a[j];
            a[j] = a[low];
            a[low] = temp;
            return j;
        }
    }
}
void main()
{
    int a[max], i, n;
    int clock_t, begin, end;
    double time_required = 1.0 * ((double)(end - begin)) / CLOCKS_PER_SEC;
    printf("Enter the value of n: ");
    scanf("%d", &n);
    printf("Enter the array Elements: \n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\n The array Elements before Sorting \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    begin = clock();
    qsort(a, 0, n - 1);
    end = clock();
    printf("\n Elements of the array after sorting are: \n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
    printf("\nTime Taken: %2f", time_required);
}