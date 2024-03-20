public class Ejercicio3 {


        public static void main(String[] args) {
            
            double dolares = 100;
            double euros = convertirDolaresAEuros(dolares);
            System.out.println(dolares + " dolares equivalen a " + euros + " euros.");
        }
    
        public static double convertirDolaresAEuros(double dolares) {
           
            double tipoCambio = 1.33250;
            double euros = dolares / tipoCambio;
            return euros;
        }
    }

