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
public class Material {
    private String descripcion;
    private int codigo;
    private float valorUnitario;
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setValorUnitario(float valorUnitario){
        this.valorUnitario = valorUnitario;
    }
    public float getValorUnitario(){
        return valorUnitario;
    }
    
    public Material(String descripcion, int codigo, float valorUnitario){
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    
    public Material(){
        descripcion = "";
        codigo = 0;
        valorUnitario = 0;
    }
}
