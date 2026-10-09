package figures;

public class Carre extends FigureGeometriques {
    
    private int cote;
    
    public Carre(String nom, String forme, int cote) {
        super(forme, nom); // Ici, super est un mot-clé qui permet d'accéder à la méthode calculerPerimetre de la classe FigureGeometriques.
        this.cote = cote;  //this est un mot-clé qui permet d'accéder à l'attribut perimetre de la classe Carre. 
        // Il est souvent utilisé pour eviter les conflits de noms entre les attributs et les paramètres d'une méthode. Ici, il permet d'accéder à l'attribut perimetre de la classe Carre, qui est hérité de la classe FigureGeometriques.
        this.dimension = 2;
    }
    
    public @Override void calculerPerimetre() {
        super.calculerPerimetre();
        // La méthode calculerPerimetre est définie dans la classe FigureGeometriques, et elle est appelée dans la méthode calculerPerimetre de la classe Carre.On peut ecrire simplement perimetre = 4 * cote; mais l'utilisation de this permet d'eviter les conflits de noms entre les attributs et les paramètres d'une méthode. 
        // Ici, il permet d'accéder à l'attribut perimetre de la classe Carre, qui est hérité de la classe FigureGeometriques.
        this.perimetre = 4 * cote;
        System.out.println("Le périmètre du carré est : " + this.perimetre);
    }
    public @Override void calculerAire() {
        super.calculerAire();
        aire = cote * cote;
        System.out.println("L'aire du carré est : " + aire);
    }
}
