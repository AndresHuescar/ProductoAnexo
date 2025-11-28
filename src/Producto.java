import java.util.Scanner;
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private boolean oferta;

    // Metodo para mostrar la info
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Stock: " + stock);
        System.out.println("¿Está en oferta?: " + oferta);
        System.out.println("-------------------------------");
    }

    // Metodo que aplica descuento si está en oferta
    public void aplicarDescuento() {
        if (oferta) {
            precio = precio * 0.90; // descuento del 10%
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPRODUCTO " + (i + 1));
            // Crear un nuevo producto
            productos[i] = new Producto();
            System.out.print("Introduce nombre: ");
            productos[i].nombre = sc.nextLine();
            System.out.print("Introduce precio: ");
            productos[i].precio = Double.parseDouble(sc.nextLine());
            System.out.print("Introduce stock: ");
            productos[i].stock = Integer.parseInt(sc.nextLine());
            System.out.print("¿Está en oferta?: ");
            productos[i].oferta = Boolean.parseBoolean(sc.nextLine());

            // Aplicar el descuento si corresponde
            productos[i].aplicarDescuento();
        }

        // Mostrar resultados finales
        System.out.println("\n--- PRODUCTOS_REGISTRADOS ---");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        sc.close();
    }
}
