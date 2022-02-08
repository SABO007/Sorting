
public class BubbleSort {

	public static void main(String[] args) {
		
		int n;
		int array[]=new int[n];
		int j;
		
		for (int i = 0; i < n - 1; i++)
			for (j = 0; j < n - i - 1; j++)
				if (array[j] > array[j + 1]) {
					// swap array[j+1] and array[j]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

	}

}
