package laboratoriojUnit;

public class Usuario {

    protected String nombre;
    protected String clave;

    public Usuario(){
        nombre="";
        clave="";
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }



}
