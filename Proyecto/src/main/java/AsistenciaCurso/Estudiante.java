/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsistenciaCurso;

/**
 *
 * @author aleja
 */
public class Estudiante{
    private String curso;
    private String nombre;
    private String rut;
    private int edad;

    public Estudiante(String curso, String nombre, String rut, int edad) {
        this.curso = "N/A";
        this.nombre = "N/A";
        this.rut = "11.111.111-1";
        this.edad = 00;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso(){
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCurso(String newCurso){
        this.curso = newCurso;
    }
  
    
    
}
