package Sort;
public class Merge_sort {
	private	int x[], y[] ;
    private int xSize ;
    
    public Merge_sort(int arr[], int n){  
    	x = arr;                             
    	xSize = n;
    	y = new int[xSize+1];
    }
    public int[] MergeSortCall() {  
    	MergeSort(1, xSize);
    	return x;
    }
    public void MergeSort(int low, int high)
    // a[low : high] is a global array to be sorted.
    // Small(P) is true if there is only one element to
    // sort. In this case the list is already sorted.
    {
        if (low < high) { // If there are more than one element
           // Divide P into subproblems.
             // Find where to split the set.
               int mid = (low + high)/2;
           // Solve the subproblems.
             MergeSort(low, mid);
             MergeSort(mid + 1, high);
           // Combine the solutions.
             Merge(low, mid, high);
        }
    }
    
    public void Merge(int low, int mid, int high)
    // a[low:high] is a global array containing two sorted
    // subsets in a[low:mid] and in a[mid+1:high]. The goal
    // is to merge these two sets into a single set residing
    // in a[low:high]. b[] is an auxiliary global array.
    {
        int h = low, i = low, j = mid+1, k;
        while ((h <= mid) && (j <= high)) {
           if (x[h] <= x[j]) { y[i] = x[h]; h++; }
           else { y[i] = x[j]; j++; } i++;
        }
        if (h > mid) for (k=j; k<=high; k++) {
                        y[i] = x[k]; i++;
                     }
        else for (k=h; k<=mid; k++) {
                y[i] = x[k]; i++;
             }
        for (k=low; k<=high; k++) x[k] = y[k];
    }

}
