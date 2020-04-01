import java.util.Random;
import java.util.*;
 
class Shuffle {
	// version for array of ints
	public static void shuffle (int[] array,int a,int n) {
		int k = 0;
		LinkedList<Integer> l = new LinkedList<>();

		int index;
		Random r = new Random();
		for (int i = n; i > 0; i--) {
			index = r.nextInt(i);
			l.add(index);
			if (l.contains(index)) {
				index = r.nextInt(i);
				l.add(index);
			}
		}
		for (int i = 0;i<a ;i++) {
			if(k>=n){
				break;
			}
			index = l.get(k);
			k++;
			int tmp = array[index];
			array[index] = array[i];
			array[i] = tmp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = 5;
		int a = arr.length;
		shuffle(arr,a,n);
	}

}