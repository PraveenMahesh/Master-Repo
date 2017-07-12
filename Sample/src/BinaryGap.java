import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	
	public int solution(int N){
		
		String S=new String(""+Integer.toBinaryString(N));
		//System.out.println(S);
		List<Integer> list=new ArrayList<Integer>();
		//boolean check=true;
		for(int i=0;i<S.length();i++){
			// find 1
			//System.out.println("length= "+S.length());
			int j=i;
			for(;j<S.length()-1;j++)if(S.charAt(j)=='1')break;
			//System.out.println("i="+i+" j="+j);
			if(j==S.length()-1){
				if(S.charAt(j)=='1')
					list.add(j-i);
				break;
			}
			list.add(j-i);
			i=j;
			/*i=j;
			for(;S.charAt(j)!='1';j++)if(j==S.length()-1){
				check=false;break;
			};
			if(check)list.add(j-i);
			i=j;
			*/
		}
		for(int i=S.length()-2;i!=0;i--){
			if(list.contains(i)) return i;
		}
		
		//_____________
		//return 0;	
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap b=new BinaryGap();
		int i=b.solution(2147483647);
		System.out.println(i+"---> "+Integer.toBinaryString(2147483647));
	}
}