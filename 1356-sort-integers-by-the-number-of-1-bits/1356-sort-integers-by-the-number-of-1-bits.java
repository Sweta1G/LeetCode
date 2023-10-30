class Solution {
    public int[] sortByBits(int[] arr) {
            quickSort(arr, 0, arr.length - 1);
    return arr;
}

private void quickSort(int[] arr, int l, int r) {
    if(l >= r) return;
    final int partitionIndex = partition(arr, l, r);
    quickSort(arr, l, partitionIndex - 1);
    quickSort(arr, partitionIndex+ 1, r);
}

private int partition(int[] arr, int l, int r) {
    final int pivot = arr[r];
    int lowerIndex = l;
    for(int i = l; i <= r; i++) {
        if(cal(arr[i], pivot) < 0) {
            swap(arr, lowerIndex++, i);
        }
    }
    swap(arr, lowerIndex, r);
    return lowerIndex;
}

private void swap(int[] arr, int a, int b) {
    final int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}

private int cal(int a, int b) {
    final int countA = count(a);
    final int countB = count(b);
    return countA == countB ? a - b : countA - countB;
}

private int count(int a) {
    int count = 0;
    while(a > 0) {
        count++;
        a &= a - 1;
    }
    return count;
}
        
    
}