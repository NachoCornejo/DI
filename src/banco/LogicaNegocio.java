/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class LogicaNegocio {

    private static List<IngresoGasto> listaIngreso = new ArrayList<>();
    private static List<IngresoGasto> listaGasto = new ArrayList<>();
    private float ingresototal = 0;
    private float gastototal = 0;
    private float total=0;

    public static void aniadirIngreso(IngresoGasto ingreso) {
        listaIngreso.add(ingreso);
    }

    public static List<IngresoGasto> mostrarListaIngreso() {
        return listaIngreso;
    }

    public static void aniadirGasto(IngresoGasto gasto) {
        listaGasto.add(gasto);
    }

    public static List<IngresoGasto> mostrarListaGasto() {
        return listaGasto;
    }

    public float ingresototal() {
        ingresototal = 0;
        for (IngresoGasto ingreso : listaIngreso) {
            ingresototal = ingresototal + ingreso.getIngreso();

        }
        return ingresototal;

    }

    public float gastoTotal() {
        gastototal = 0;
        for (IngresoGasto Gasto : listaGasto) {

            gastototal += Gasto.getIngreso();
        }
        return gastototal;
    }

    public float getIngresototal() {
        return ingresototal;
    }

    public void setIngresototal() {
        this.ingresototal = ingresototal;
    }

    public float getGastototal() {
        return gastototal;
    }

    public void setGastototal() {
        this.gastototal = gastototal;
    }

    public float Balance() {
     
         total = getIngresototal() - getGastototal();
        return total;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    

}
