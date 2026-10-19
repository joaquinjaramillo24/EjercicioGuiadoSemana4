public class Main {
    public static void main(String[] args) {

        System.out.println("Total: " + Producto.getTotalCreados());   // 0

        Producto producto1 = new Producto("Mouse", 20, "Tecnología");
        System.out.println("Total: " + Producto.getTotalCreados());   // 1

        Producto producto2 = new Producto("Teclado", 35.5, "Tecnología");
        Producto producto3 = new Producto("Cuaderno", 3.25, "Papelería");
        System.out.println("Total: " + Producto.getTotalCreados());   // 3


        System.out.println("ID " + producto1.getId() + ": " + producto1.getNombre()
                + " - " + producto1.getPrecio() + " - " + producto1.getCategoria());
        System.out.println("ID " + producto2.getId() + ": " + producto2.getNombre()
                + " - " + producto2.getPrecio() + " - " + producto2.getCategoria());
        System.out.println("ID " + producto3.getId() + ": " + producto3.getNombre()
                + " - " + producto3.getPrecio() + " - " + producto3.getCategoria());
    }
}