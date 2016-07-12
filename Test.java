import java.util.*;
public class Test{
	Map<Integer,Integer> sumMemo=new HashMap<Integer,Integer>();
	public static void main (String args[]){
	
	}
	public int countChange(int[] arr,sum){
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]==sum){
				sumMemo.put(arr[i],1);
			}else if(arr[i]>sum){
				return 0;
			}else{
				if(sumMemo.contains(arr[i])){
					return sumMemo.get(arr[i]);
				}else{
					sumMemo.put([arr[i]],countChange(arr,sum-arr[i]));
				}
			}
		}
	}

}
