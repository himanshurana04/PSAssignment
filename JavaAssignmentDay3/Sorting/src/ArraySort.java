
public class ArraySort {
	void sort(int arr[])
    {
        int n = arr.length;
 
        
        for (int i = 0; i < n-1; i++)
        {
           
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
 
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
 
    
    void displayArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
        
    }
}
