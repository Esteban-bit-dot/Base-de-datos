package Tienda_carros;

import java.sql.*;

public class modeloConexion {
    //Crear Atributos de la Clave
    String usuario;
    String url;
    String Clave;
    Connection conex;
    // crear el contructor
    public modeloConexion(){
        usuario= "root";
        url="jdbc:mysql://localhost:3306/tienda";
        Clave="";
        conex = null;
        
    }
    public void hacerConexion() throws SQLException{
        try {
            conex = DriverManager.getConnection(url, usuario, Clave);
            System.out.println("Dato conexion: "+conex.toString());
        } catch (SQLException e) {
            System.out.println("Error: "+ e);
        }
    }
    public void hacerConsulta()throws SQLException {
        String textoSql = "SELECT * FROM clientes";
        Statement consulta_sentencia = this.conex.createStatement();
        ResultSet resultado_sentencia = consulta_sentencia.executeQuery(textoSql);
        System.out.println("resultado: "+resultado_sentencia);
        resultado_sentencia.getString("idplaca");
    }
}
