package org.example;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public class OrdenPedidoCliente extends Producto implements OrdenPedidoClienteInterface {

    //Atributos de la clase hija OrdenPedidoCliente
        private int idOrdenPedido;
        public Date fechaPedido;
        private double precioOrdenPed;
        private String metodoPago;
        private int idEmpleado_Atencion;
        private String itemProduct_Orden;
        public List<String> especificacionPed;
        private String estadoOrden;

    //Método Constructor
    public OrdenPedidoCliente(int idProductoC, int idCategoriaC, int idPromocionesC, String nombreC,
                              double precioC, int stockProd_InventC, String proveedorC, int idOrdenPedido,
                              Date fechaPedido, double precioOrdenPed, String metodoPago, int idEmpleado_Atencion,
                              String itemProduct_Orden, List<String> especificacionPed, String estadoOrden) {
        super(idProductoC, idCategoriaC, idPromocionesC, nombreC, precioC, stockProd_InventC, proveedorC);
        this.idOrdenPedido = idOrdenPedido;
        this.fechaPedido = fechaPedido;
        this.precioOrdenPed = precioOrdenPed;
        this.metodoPago = metodoPago;
        this.idEmpleado_Atencion = idEmpleado_Atencion;
        this.itemProduct_Orden = itemProduct_Orden;
        this.especificacionPed = especificacionPed;
        this.estadoOrden = estadoOrden;
    }


    //Métodos propios de la clase
        @Override
        public void agregarOrden(){

            System.out.println("Estimado cliente Su orden está lista:");

        }

        @Override
        public double realizarPago(){
            System.out.println("Su total a pagar es: $ ");
            return precioOrdenPed;
        }


    //Métodos GETTER y SETTER
    public int getIdOrdenPedido() {
        return idOrdenPedido;
    }

    public void setIdOrdenPedido(int idOrdenPedido) {
        this.idOrdenPedido = idOrdenPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getPrecioOrdenPed() {
        return precioOrdenPed;
    }

    public void setPrecioOrdenPed(double precioOrdenPed) {
        this.precioOrdenPed = precioOrdenPed;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getIdEmpleado_Atencion() {
        return idEmpleado_Atencion;
    }

    public void setIdEmpleado_Atencion(int idEmpleado_Atencion) {
        this.idEmpleado_Atencion = idEmpleado_Atencion;
    }

    public String getItemProduct_Orden() {
        return itemProduct_Orden;
    }

    public void setItemProduct_Orden(String itemProduct_Orden) {
        this.itemProduct_Orden = itemProduct_Orden;
    }

    public List<String> getEspecificacionPed() {
        return especificacionPed;
    }

    public void setEspecificacionPed(List<String> especificacionPed) {
        this.especificacionPed = especificacionPed;
    }

    public String getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(String estadoOrden) {
        this.estadoOrden = estadoOrden;
    }
}
