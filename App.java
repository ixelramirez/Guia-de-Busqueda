public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leer = new Scanner(System.in);
        System.out.println(x:"Ingrese la cantidad de producto a registrar");
        int canp = leer.nextInt();


    public class Inventario {
        private String[] productos;
        private int contador;

        public Inventario(int cantidad) {
            productos = new String[cantidad];
            contador = 0;
    }
    public void registrarProducto(String producto) {
        if (contador < productos.length);
        productos[contador] = producto;
        contador++;
        System.out.println("Producto registrado:" + producto);
    }
public void buscarProducto(String productoBuscado) {
    for (int i = 0; i < contador; i++) { 
        if
        (productos[i].equalsIgnoreCase(productoBuscado)) {
            System.out.println("Producto encontrado: " + productos[i]);
            return;
        }
    }
    System.out.println("Producto no disponible en el inventario.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de producctos que desea registrar: ");
        int cantidad = Scanner.nextInt();
        scanner.nextLine();  //Limpiar el buffer del scanner

        Inventario inventario = new Inventario(cantidad);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del producto #" + (i + 1) + ":");
            String producto = scaanner.nextLine();
            inventario.registrarProducto(producto);
        }

        System.out.println("Ingrese el nombre del producto a buscar: ");
        String productoBuscado = scanner.nextLine();
        inventario.buscarProducto(productoBuscado);

        scanner.close();

    }

}
