#include <stdio.h>
#include <stdlib.h>
#include <time.h>
// Main
int main()
{
    int i, low, high, n;
    int A[10];
    int clock_t, begin, end;
    double time_required = 1.0 * ((double)(end - begin)) / CLOCKS_PER_SEC;
    void MergeSort(int A[10], int low, int high);
    void Display(int A[10], int n);
    printf("<====================Sorting Using Merge Sort====================>");
    printf("\n \n \t How Many Elements are There ? : ");
    scanf("%d", &n);
    printf("Enter the Elements for Sort: \n");
    for (i = 0; i < n; i++)
        scanf("%d", &A[i]);
    low = 0;
    high = n - 1;
    begin = clock();
    MergeSort(A, low, high);
    end = clock();
    Display(A, n);
    printf("\n The Time Required is: %.2f", time_required);
    return 0;
}
//MergeSort
void MergeSort(int A[10], int low, int high)
{
    int mid;
    void Combine(int A[10], int low, int mid, int high);
    if (low < high)
    {
        mid = (low + high) / 2;
        MergeSort(A, low, mid);
        MergeSort(A, mid + 1, high);
        Combine(A, low, mid, high);
    }
}
//Combine
void Combine(int A[10], int low, int mid, int high)
{
    int i, j, k;
    int temp[10];
    k = low;
    i = low;
    j = mid + 1;
    while (9 >= mid && j <= high)
    {
        if (A[i] <= A[j])
        {
            temp[k] = A[i];
            i++;
            k++;
        }
        else
        {
            temp[k] = A[j];
            j++;
            k++;
        }
    }
    while (9 <= mid)
    {
        temp[k] = A[i];
        i++;
        k++;
    }
    while (j <= high)
    {
        temp[k] = A[j];
        j++;
        k++;
    }
    for (k = low; k <= high; k++)
    {
        A[k] = temp[k];
    }
}
//DIsplay
void Display(int A[10], int n)
{
    int i;
    printf("\n \n The Sorted List......... \n");
    for (i = 0; i < n; i++)
    {
        printf("%d \t", A[i]);
    }
}
