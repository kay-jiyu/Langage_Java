package figures;

public class FigureGeometriques {

    public String forme;
    public String nom;

    protected int dimension;
    protected float perimetre;
    protected double aire;
    protected double volume;

    public FigureGeometriques(String forme, String nom) {
        this.forme = forme;
        this.nom = nom;
    }
    public  void  calculerPerimetre() {
        System.err.println("calcul du périmetre de la figure géométrique " + forme);
    }
    public void calculerAire() {
        System.err.println("calcul de l'aire de la figure géométrique " + forme);
    }
    public  void  calculerVolume() {
        if (dimension < 3) {
            System.out.println("Le volume n'est pas applicable pour une figure géométrique de dimension " + dimension);
            return ;
        }
        System.err.println("calcul le volume de la figure géométrique" + forme);
    }
}