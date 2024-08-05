package org.example;

public class Producto {

    //Atributos de la clase padre PRODUCTO
        private int idProducto;
        private int idCategoria;
        private int idPromociones;
        private String nombre;
        private double precio;
        public int stockProd_Invent;
        public String proveedor;

    //Método constructor
    public Producto(int idProductoC, int idCategoriaC, int idPromocionesC, String nombreC, double precioC,
                    int stockProd_InventC, String proveedorC) {
        this.idProducto = idProductoC;
        this.idCategoria = idCategoriaC;
        this.idPromociones = idPromocionesC;
        this.nombre = nombreC;
        this.precio = precioC;
        this.stockProd_Invent = stockProd_InventC;
        this.proveedor = proveedorC;
    }


    //Métodos propios de la clase
    public void activarPromociones(String datos){
        System.out.println(datos+'\n'+
                "ID_Prod: " + this.idProducto + '\n'+
                " Orden: "+ this.nombre + '\n'+
                " precio: "+ this.precio+'\n'+
                " Cód. de Promoción: "+ this.idPromociones);
    }

    //Métodos GETTER y SETTER
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdPromociones() {
        return idPromociones;
    }

    public void setIdPromociones(int idPromociones) {
        this.idPromociones = idPromociones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockProd_Invent() {
        return stockProd_Invent;
    }

    public void setStockProd_Invent(int stockProd_Invent) {
        this.stockProd_Invent = stockProd_Invent;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
