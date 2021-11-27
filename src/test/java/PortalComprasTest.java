import laboratoriojUnit.Carrito;
import laboratoriojUnit.Producto;
import  org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static javafx.beans.binding.Bindings.when;
import static org.junit.jupiter.api.Assertions.*;

public class PortalComprasTest {

    Carrito carrito = new Carrito();



    @Test
    public void vaciarCarritoTest() {
        carrito.vaciarCarrito();
        assertEquals(true, carrito.verificarCarrito(), "El carrito no se encuentra vacio");
    }

    @Test
    public void carritoVacioFallaTest() {
        carrito.agregarProducto(new Producto("pera", 45));
        assertTrue(carrito.verificarCarrito(), "El carrito no se encuentra vacio");
    }

    @Test
    public void carritoVacioNoVacioTest() {
        carrito.agregarProducto(new Producto("pera", 45));
        carrito.agregarProducto(new Producto("manzana", 28));
        assertFalse(carrito.verificarCarrito(), "El carrito  se encuentra vacio");
    }

}
