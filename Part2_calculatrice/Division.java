package JavaCalculatrice;
public class Division extends Operation {

    /**Methode qui calcule l'opération de type double   */

    public Division (Expression n1, Expression n2) {
        super (n1, n2);
    }
    /**Methode qui calcule l'opération de type double avec les try et catch  */
    /** D'abord je test si la divison est possible pour provoquer l'erreur de division par 0 */
    /** Ensuite je transite pour avoir le résultat avec les chiffres après la virgule */
    public double valeur() {
        double resultat = 0;
        try {
            resultat = (int) this.getOperande1().valeur() / (int) this.getOperande2().valeur(); 
            resultat = (double) this.getOperande1().valeur() / this.getOperande2().valeur(); 
        }
        catch (ArithmeticException e) {
            System.out.println("Division par 0 impossible : " + e.toString());
        };
        return resultat;

    }

    /**Methode tostring de type tostring   */

    public String toString() {
        return "(" + this.getOperande1() + " / " + this.getOperande2() + ")";
    }
    
    
}