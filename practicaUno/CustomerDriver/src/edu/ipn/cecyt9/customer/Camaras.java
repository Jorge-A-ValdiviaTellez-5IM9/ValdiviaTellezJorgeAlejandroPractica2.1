/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Alumno
 */
public class Camaras {
    
    private String marca;
    private String modelo;
    private String puntosenfoque;
    private String reflexdigital;
    private String peso;
    private String tipo;
    private String maxiso;
    
    
   
    
    public Camaras(String marca, String modelo) {
        
        this.marca=marca;
        this.modelo=modelo;
        System.out.println("Marca: "+marca+"\n Modelo: "+modelo);
    }
    public Camaras(String puntosenfoque,String reflexdigital, String peso) {
    
        this.puntosenfoque=puntosenfoque;
        this.reflexdigital=reflexdigital;
        this.peso=peso;
        System.out.println("Puntos de enfoque: "+puntosenfoque+"\n Caracteristica: "+reflexdigital+"\n Peso:"+peso);
    }
    public Camaras(String marca, String modelo, String puntosenfoque,String reflexdigital, String peso) {
    
        this.marca=marca;
        this.modelo=modelo;
        this.puntosenfoque=puntosenfoque;
        this.reflexdigital=reflexdigital;
        this.peso=peso;
        System.out.println("Marca: "+marca+"\n Modelo: "+modelo+"\n Puntos de enfoque: "+puntosenfoque+"\n Caracteristica: "+reflexdigital+"\n Peso:"+peso);
    }
    public Camaras(String marca, String modelo, String puntosenfoque,String reflexdigital, String peso, String tipo) {
    
        this.marca=marca;
        this.modelo=modelo;
        this.puntosenfoque=puntosenfoque;
        this.reflexdigital=reflexdigital;
        this.peso=peso;
        this.tipo=tipo;
        System.out.println("Marca: "+marca+"\n Modelo: "+modelo+"\n Puntos de enfoque: "+puntosenfoque+"\n Caracteristica: "+reflexdigital+"\n Peso: "+peso+"\n Megapixeles: "+tipo);
    }
    public Camaras(String marca, String modelo, String puntosenfoque,String reflexdigital, String peso, String tipo, String maxiso) {
    
        this.marca=marca;
        this.modelo=modelo;
        this.puntosenfoque=puntosenfoque;
        this.reflexdigital=reflexdigital;
        this.peso=peso;
        this.tipo=tipo;
        this.maxiso=maxiso;
        System.out.println("Marca: "+marca+"\n Modelo: "+modelo+"\n Puntos de enfoque: "+puntosenfoque+"\n Caracteristica: "+reflexdigital+"\n Peso: "+peso+"\n Megapixeles: "+tipo+"\n Maximo iso: "+maxiso);
    }
}

