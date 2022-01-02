public class offCommande implements Commande{
    private Device device;

    public offCommande(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.off();
    }
}
