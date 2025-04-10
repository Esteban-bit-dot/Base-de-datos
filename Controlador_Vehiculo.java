package controlador;

import modelo.Vehiculo;
import vista.Formulario_Registro_Vehiculo;

public class Controlador{
    
    private Vehiculo objVehiculo;
    private Formulario_Registro_Vehiculo objformulario;
    
    
    public Controlador(){
     this.objVehiculo = new Vehiculo();
     this.objformulario = new Formulario_Registro_Vehiculo();
    
    }
}
