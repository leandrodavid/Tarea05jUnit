package laboratoriojUnit;

public class Portal {

     Usuario usuario = new Usuario();
     Carrito carrito = new Carrito();
     boolean logueado = false;

    public Portal(){
    }


    public Portal(Usuario usuario, Carrito carrito, boolean logueado) {
        this.usuario = usuario;
        this.carrito = carrito;
        this.logueado = logueado;
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
