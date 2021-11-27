package laboratoriojUnit;

public class Portal {

    protected Usuario usuario;
    protected Carrito carrito;
    protected boolean logueado;

    public Portal(){
    }

    public void ingresarNombre(String nombre){
        usuario.setNombre(nombre);
    }

    public void ingresarClave(String clave){
        usuario.setClave(clave);
    }

    public void login(){
        if ((usuario.getNombre().equals("leandro")) && (usuario.getClave().equals("mara")))
            this.logueado = true;
    }

    public void logout(){
        this.logueado = false;
    }


    public int finalizarCompra(){
        int total = 0;
        for(Producto objeto : carrito.getCarrito()) {
            total += objeto.getPrecio();
        }
        return total;
    }

    public boolean verificarCompra(){
        return this.carrito.verificarCarrito();
    }

    public void agregarProducto(Producto p){
        this.carrito.agregarProducto(p);
    }
}
