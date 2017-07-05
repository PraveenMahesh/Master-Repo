import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5,4,0,3,1,6,2};
		int n=0;
		List<Integer> S=new ArrayList<Integer>();
		while(n!=-1){
			//int loc;
			n=proc(A,n);
			if(S.contains(n))
				break;
			
				S.add(n);
			//}
		}
		System.out.println(S.size());
	}
	
	static int proc(int[] A,int n){
		if(A.length > n)
			return A[n];
		else 
			return -1;
	}

}
