package partenon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Libro implements Serializable {

    private String titulo;
    private ArrayList<Autor> autores = new ArrayList<>();
    private String edicion;
    private Editorial editorial = new Editorial();
    private String isbn;
    private String pais;
    private Date anno;
    private float precio;
    private int existencia;
    private Genero genero = new Genero();
    private boolean ebook;
    private String pasta;
    private String idioma;

    public Libro() {
        // TODO Auto-generated constructor stub
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getAnno() {
        return anno;
    }

    public void setAnno(Date anno) {
        this.anno = anno;
    }

    

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean isEbook() {
        return ebook;
    }

    public void setEbook(boolean ebook) {
        this.ebook = ebook;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Libro \n"
                + "Título: " + titulo + "\n"
                + "Autor: " + autores + "\n"
                + "Edición: " + edicion + "\n"
                + "Editorial: " + editorial + "\n"
                + "Isbn: " + isbn + "\n"
                + "Pais: " + pais + "\n"
                + "Año: " + anno + "\n"
                + "Precio: " + precio + "\n"
                + "Existencia: " + existencia + "\n"
                + "Género: " + genero + "\n"
                + "eBook: " + ebook + "\n"
                + "Pasta: " + pasta + "\n"
                + "Idioma: " + idioma + "\n";
    }

}
