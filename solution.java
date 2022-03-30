
public class Solution
{
	public static void main(String[] args) {
		int counter = 0;
		for(int i = 1; i < 101; i++) {
		    boolean even = true;
			for(int j = 1; j <= i; j++) {
				if(i%j == 0) {
					even = !even;
				}
			}
		    if(even == false){
		        counter++;
		    }
		}
	    System.out.println(counter);
	    
	}
}
