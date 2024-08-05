package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inventario extends Producto implements InventarioInterface{

    //Atributos de la clase hija Inventario
        private int idIngreso_Stock;
        public int idLocal;
        public String responsab_Invent;
        private List <String> descripcionProduct;
        private int idCateg_Product;
        public int idProveed_Product;


    //Método constructor
    public Inventario(int idProductoC, int idCategoriaC, int idPromocionesC,
                      String nombreC, double precioC, int stockProd_InventC,
                      String proveedorC, int idIngreso_Stock, int idLocal,
                      String responsab_Invent,
                      int idCateg_Product, int idProveed_Product) {
        super(idProductoC, idCategoriaC, idPromocionesC, nombreC,
                precioC, stockProd_InventC, proveedorC);
        this.idIngreso_Stock = idIngreso_Stock;
        this.idLocal = idLocal;
        this.responsab_Invent = responsab_Invent;
        this.descripcionProduct = new ArrayList<>();
        this.idCateg_Product = idCateg_Product;
        this.idProveed_Product = idProveed_Product;
    }

    //Métodos propios de la clase con interfaces
    @Override
    public void crearOrdenStock() {
        System.out.println("Listado de productos en el inventario:");
        for (String producto : descripcionProduct) {
            System.out.println("- " + producto);
        }
    }

    @Override
    public int stockActProduct(){

        if (idIngreso_Stock==0){
            System.out.println("NO HAY ORDENES DE INGRESO: ");
        }else {
            if (idIngreso_Stock==1){
                System.out.println("PRIMERA ORDEN DE INGRESO");
            }else {
                System.out.println("NUEVA ORDEN GENERADA");
            }
        }

        return idIngreso_Stock;
    }

    //Métodos GETTER y SETTER
    public int getIdIngreso_Stock() {
        return idIngreso_Stock;
    }

    public void setIdIngreso_Stock(int idIngreso_Stock) {
        this.idIngreso_Stock = idIngreso_Stock;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getResponsab_Invent() {
        return responsab_Invent;
    }

    public void setResponsab_Invent(String responsab_Invent) {
        this.responsab_Invent = responsab_Invent;
    }

    public List<String> getDescripcionProduct() {

        return descripcionProduct;
    }

    public void setDescripcionProduct(String prod_Descrip) {
        //le pasamos por parámetro un atributo el mimos que lo agregaremos a la lista de la descripción
        //de lso productos que tenemos en stock hasta el momento
        this.descripcionProduct.add(prod_Descrip);
    }

    public int getIdCateg_Product() {
        return idCateg_Product;
    }

    public void setIdCateg_Product(int idCateg_Product) {
        this.idCateg_Product = idCateg_Product;
    }

    public int getIdProveed_Product() {
        return idProveed_Product;
    }

    public void setIdProveed_Product(int idProveed_Product) {
        this.idProveed_Product = idProveed_Product;
    }
}
