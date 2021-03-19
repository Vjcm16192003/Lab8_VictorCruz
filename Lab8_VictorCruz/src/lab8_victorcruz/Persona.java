/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Persona {
    private String nombre,apellido,nacionalidad,Sexo,Residencia,profesion,tra_SN,Facultad,Tipo;
    private int edad,num_cuenta;

    public Persona(String nombre, String apellido, String nacionalidad, String Sexo, String Residencia, String profesion, String tra_SN, String Facultad, String Tipo, int edad, int num_cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.Sexo = Sexo;
        this.Residencia = Residencia;
        this.profesion = profesion;
        this.tra_SN = tra_SN;
        this.Facultad = Facultad;
        this.Tipo = Tipo;
        this.edad = edad;
        this.num_cuenta = num_cuenta;
    }

    public Persona() {
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getResidencia() {
        return Residencia;
    }

    public void setResidencia(String Residencia) {
        this.Residencia = Residencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTra_SN() {
        return tra_SN;
    }

    public void setTra_SN(String tra_SN) {
        this.tra_SN = tra_SN;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", Sexo=" + Sexo + ", Residencia=" + Residencia + ", profesion=" + profesion + ", tra_SN=" + tra_SN + ", Facultad=" + Facultad + ", Tipo=" + Tipo + ", edad=" + edad + ", num_cuenta=" + num_cuenta;
    }
    
    
    
}
