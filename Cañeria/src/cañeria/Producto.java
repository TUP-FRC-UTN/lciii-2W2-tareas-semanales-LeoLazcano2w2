/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cañeria;

/**
 *
 * @author laio_
 */
public class Producto {
    private String descripcion;
    private Material materiales[];
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setMateriales(Material materiales[]){
        this.materiales = materiales;
    }
    public Material[] getMateriales(){
        return materiales;
    }
    
    public Producto(int cantidad){
        this.materiales = new Material[cantidad];
    }
    
    public void agregarMaterial(int cantidad, Material material){
        Material[] m = new Material[cantidad];
        for (int i = 0; i < cantidad; i++) {
            m[i] = material;
        }
    }
    
    public float costoTotal(Material materiales[]){
        float total = 0;
        Material m = new Material();
        for (int i = 0; i < materiales.length; i++) {
            total += m.getValorUnitario();
        }
        return total;
    }
}
