package JavaCalculatrice;
public class Multiplication extends Operation {

    /**Constructeur par copie   */

    public Multiplication (Expression n1, Expression n2) {
        super (n1, n2);
    }

    /**Methode qui calcule l'opération de type double   */

    public double valeur() {
        return this.getOperande1().valeur() * this.getOperande2().valeur();
    }

    /**Methode to string de type string   */

    public String toString() {
        return "(" + this.getOperande1() + " * " + this.getOperande2() + ")";
    }
}