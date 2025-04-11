package Tienda_carros;

private String Modelo_Vehiculo;
    private String Serial_Vehiculo;

    public class Vehiculo {
        this.Modelo_Vehiculo;
        this.Serial_Vehiculo;
    

    public String getSerial_vehiculo() {
        return Serial_Vehiculo;
    }

    public void setSerial_vehiculo(String Serial_Vehiculo) {
        this.Serial_Vehiculo = Serial_Vehiculo;
       
    }

    public String getModelo_Vehiculo() {
        return Modelo_Vehiculo;
    }

    public void setModelo_Vehiculo(String Modelo_Vehiculo) {
        this.Modelo_Vehiculo = Modelo_Vehiculo;
    }
    
   //herecia
    public interface Carro {
    void acelerar();
    void frenar();
    void encender();
    void apagar();
}

// Clase concreta que implementa la interfaz Carro
public class Deportivo implements Carro {

    
    public void acelerar() {
        System.out.println("El deportivo está acelerando rápidamente.");
    }

   
    public void frenar() {
        System.out.println("El deportivo está frenando.");
    }

  
    public void encender() {
        System.out.println("El deportivo está encendido.");
    }

    
    public void apagar() {
        System.out.println("El deportivo está apagado.");
    }

    // Métodos adicionales específicos del Deportivo
    public void activarModoTurbo() {
        System.out.println("¡Modo turbo activado!");
    }
}
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        Carro objCarro = new Deportivo();

        objCarro.encender();
        objCarro.acelerar();
        objCarro.frenar();
        objCarro.apagar();

        // Llamando a métodos específicos (necesitas un cast)
        if (objCarro instanceof Deportivo) {
            ((Deportivo) objCarro).activarModoTurbo();
        }
    }
}
