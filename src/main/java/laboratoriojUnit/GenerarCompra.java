package laboratoriojUnit;

public class GenerarCompra {

    public static void main(String[] args) {

        Portal compra = new Portal();

        compra.ingresarClave("mara");

        compra.ingresarNombre("leandro");

        compra.login();

        compra.agregarProducto(new Producto("cafe", 50));

        compra.carrito.agregarProducto(new Producto("cafe", 50));

        compra.carrito.eliminarProducto();

        compra.agregarProducto(new Producto("pan", 5));

        compra.verificarCompra();

        compra.finalizarCompra();

        compra.logout();

    }

}

