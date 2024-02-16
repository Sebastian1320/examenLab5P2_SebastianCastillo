/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_sebastiancastillo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Civiles extends Usuarios {
    ArrayList<String>tramites=new ArrayList();

    public Civiles() {
    }
    

    public ArrayList<String> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<String> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "tramites=" + tramites ;
    }
    
    
}
