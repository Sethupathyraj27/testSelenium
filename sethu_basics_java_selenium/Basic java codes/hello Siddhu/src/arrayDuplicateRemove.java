import java.util.Arrays;
import java.util.LinkedHashSet;

public class arrayDuplicateRemove {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Integer num [] = {1,2,3,3,3,3,4,5,6,6,7,9,0,1,3,3,5,6,1,2,5,8};
		
//		create set from array
		
		LinkedHashSet<Integer> LH_set = new LinkedHashSet<>(Arrays.asList(num));
		
//		get back values withOut duplicates
		
		Integer[] finalNum = LH_set.toArray(new Integer[]{});
		
		for (int i=0;i<num.length; i++){
			System.out.println(num[i]);
		}
		System.out.println("original array length is "+num.length);
		for (int i=0;i<finalNum.length; i++){
			System.out.println(finalNum[i]);
		}
		
		System.out.println("final array length is "+finalNum.length);
	}

}
