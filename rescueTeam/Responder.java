package rescueTeam;

public abstract class Responder implements AlertReciever {
  protected String name;
  protected int responderId;
  
  public Responder(String name, int id) {
	  this.name = name;
	  this.responderId = id;
	  
	 
  }
  
  public abstract void respond();
  
  public void showDetails() {
	  System.out.println("Name: " + name);
	  System.out.println("ID: " + responderId);
  }
}
