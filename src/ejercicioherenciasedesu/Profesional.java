/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.util.HashMap;


/**
 *
 * @author Valentine Chimezie
 */
public class Profesional extends Sede {
  private int noProgAltaC;  
  private HashMap<String,ProgramaDeFormacion>Programas;
  private Tecnologico SedeTecnologica;
  private EducacionContinuada SedeEducacionContinuada;

    public Profesional(int noProgAltaC, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
        this.noProgAltaC= noProgAltaC;
    }

    public Profesional(String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
    }

    public Profesional(String Nombre, String Direccion, int Telefono, double AreaConstruida) {
        super(Nombre, Direccion, Telefono, AreaConstruida);
    }
    
/*Implementar el metodo que lista los programas ofrecidos en las posibles sedes tecnologicas 
 y estudio continuo. Nota: Debe devolver un HashMap*/
   private HashMap<String,ProgramaDeFormacion> ProgramasTyC(){
    HashMap<String,ProgramaDeFormacion> x=new HashMap<>();
    return x;
           
}
    @Override
    public Sede darInformacion() {
     System.out.println("Numero de Programas: ");
        System.out.print(this.noProgAltaC);
        System.out.println("Nombre de la Sede: ");
        System.out.print(this.getNombre());
        System.out.println("Direccion de la Sede: ");
        System.out.print(this.getDireccion());
        System.out.println("Telefono de la Sede: ");
        System.out.print(this.getTelefono());
        System.out.println("Area Constuida de la Sede: ");
        System.out.print(this.getAreaConstruida());
        /*Imprimir el HashMap de estudiantes
        System.out.println();
        */
        Profesional a;
        a = new Profesional(this.noProgAltaC ,this.getNombre(), this.getDireccion(),this.getTelefono(),this.getAreaConstruida(),this.getestudiantes());
     
        return a;
    }

   
  
  
}
