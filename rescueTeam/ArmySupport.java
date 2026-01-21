package rescueTeam;

public class ArmySupport extends Responder {
  public ArmySupport (String name, int responderId) {
	  super(name, responderId);
  }
  
  public void receiveAlert(String disasterType) {
  System.out.println("Army Support mobilized for: " + disasterType);
  
  }
  
  public void respond() {
	  System.out.println("Providing logistics, transport, and security");
	  }
  
  
}
