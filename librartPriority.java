package priorityTask;
import java.util.*;

public class LibPrio {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		int n  = inp.nextInt();
		
		int[] uniqueID = new int[n];
		int[] priority = new int[n];
		
	
		
		for(int i = 0; i<n; i++) {
			System.out.print("Enter the unique id of student" + i + ": ");
			uniqueID[i] = inp.nextInt();
			System.out.print("Enter the priority of student" + i + ": ");
			priority[i] = inp.nextInt();
		}
		
		
		for(int i =0; i < n-1; i++){
		    for(int j = 0; j < n - i - 1; j++){
		        if(priority[j] < priority[j+1]){
		      
		      int tempPrio = priority[j];
		      priority[j] = priority[j+1];
		      priority[j+1] = tempPrio;      
		            
		      int temp = uniqueID[j];
		      uniqueID[j] = uniqueID[j+1];
		      uniqueID[j+1] = temp;
		    }
		    }
		}
		
		
		 for (int i = 0; i < n; i++) {
            System.out.println("Student ID: " + uniqueID[i]);
        }
		
		
		inp.close();

	}

}
