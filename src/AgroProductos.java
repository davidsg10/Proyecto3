/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvio
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
public class AgroProductos {
    private ArrayList<AgroProducto> produc;

    public AgroProductos() 
    {
        produc = new ArrayList<AgroProducto>();
    }
    
    public void agregar(AgroProducto p) {
        produc.add(p);
    }
    
    public void borrar(AgroProducto p) {
        produc.remove(p);
    }
    
    public AgroProducto obtener(int pos) {
        return produc.get(pos);
    }
     public AgroProducto buscar(String clave) {
        for (int i = 0; i < produc.size(); i++) {
            if(clave.equals(produc.get(i).getIdProducto()))
                return produc.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return produc.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    void cargar() {
        try {
            File archivo = new File("C:\\Users\\Silvio\\Documents\\NetBeansProjects\\PracticaExamen\\src\\lista.txt");
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Silvio\\Documents\\NetBeansProjects\\PracticaExamen\\src\\lista.txt"));
                String linea;
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String idProducto = st.nextToken().trim();
                    String proveedor = st.nextToken().trim();
                    String marca = st.nextToken().trim();
                    String producto = st.nextToken().trim();
                    int piezas = Integer.parseInt(st.nextToken().trim());
                    double precioC = Integer.parseInt(st.nextToken().trim());
                    double precioV = Integer.parseInt(st.nextToken().trim());
                    AgroProducto p2 = new AgroProducto(idProducto, proveedor, marca, producto, piezas, precioC, precioV);
                    agregar(p2);
                }
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }   
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Silvio\\Documents\\NetBeansProjects\\PracticaExamen\\src\\lista.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getIdProducto()+","+obtener(i).getProveedor()+","+
                        obtener(i).getMarca()+","+obtener(i).getNomProducto()+","+obtener(i).getPiezas()+","+obtener(i).getPrecioC()+","+obtener(i).getPrecioV());
                pw.close();
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    void borrar(int fila) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
