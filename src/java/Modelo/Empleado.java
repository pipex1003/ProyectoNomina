package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANDRES AVILA
 */
public class Empleado extends Persona {
    String salarioBasico;
    private String dias;

    public Empleado(String salarioBasico, String dias, String id, String nombre) {
        super(id, nombre);
        this.salarioBasico = salarioBasico;
        this.dias = dias;
    }
    
    public String getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(String salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    
}
