// Program to find the nth prime number //



import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int num = 2;
		while(true){
		    if(isprime(num)){
		        count++;
		        if(count == n){
		            System.out.println(num);
		            return;
		        }
		    }
		    num++;
		}
	}
	
	public static boolean isprime(int n){
	    
	    if(n < 2) return false;
	    
	    for(int i=2; i<n; i++){
	        if(n % i == 0){
	            return false;
	           
	        }
	    }
	    return true;
	    
	}
}
