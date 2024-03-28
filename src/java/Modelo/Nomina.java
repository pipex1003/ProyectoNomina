/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ANDRES AVILA
 */
public class Nomina extends Empleado {
    
    private double aux;
    private double salud;
    private double pension;
    private double sdias;
    private double sTotal;
    private double sal;
    private int dia;
    
    public Nomina( String salarioBasico, String dias, String id, String nombre) {
        super(salarioBasico, dias, id, nombre);
         sal=Double.parseDouble(salarioBasico);
         dia=Integer.parseInt(dias);
    }
    
    public double calAux(double sal){
       aux=sal*0.10;
       return aux;
    }
    public double calSalud(double sal){
       salud=sal*0.04;
       return salud;
    }
    public double calPension(double sal){
       pension=sal*0.04;
       return pension;
    }
    public double calsueldotot(double sal, int dia){
     sdias=(sal/30)*dia;
     return sdias;
    }
    public void calsueldo(){
        double auxCalculado = calAux(sal);
        double saludCalculada = calSalud(sal);
        double pensionCalculada = calPension(sal);
        double sdiascal= calsueldotot(sal,dia);
        System.out.println(sdiascal);
        if(sdiascal <= 2600000){
            System.out.println("si tiene aux");
            sTotal = sdiascal - pensionCalculada - saludCalculada + auxCalculado;
        } else {
            System.out.println("no tiene aux");
            sTotal = sdiascal - pensionCalculada - saludCalculada;    
        }
    }
    public Double getsTotal(){
      return sTotal;
    }
    public Double getsalud(){
      double saludCalculada = calSalud(sal);
      return saludCalculada;
    }
    public Double getpension(){
      double pensionCalculada = calPension(sal);
      return pensionCalculada;
    }
    public Double getaux(){
      double sdiascal= calsueldotot(sal,dia);
      double auxCalculado;
        System.out.println(sdiascal);
        if(sdiascal <= 2600000){
            auxCalculado = calAux(sal);
            return  auxCalculado;}
        else {
            return auxCalculado=0.0;}
    }
    
}
