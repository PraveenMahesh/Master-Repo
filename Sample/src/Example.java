import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={5,4,0,3,1,6,2};
		int n=0;
		
		List<List<Integer>> SS=new ArrayList<List<Integer>>();
		for(n=0;n<A.length;n++){
			List<Integer> S=new ArrayList<Integer>();
			S.add(A[n]);
			//System.out.println(S);
			int loc=A[n];
		while(loc!=-1){
			
			loc=proc(A,loc);
			if(S.contains(loc))
				break;
			
				S.add(loc);
			//}
		}
		//System.out.println(S.size()+"--> "+S);
		SS.add(S);
		}
		System.out.println(SS);
		Iterator<List<Integer>> e=SS.iterator();
		int size=0;
		while(e.hasNext()){
			int temp=e.next().size();
			//System.out.println(temp);
			if(size< temp)
				size=temp;
		}
		System.out.println(size);
	}
	
	static int proc(int[] A,int n){
		if(A.length > n)
			return A[n];
		else 
			return -1;
	}

}
