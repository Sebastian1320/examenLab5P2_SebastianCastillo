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
public class Usuarios {
    protected String nombre,apellido,contraseña,sexo,departamento,numeroid;
    protected Date fecha;

    public Usuarios(String nombre, String apellido, String contraseña, String sexo, String departamento, Date fecha,String numeroid) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.departamento = departamento;
        this.fecha = fecha;
    }

    public Usuarios() {
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(String numeroid) {
        this.numeroid = numeroid;
    }

    @Override
    public String toString() {
        return   "nombre: " + nombre + "\n apellido: " + apellido + ", contra: " + contraseña + "\n sexo: " + sexo + "\n departamento: " + departamento + "\n fecha: " + fecha +"\n Numeroid: "+numeroid ;
    }
    
    
}
