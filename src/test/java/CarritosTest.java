import laboratoriojUnit.Carrito;
import laboratoriojUnit.Portal;
import laboratoriojUnit.Producto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarritosTest {

    Carrito carrito = new Carrito();


    @Test
    @Order(1)
    @DisplayName("Test para verificar que se vacie el carrito")
    public void vaciarCarritoTest() {
        carrito.vaciarCarrito();
        assertEquals(true, carrito.verificarCarrito(), "El carrito no se encuentra vacio");
    }

    @Test
    @Order(3)
    @DisplayName("Test para verificar si el carrito  está vacio")
    public void carritoVacioFallaTest() {
        //carrito.agregarProducto(new Producto("pera", 45));
        assertTrue(carrito.verificarCarrito(), "El carrito no se encuentra vacio");
    }

    @Test
    @Order(2)
    @DisplayName("Test para verificar si el carrito no está vacio")
    public void carritoVacioNoVacioTest() {
        carrito.agregarProducto(new Producto("pera", 45));
        carrito.agregarProducto(new Producto("manzana", 28));
        assertFalse(carrito.verificarCarrito(), "El carrito  se encuentra vacio");
    }



}
