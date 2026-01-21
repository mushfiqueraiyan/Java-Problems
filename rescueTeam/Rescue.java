package rescueTeam;

public class Rescue {

	public static void main(String[] args) {
		
		 Responder[] responders = {
		            new MedicalTeam("Red Crescent", 101),
		            new FireRescue("Fire Service", 202),
		            new ArmySupport("Army Unit", 303)
		        };

		        String disaster = "Earthquake";

		        for (Responder r : responders) {
		            r.receiveAlert(disaster);
		            r.respond();
		            System.out.println("----------------------");
		        }
		

	}

}
