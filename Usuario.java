package Tienda_carros;

public class Usuario {
    
    private String Nombre_usuario;
    private String Correo_usuario;
    private String Contraseña_usuario;

    public void Vehiculo(){
        String Nombre_Usuario = this.Nombre_usuario;
        String Correo_Usuario = this.Correo_usuario;
        String Contraseña_Usuario = this.Contraseña_usuario;
    }

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setSerial_vehiculo(String Nombre_usuario) {
        this.Nombre_usuario = Nombre_usuario;
    }

    public String getCorreo_usuario() {
        return Correo_usuario;
    }

    public void setCorreo_usuario(String Correo_usuario) {
        this.Correo_usuario = Correo_usuario;
    }
    
    public String getContraseña_usuario(){
        return Contraseña_usuario;
    }

    public void setContraseña_usuario(String Contraseña_usuario) {
        this.Contraseña_usuario = Contraseña_usuario;
    }
}
