public class Ejercicio5 {

        public static void main(String[] args) {
            
            int dias = 2;
            int horas = 5;
            int minutos = 30;
            
            long segundos = convertirTiempoASegundos(dias, horas, minutos);
            System.out.println("El tiempo total en segundos es: " + segundos + " segundos.");
        }
    
        public static long convertirTiempoASegundos(int dias, int horas, int minutos) {
            final int SEGUNDOS_POR_DIA = 86400; 
            final int SEGUNDOS_POR_HORA = 3600; 
            final int SEGUNDOS_POR_MINUTO = 60; 
            
            long totalSegundos = 0;
            
            totalSegundos += dias * SEGUNDOS_POR_DIA;
            totalSegundos += horas * SEGUNDOS_POR_HORA;
            totalSegundos += minutos * SEGUNDOS_POR_MINUTO;
            
            return totalSegundos;
        }
    }

