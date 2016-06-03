
import java.util.Arrays;
import java.util.Scanner;

 
public class CopyingBooks {
 
	public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int t,n,m;
    	t=scn.nextInt();
    	for(int tt=1;tt<=t;tt++){
    		n=scn.nextInt();m=scn.nextInt();
    		int [] arr=new int[n];
    		//int [] te=new int[n];
    		int low=arr[0],high=0;
    		for(int i=0;i<n;i++){
    			arr[i]=scn.nextInt();
    			if(arr[i]<low)low=arr[i];
    			high+=arr[i];
    		}
    		
    		
    		
    		int mid=0,temp=0;
    		
    		while(low<high){
    			
    			//make a guess
    			mid=(low+high)/2;
    			//System.out.println("low "+low+" high "+high+" mid "+mid);
    			temp=0; int j=1;
    			//check for the validity of out guess
    			for(int i=0;i<n && j<=m;i++){
    				if(temp+arr[i]<=mid){
    					temp+=arr[i];
    				}
    				else{
    					j++;temp=arr[i];
    				}
    			}
    			if(j<=m)high=mid;
    			else low=mid+1;
    		
    			
    		}
    		
    		/*now mid will hold answer but on the false condition at low==high,
    		high will get that value from mid.
    		*/
    		int ans=high;
    		boolean[] tag=new boolean[n];
    		temp=0;
    		for(int i=n-1;i>=0;i--){
    			temp+=arr[i];
    			if(temp>ans){
    				System.out.print("/ ");
    				temp=arr[i];
    			}
    			System.out.print(arr[i]+" ");
    		}
    		System.out.println();
    	}
    }
}    
