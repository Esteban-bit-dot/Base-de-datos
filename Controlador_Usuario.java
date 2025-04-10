package controlador;

import Modelo.Usuario;
import vista.Formulario_Registro_Usuario;

public class Controlador_Usuario{
    
    private Usuario objUsuario;
    private Formulario_Registro_Usuario objformulario;
    
    
    public void Controlador(){
     this.objUsuario = new Usuario();
     this.objformulario = new Formulario_Registro_Usuario();
    
    }
}

