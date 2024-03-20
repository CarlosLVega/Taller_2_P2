public class Ejercicio6 {

        public static void main(String[] args) {
            // Ejemplo de uso
            long segundos = 10000;
            String tipo = "dias"; 
            
            long resultado = convertirSegundos(segundos, tipo);
            System.out.println(segundos + " segundos equivalen a " + resultado + " " + tipo + ".");
        }
    
        public static long convertirSegundos(long segundos, String tipo) {
            final int SEGUNDOS_POR_DIA = 86400; 
            final int SEGUNDOS_POR_HORA = 3600; 
            final int SEGUNDOS_POR_MINUTO = 60; 
            
            long resultado = 0;
            
            switch (tipo.toLowerCase()) {
                case "dias":
                    resultado = segundos / SEGUNDOS_POR_DIA;
                    break;
                case "horas":
                    resultado = segundos / SEGUNDOS_POR_HORA;
                    break;
                case "minutos":
                    resultado = segundos / SEGUNDOS_POR_MINUTO;
                    break;
                default:
                    System.out.println("Tipo de conversión no válido.");
                    break;
            }
            
            return resultado;
        }
    }

