// https://www.youtube.com/watch?v=UAmaFHWBoYQ

public class InsertionSort {
    void sort(int arr[])
    {
    	//array uzunlugu
        int n = arr.length;

        //travelling from 1
        for (int i = 1; i < n; ++i) {

        	//key from the position
            int key = arr[i]; 

            //j is preposition
            int j = i - 1;

            //j starts 0, arr[j] pre value if
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; 
        }
    }
    static void printArray(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

	public static void main(String[] args) {
		int arr[] = { 3, 9, 6, 1, 2 };
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
	}
}
