public class Ejercicio1 {
    public static void main(String[] args) {
    
        double precio = 300;
        double descuentoPorcentaje = 20;
        double precioConDescuento = calcularPrecioConDescuento(precio, descuentoPorcentaje);
        System.out.println("El precio final con descuento es: " + precioConDescuento);
    }

    public static double calcularPrecioConDescuento(double precio, double descuentoPorcentaje) {
        double descuento = precio * (descuentoPorcentaje / 100);
        double precioConDescuento = precio - descuento;
        return precioConDescuento;
    }
    
}
