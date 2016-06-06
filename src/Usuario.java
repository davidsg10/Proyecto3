
public class Usuario {
private int id;
private String Nombre;
private String Contraseña;

    public Usuario() {
    }

    public Usuario(int id, String Nombre, String Contraseña) {
        this.id = id;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


}
