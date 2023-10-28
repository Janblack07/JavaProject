/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

/**
 *
 * @author JANBLACK
 */
public class Estudiante1 {

    public Estudiante1() {
    }
    String Nombres="",Apellidos="",Cedula="",Nivel="",Carrera="",Paralelo="";
    int Id_Estudiante;

    public Estudiante1(String Nombres, String Apellidos, String Cedula, String Nivel, String Carrera, String Paralelo, int Id_Estudiante) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Nivel = Nivel;
        this.Carrera = Carrera;
        this.Paralelo = Paralelo;
        this.Id_Estudiante = Id_Estudiante;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getParalelo() {
        return Paralelo;
    }

    public void setParalelo(String Paralelo) {
        this.Paralelo = Paralelo;
    }

    public int getId_Estudiante() {
        return Id_Estudiante;
    }

    public void setId_Estudiante(int Id_Estudiante) {
        this.Id_Estudiante = Id_Estudiante;
    }


 
    
    
}
