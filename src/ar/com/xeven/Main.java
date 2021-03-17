package ar.com.xeven;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<Producto>();

        //Agrego frutas y verduras
        productos.add(new Producto("fruta","manzana",20));
        productos.add(new Producto("fruta","banana",50));
        productos.add(new Producto("fruta","durazno",55));
        productos.add(new Producto("verdura","zapallo calabacin",5));
        productos.add(new Producto("verdura","batata",7));

        //mostrar listado
        /*
        productos.forEach(producto ->
                System.out.println(producto));
        System.out.println();
        */


        //Duplicar la cantidad de la fruta 2 y la verdura 1
        //Producto fruta2 = new Producto();
        //fruta2
        Producto fruta2 = obtenerProducto("fruta",2,productos);
        fruta2.setCantidad(fruta2.getCantidad()*2);

        //verdu1
        Producto verdu1 = obtenerProducto("verdura",1,productos);
        verdu1.setCantidad(verdu1.getCantidad()*2);


        //elimino fruta1
        Producto fruta1 = obtenerProducto("fruta",1,productos);
        productos.remove(fruta1);


        //reemplazo verdura2
        Producto verdu2 =  obtenerProducto("verdura",2,productos);
        verdu2.setNombre("repollo");
        verdu2.setCantidad(20);

        productos.forEach(producto ->
                System.out.println(producto));
        System.out.println();



    }


    //metodo para ver y extraer los productos que desee
    public static Producto obtenerProducto(String tipo, Integer posicion, ArrayList<Producto> productos){
        Integer contadorProductos = 0;
        for (int i=0;i<productos.size();i++){
            Producto p = productos.get(i);
            if (p.getTipo()==tipo) {
                contadorProductos++;
                if (contadorProductos==posicion)
                    return p;
            }
        }
        return null;
    }
}
