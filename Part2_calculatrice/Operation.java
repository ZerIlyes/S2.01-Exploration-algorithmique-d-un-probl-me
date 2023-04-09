package JavaCalculatrice;
public abstract class Operation extends Expression{
    /**Variables Membres */

    private Expression operande1, operande2;

    /**Constructeur par copie  */

    public Operation(Expression n1, Expression n2) {
        this.operande1 = n1;
        this.operande2 = n2;
    }

    /**Methode qui retourne la première operande  */

    public Expression getOperande1 () {
        return this.operande1;
    }

    /**Methode qui retourne la deuxième operande  */

    public Expression getOperande2 () {
        return this.operande2;
    }
}