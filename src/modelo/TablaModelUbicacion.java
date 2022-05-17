package modelo;

import partenon.Ubicacion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Maike
 */
public class TablaModelUbicacion extends AbstractTableModel{
    private ArrayList<Ubicacion> datos= new ArrayList<>();
    private String[] columnasNombre={"Estantes","Filas"};
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
        Ubicacion tmp= datos.get(row);
        String info ="";
        if(column==0){
            info=tmp.getEstantes();
        }else if(column==1){
            info=String.valueOf(tmp.getFilas());
        }
        return info;
    }

    @Override
    public String getColumnName(int column) {
        return columnasNombre[column];
    }

    public ArrayList<Ubicacion> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Ubicacion> datos) {
        this.datos = datos;
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }
    
    
}
