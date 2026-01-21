package rescueTeam;

public class FireRescue extends Responder {

    public FireRescue(String name, int responderId) {
        super(name, responderId);
    }

    @Override
    public void receiveAlert(String disasterType) {
        System.out.println("Fire rescue alerted for: " + disasterType);
    }

    @Override
    public void respond() {
        System.out.println("Rescuing trapped victims and controlling fire");
    }
}
