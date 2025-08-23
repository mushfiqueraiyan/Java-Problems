import java.util.*;

class TrafficLightTimer {
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       
     System.out.print("Enter the simulation time seconds: ");
     int t = inp.nextInt();
     
     int r = inp.nextInt();
     int g = inp.nextInt();
     int y = inp.nextInt();
     
     int cycle =  r + g + y;
     
     for(int i = 0; i< t; i++){
         
         int time = i % cycle;
         
       String color;

          if(time< r){
              color = "RED";
          }
          else if(time < r + g){
              color = "GREEN";
          }
          else{
              color = "YELLOW";
          }
          
          
           System.out.println("Seconds "+ (i+1) + " " + color);
          
     }
     
     
     System.out.println("Simulation Complete");
     
     
    }
}