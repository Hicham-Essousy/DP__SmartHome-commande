public class OnCommande implements Commande{
    private Device device;

    public OnCommande(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
            this.device.on();
    }
}
