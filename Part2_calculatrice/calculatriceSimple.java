package JavaCalculatrice;

public class calculatriceSimple {

        public static void main(String[] args) {
            Expression deux = new Nombre(2) ;
            Expression trois = new Nombre(14) ;
            Expression dixSept = new Nombre(17) ;
            System.out.println("");
            Expression s = new Soustraction(dixSept, deux) ;
            Expression a = new Soustraction(trois, deux);
            Expression d = new Division(s, a) ; 
            System.out.println(d + " = " + d.valeur());
            
        }
    }