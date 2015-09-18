package software.ryancook.sort;

public class QuickSort
{
    char[] list;

    public void sort(char[] list)
    {
        this.list = list;
        quickSort(0, list.length - 1);
    }

    private void quickSort(int lo, int hi)
    {
        if (lo >= hi) {
            return;
        }

        int p = 0;
        if (lo < hi) {
            p = partition(lo, hi);
        }
        quickSort(lo, p - 1);
        quickSort(p + 1, hi);
    }

    private int partition (int lo, int hi)
    {
        char pivot = list[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (list[j] <= pivot) {
                swap(i, j);
                i++;
            }
        }
        swap(i, hi);
        return i;
    }

    private void swap(int a, int b)
    {
        char temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}