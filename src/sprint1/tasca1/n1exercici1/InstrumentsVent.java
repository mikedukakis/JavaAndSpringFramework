package sprint1.tasca1.n1exercici1;

public class InstrumentsVent extends InstrumentsMusicals{
    public InstrumentsVent(String nom, double preu) {
        super(nom, preu);
        System.out.println("Classe carregada des del constructor de la subclasse: " + this.getClass());
    }

    static {
        System.out.println("Classe carregada des d'un bloc d'inicialització estàtic de la subclasse: " + InstrumentsVent.class);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }

}
