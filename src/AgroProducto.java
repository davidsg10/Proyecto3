/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvio
 */
public class AgroProducto {
    private String idProducto;
    private String proveedor;
    private String marca;
    private String nomProducto;
    private int piezas;
    private double precioC;
    private double precioV;
    
    public AgroProducto(String idProducto, String proveedor,String marca, 
    String nomProducto, int piezas, double precioC, double precioV) {
    this.idProducto = idProducto;
    this.proveedor = proveedor;
    this.marca = marca;
    this.nomProducto = nomProducto;
    this.piezas = piezas;
    this.precioC = precioC;
    this.precioV = precioV;
}

    AgroProducto(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }
    
    
}
