package JavaCalculatrice;
public class Soustraction extends Operation {

    /**Constructeur par copie   */

    public Soustraction (Expression n1, Expression n2) {
        super (n1, n2);
    }
    /**Methode qui calcule l'opération de type double   */
    
    public double valeur() {
        return this.getOperande1().valeur() - this.getOperande2().valeur();
    }
    /**Methode Tostring qui retourne un string  */
    
    public String toString() {
        return "(" + this.getOperande1() + " - " + this.getOperande2() + ")";
    }
}    