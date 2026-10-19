public class Main {
    public static void main(String[] args) {

        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 0

        Dispositivo dispositivo1 = new Dispositivo("Router", "Red");
        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 1

        Dispositivo dispositivo2 = new Dispositivo("Cámara", "Seguridad");
        Dispositivo dispositivo3 = new Dispositivo("Servidor", "Cómputo");
        System.out.println("Total: " + Dispositivo.getTotalCreados());   // 3

        dispositivo2.activar();

      
        System.out.println("ID " + dispositivo1.getId() + ": " + dispositivo1.getNombre()
                + " - " + dispositivo1.getTipo() + " - activo: " + dispositivo1.isActivo());
        System.out.println("ID " + dispositivo2.getId() + ": " + dispositivo2.getNombre()
                + " - " + dispositivo2.getTipo() + " - activo: " + dispositivo2.isActivo());
        System.out.println("ID " + dispositivo3.getId() + ": " + dispositivo3.getNombre()
                + " - " + dispositivo3.getTipo() + " - activo: " + dispositivo3.isActivo());
    }
}