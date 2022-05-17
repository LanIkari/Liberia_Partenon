/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import partenon.Autor;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maike
 */
public class TablaModelAutores extends AbstractTableModel{
    private ArrayList<Autor> datos= new ArrayList<>();
    private String[] columnasNombre={"Autores","Correos"};
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnasNombre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Autor tmp= datos.get(row);
        String info ="";
        if(column==0){
            info=tmp.getNombre();
        }else if(column==1){
            info=tmp.getCorreo();
        }
        return info;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];
    }

    public ArrayList<Autor> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Autor> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
    
    
}
