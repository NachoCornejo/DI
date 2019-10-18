/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumno
 */
public class IngresoGastoTableModel extends AbstractTableModel {
    private List<IngresoGasto>listagestion;
    SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
    private String [] cabeceras={"Fecha","Concepto","Ingreso"};
    //constructor

    public IngresoGastoTableModel(List<IngresoGasto> listagestion) {
        this.listagestion = listagestion;
    }
    

    @Override
    public int getRowCount() {
       return listagestion.size();
    }

    @Override
    public int getColumnCount() {
        return cabeceras.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return sdf.format(listagestion.get(rowIndex).getFecha());
            case 1: return listagestion.get(rowIndex).getConcepto();
            case 2: return listagestion.get(rowIndex).getIngreso();
        }
        return null;
    }
    @Override
    public String getColumnName(int i){
    return cabeceras[1];
    }
    public void refrescar(){
    fireTableDataChanged();
    }
    
}
