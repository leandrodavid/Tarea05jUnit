package laboratoriojUnit;

import java.util.ArrayList;

public class Carrito {

    ArrayList<Producto> carrito;

    public Carrito(){
        this.carrito = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void agregarProducto(Producto producto) {
        this.carrito.add(producto);
    }

    public void eliminarProducto() {
        this.carrito.remove(0);
    }

    public void vaciarCarrito() {
        this.carrito.clear();
    }

    public boolean verificarCarrito(){
        return carrito.isEmpty();
    }
}

