/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sebastiancastillo;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class empleados extends Usuarios {
    private String carrera,puesto,años;

    public empleados() {
    }

    public empleados(String carrera, String puesto, String años, String nombre, String apellido, String contraseña, String sexo, String departamento, Date fecha, String numeroid) {
        super(nombre, apellido, contraseña, sexo, departamento, fecha, numeroid);
        this.carrera = carrera;
        this.puesto = puesto;
        this.años = años;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    @Override
    public String toString() {
       return super.toString() ;
    }
    
    
}
