/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author vv094
 */
public class Pokemon {
    private String nombre;
    private int numero;
    private List<String> tipo;
    private String url;

    public Pokemon(String nombre, int numero, List<String> tipo, String url) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public List<String> getTipo() {
        return tipo;
    }

    public String getUrl() {
        return url;
    }
    
    
}
