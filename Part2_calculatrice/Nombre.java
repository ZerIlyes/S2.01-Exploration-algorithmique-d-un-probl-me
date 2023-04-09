package JavaCalculatrice;
public class Nombre extends Expression  {
    /**Variable Membres */

    private double valeurNombre;

    public double valeur () {
        return this.valeurNombre;
    }
    /**Methode qui retourne un entier */

    public Nombre (double n) {
        this.valeurNombre = n;
    }

    /**Methode to string qui retourne la valeur */
    
    public String toString() {
        return "" + this.valeur();
    }
}
