public class Ejercicio2 {


        public static void main(String[] args) {
           
            double lado1 = 5;
            double lado2 = 8;
            String tipoCalculo = "perimetro"; 
            
            double resultado = calcularRectangulo(lado1, lado2, tipoCalculo);
            
            if (tipoCalculo.equalsIgnoreCase("perimetro")) {
                System.out.println("El perimetro del rectangulo es: " + resultado);
            } else if (tipoCalculo.equalsIgnoreCase("area")) {
                System.out.println("El area del rectángulo es: " + resultado);
            } else {
                System.out.println("Tipo de cálculo no valido.");
            }
        }
    
        public static double calcularRectangulo(double lado1, double lado2, String tipoCalculo) {
            double resultado = 0;
            if (tipoCalculo.equalsIgnoreCase("perimetro")) {
                resultado = 2 * (lado1 + lado2);
            } else if (tipoCalculo.equalsIgnoreCase("area")) {
                resultado = lado1 * lado2;
            } else {
                System.out.println("Tipo de calculo no valido.");
            }
            return resultado;
        }
    }
    
