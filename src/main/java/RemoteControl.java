import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private int slot;
    private Commande commande;
    private List<Device> devices = new ArrayList<Device>();
    public RemoteControl(int slot) {
        this.slot = slot;
    }
    public void init(Device...devices){
        for (Device D:devices)
            this.devices.add(D);
    }

    public void onButtonPressed(int index){
        this.commande= new OnCommande(devices.get(index));
        this.commande.execute();
    }

    public void offButtonPressed(int index){
        this.commande= new offCommande(devices.get(index));
        this.commande.execute();
    }
}
