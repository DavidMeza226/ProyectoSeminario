package Modelo;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String apellido;
    private String email;
    private String seminario;

    
    public Estudiante(){
        
    }
    public Estudiante(String codigo, String nombre, String apellido, String email, String seminario) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.seminario = seminario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "\nCodigo=" + codigo + "\n Nombre=" + nombre + "\n Apellido=" + apellido + "\n Email=" + email + "\n Seminario=" + seminario + '}';
    }
    
    

}
