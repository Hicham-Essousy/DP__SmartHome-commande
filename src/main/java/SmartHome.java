public class SmartHome {
    private String nom;
    private double serie;
    private Adresse adresse;
    private RemoteControl remoteControl;

    private SmartHome() {
    }

    public static class ConcretSmartHomeBuilder{
        private String nom;
        private double serie;
        private Adresse adresse;
        private RemoteControl remoteControl;

        public ConcretSmartHomeBuilder(String nom, double serie) {
            this.nom = nom;
            this.serie = serie;
        }
        public ConcretSmartHomeBuilder withAdresse(Adresse adresse){
            this.adresse=adresse;
            return this;
        }
        public ConcretSmartHomeBuilder withRemotControl(RemoteControl remoteControl){
            this.remoteControl=remoteControl;
            return this;
        }
        public SmartHome build(){
            SmartHome smartHome = new SmartHome();
            smartHome.nom=this.nom;
            smartHome.serie=this.serie;
            smartHome.adresse=adresse;
            smartHome.remoteControl=remoteControl;
            return smartHome;
        }
    }
}
