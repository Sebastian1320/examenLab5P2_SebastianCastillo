/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sebastiancastillo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class Civiles extends Usuarios {
    ArrayList<Tramites>tramites=new ArrayList();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contraseña, String sexo, String departamento, Date fecha, String numeroid) {
        super(nombre, apellido, contraseña, sexo, departamento, fecha, numeroid);
    }

    public ArrayList<Tramites> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramites> tramites) {
        this.tramites = tramites;
    }
    

   

    @Override
    public String toString() {
        return super.toString() ;
    }
    
    
}
