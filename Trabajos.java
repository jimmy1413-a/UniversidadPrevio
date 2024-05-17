
/**
 * Write a description of class Trabajos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trabajos
{
    private String titulo;
    private TipoAporte tipoAporte;
    
    public Trabajos(String titulo,TipoAporte tipoAporte)
    {
        this.titulo = titulo;
        this.tipoAporte = tipoAporte;
    }

     public String getTitulo(){
        return titulo;
    }
    
    public TipoAporte getTipoAporte(){
        return tipoAporte;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public void setTipoAporte(TipoAporte tipoAporte){
        this.tipoAporte = tipoAporte;
    }
    
}
