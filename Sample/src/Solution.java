import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void solution(int[] A) {
        // write your code in Java SE 8
        //-------------------------
		List<Integer> list=new ArrayList<Integer>();
		long sum=0,sum1=0;
		// array sum
		for(int i=0;i<A.length;i++)sum+=A[i];
		//return -1;
		//-------------------------
		
		for(int i=0;i<A.length;i++){
			sum-=A[i];
			if(sum==sum1) list.add(i);
			sum1+=A[i];
		}
		//return -1;
		System.out.println(list);
    }
	
	public static void main(String Args[]){
		//Solution s=new Solution();
		int A[] = new int[8];
		A[0] = -1;
				  A[1] =  3;
				  A[2] = -4;
				  A[3] =  5;
				  A[4] =  1;
				  A[5] = -6;
				  A[6] =  2;
				  A[7] =  1;
		Solution.solution(A);
		long i=4294967296L;
		System.out.println(i);
	}
}
