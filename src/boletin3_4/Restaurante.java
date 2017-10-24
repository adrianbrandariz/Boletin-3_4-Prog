/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_4;

/**
 *
 * @author abrandarizdominguez
 */
public class Restaurante {
    private int polbo;
    private int patacas;
    //Constructor por defecto
    public Restaurante(){
    }
    //Constructor con parámetros
    public Restaurante(int pol, int pat){
        polbo=pol;
        patacas=pat;
    }
    //Métodos de acceso
    public void setPolbo(int pol){
        polbo=pol;
    }
    public void setPatacas(int pat){
        patacas=pat;
    }
    public int getPolbo(){
        return polbo;
    }
    public int getPatacas(){
        return patacas;
    }
    //Método que engade x kg de polbo a os xa existentes
    public void engadirPolbo(int x){
        int pol = polbo+x;
    }
    //Método que engade x kg de patacas a os xa existentes
    public void engadirPatacas(int x){
        int pat = patacas+x;
    }
    //Método que amosa por pantalla os kg de polbo que ten no almacen
    public void amosarPolbo(){
        System.out.println("A cantidade de polbo no almacén é de "+polbo+" kg.");
    }
    //Método que amosa por pantalla os kg de patacas que ten no almacen
    public void amosarPatacas(){
        System.out.println("A cantidade de patacas no almacén é de "+patacas+" kg.");
    }
}
