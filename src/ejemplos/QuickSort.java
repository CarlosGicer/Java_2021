/**
 * 
 */
package ejemplos;

/**
 * @author alumno
 *
 */
public class QuickSort {

	public static void quickSort(int arr[], int begin, int end) {
	    if (begin < end) {
	        int partitionIndex = partition(arr, begin, end);
	 
	        quickSort(arr, begin, partitionIndex-1);
	        quickSort(arr, partitionIndex+1, end);
	    }
	}
	
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);
	 
	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	 
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	 
	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;
	 
	    return i+1;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Inicializamos vector de 50 posiciones aleatorio
		int[] vector = new int[50];
		for (int i=0; i<vector.length;i++)
			vector[i] = (int) (Math.random()*100);
		
		//Pintamos el vector
		for(int i=0; i<vector.length;i++)
			System.out.print(" "+vector[i]);
		
		//Llamamos a ordenar con quickSort
		System.out.println();
		QuickSort.quickSort(vector,0,vector.length-1);
	
		//Pintamos el vector
		for(int i=0; i<vector.length;i++)
			System.out.print(" "+vector[i]);
	
	}

}
