
/**
 * Write a description of class CursosActualizacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CursosActualizacion
{
    private String nombre;
    private int intensidad; // en horas

    public CursosActualizacion(String nombre, int intensidad) {
        this.nombre = nombre;
        this.intensidad = intensidad;
    }
    
    public String getNombreCurso(){
        return nombre;
    }
    
    public int getIntensidadCurso(){
        return intensidad;
    }
    
    public void setNombreCurso(String nombre){
        this.nombre = nombre;
    }
    
     public void setIntensidadCurso(int intensidad){
        this.intensidad = intensidad;
    }
}

