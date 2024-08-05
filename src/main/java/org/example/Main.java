package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creamos una lista inicial de productos
        List<Inventario> prod_List_Ini = new ArrayList<>();

        //Creamos un objeto de Tipo Inventario y lo instanciamos de la clase Inventario
        Inventario producto01 = new Inventario(001,200,
                300, "Capuchino dulce de leche",
                3.50,003,"NescafeEC",
                1,10,"Juan Perez",6,
                50);

        //Seteamos los valores que contendrá el dato de tipo List<String> descripcionProduct
        producto01.setDescripcionProduct(" Cafe");
        producto01.setDescripcionProduct(" Leche entera");
        producto01.setDescripcionProduct(" Crema de leche");

        //Llamamos al método de la clave hija Inventario llamado crearOrdenStock para que nos muestre
        //el inventario que tenemos hasta el momento de productos disponibles en nuestro STOCK
        producto01.crearOrdenStock();


        //Añadimos a la lista PRINCIPAL dicho objeto
        prod_List_Ini.add(producto01);

        System.out.println("--------------------------------------------------------");

        //Recorremos la Lista prod_List_Ini
        for (Inventario prod : prod_List_Ini){

            System.out.println("*** Bienvenidos a la Cafetería -> JA & CC ASOCIADOS ***");
            System.out.println("--------------------------------------------------------");
                System.out.println("Su orden: "+ prod.getNombre()+"\n"+
                                   "->Ingredientes: ");

            //recorremos la lista de la descripcion del producto y la mostramos por pantalla
            for (String descripProdct: prod.getDescripcionProduct()){

                System.out.println(descripProdct);
            }

            System.out.println("Fue atendido por el Barista: "+prod.getResponsab_Invent()+'\n'+
                    "Gracias por su compra!!!");
        }
        System.out.println("_________________________________");

        producto01.activarPromociones("PROMOCIONES ACTIVAS->"+'\n'+
                            "Se obsequiará un cupón de descuento del 50% para su sgte. compra de este producto:");

        //Llamamos al método de la clave hija Inventario llamado stockActProduct para que nos muestre
        //la cantidad de Ordenes de ingreso de stock de un producto hasta el momento al sistema
        System.out.println("_________________________________");
        System.out.println("Ordenes de INGRESO DE STOCK DE PRODUCTO hasta el momento al sistema: "+
                producto01.stockActProduct());

        System.out.println("_________________________________");


        // Creamos una lista inicial de las especificaciones del pedido del cliente
        List<OrdenPedidoCliente> ord_PedCliente = new ArrayList<>();

        //Creamos un objeto de Tipo List<String> y lo instanciamos de la clase OrdenPedidoCliente
        List<String> especific = new ArrayList<>();

        //LISTA COMO PARÁMETRO DENTRO DEL CONSTRUCTOR DE LA CLASE HIJA
        //Añadimos a la SubLista 'especific' las especificaciones del pedido
        especific.add("Machiatto sin azúcar");
        especific.add("Con crema chantilly");
        especific.add("Con canela");

        //creamos un objeto llamado 'pedido_001' y lo instanciamos de la clase hija OrdenPedidoCliente
        //con los parámetros del constructor de dicha clase
        OrdenPedidoCliente pedido_001 = new OrdenPedidoCliente(001,200,
                300, "Mocachino de la casa",23,
                4,"Hacienda Cafetera LOJA-EC",45,new Date(),
                10.30,"efectivo",23,
        "Chocolate semiamargo", especific, "ATENDIDA");

        ord_PedCliente.add(pedido_001);

        for (OrdenPedidoCliente pedir : ord_PedCliente){
            System.out.println("Su orden: "+ pedir.realizarPago());
            System.out.println("Estado de la orden: " + pedir.getEstadoOrden());

        }




    }
}