package rescueTeam;

public class MedicalTeam extends Responder {
  public MedicalTeam(String name, int responderId) {
  super(name, responderId);
  }
  
  public void receiveAlert(String disasterType) {
	  System.out.println("Medical team alerted for: " + disasterType);
  }
  
  public void respond() {
	  System.out.println("Providing emergency medical treatment");
  }
}
