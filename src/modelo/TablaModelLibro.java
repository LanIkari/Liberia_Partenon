/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import partenon.Autor;
import partenon.Libro;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maike
 */
public class TablaModelLibro extends AbstractTableModel{
    private ArrayList<Libro> datos= new ArrayList<>();
    private String[] columnasNombre={"Titulo","Fecha","Genero","Autor","Editorial"};
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return columnasNombre.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String tmp="";
        if(columnIndex==0){
            tmp=datos.get(rowIndex).getTitulo();
        }else if(columnIndex==1){
            SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
            String fecha=formato.format(this.datos.get(rowIndex).getAnno());
            tmp=fecha;
        }else if(columnIndex==2){
            tmp=datos.get(rowIndex).getGenero().getNombre();
        }else if(columnIndex==3){
            if(!datos.get(rowIndex).getAutores().isEmpty()){
                tmp=datos.get(rowIndex).getAutores().get(0).getNombre();
            }else{tmp="";}
        }else if(columnIndex==4){
            tmp=datos.get(rowIndex).getEditorial().getNombre();
        }
        return tmp;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];
    }

    public ArrayList<Libro> getDatos() {
        return datos;
    }
    
    
    
    public void setDatos(ArrayList<Libro> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
}
