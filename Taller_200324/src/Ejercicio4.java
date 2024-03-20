public class Ejercicio4 {


        public static void main(String[] args) {
            
            double radio = 5;
            String tipoCalculo = "volumen"; 
            
            double resultado = calcularCirculo(radio, tipoCalculo);
            
            if (tipoCalculo.equalsIgnoreCase("perimetro")) {
                System.out.println("El perimetro de la circunferencia es: " + resultado);
            } else if (tipoCalculo.equalsIgnoreCase("area")) {
                System.out.println("El area del circulo es: " + resultado);
            } else if (tipoCalculo.equalsIgnoreCase("volumen")) {
                System.out.println("El volumen de la esfera es: " + resultado);
            } else {
                System.out.println("Tipo de calculo no valido.");
            }
        }
    
        public static double calcularCirculo(double radio, String tipoCalculo) {
            double resultado = 0;
            double pi = 3.1416;
            
            if (tipoCalculo.equalsIgnoreCase("perimetro")) {
                resultado = 2 * pi * radio;
            } else if (tipoCalculo.equalsIgnoreCase("area")) {
                resultado = pi * Math.pow(radio, 2);
            } else if (tipoCalculo.equalsIgnoreCase("volumen")) {
                resultado = (4 * pi * Math.pow(radio, 3)) / 3;
            } else {
                System.out.println("Tipo de calculo no valido.");
            }
            
            return resultado;
        }
    }
    
