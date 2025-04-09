package Tienda_carros;

 import modelo.Vehiculo;

import Tienda_carros.Vista.Formulario_Registro_Vehiculo;

public class Controlador_Vehiculo {
   
    
    private Vehiculo objVehiculo;
    private Formulario_Registro_Vehiculo objformulario;
    
    
    public void Controlador(){
     this.objVehiculo = new Vehiculo();
     this.objformulario = new Formulario_Registro_Vehiculo();
    
    }
}
