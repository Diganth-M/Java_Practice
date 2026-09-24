import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		
		for(int i=1; i<n; i++){
		    
		  int count = 0;
		  for(int j=1; j<=n-1; j++){
		      if(i % j == 0 ){
		          count++;
		      }
		  }
		  if(count == 2){
		      System.out.println(arr[i]);
		  }
		  
		}
		
	}
}
