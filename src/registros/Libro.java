/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros;

/**
 *
 * @author mdiazm97
 */
public class Libro {

    private String isbn;

    private String titulo;

    private String autor;


    private Boolean edEspecial;

    public Libro(String _isbn, String _titulo, String _autor, Boolean _edEspecial) {
        this.isbn = _isbn;
        this.titulo = _titulo;
        this.autor = _autor;
        edEspecial = _edEspecial;
    }

    public String getISBN() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public Boolean getEdicionEspecial(){
        return edEspecial;
    }
    
    public void setISBN(String _isbn){
        this.isbn = _isbn;
    }
    
    public void setTitle(String _title){
        this.titulo = _title;
    }
    
    public void setAuthor(String _author){
        this.autor = _author;
    }
    
    public void setSpecialEdition(Boolean _specialEdition){
        this.edEspecial = _specialEdition;
    }
    
    public String toCSV(){
        return isbn+";"+titulo+";"+autor+";"+edEspecial;
    }
}
