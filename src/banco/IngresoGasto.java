/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class IngresoGasto {
  private Date fecha;
    private String concepto;
    private float ingreso;
    SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
//constructor

    public IngresoGasto(Date fecha, String concepto, float ingreso) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.ingreso = ingreso;
    }
    //get y set

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }
    public String[] IngresoGastoArray(){
    String[] gestion= new String[3];
    gestion[0]=sdf.format(fecha);
    gestion[1]=concepto;
    gestion[3]=Float.toString(ingreso);
    return gestion;
    }


}
