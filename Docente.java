
import java.util.ArrayList;

    public class Docente {

    private String nombre;
    private boolean titulo;
    private TipoCategoria categoria;
    private int experiencia;
    private ArrayList<CursosActualizacion> cursos;
    private double salarioMensual;
    private TipoEstudio nivelEstudio;
    private ArrayList<Trabajos> trabajos;
    private static int SMMLV = 877803;
    private int tiempoContrato;
    
    public Docente(String nombre, boolean titulo,TipoCategoria categoria,int experiencia ,int tiempoContrato,TipoEstudio nivelEstudio) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.categoria = categoria;
        this.tiempoContrato = tiempoContrato;
        this.experiencia = experiencia;
        this.nivelEstudio = nivelEstudio;
        this.salarioMensual = calcularSalarioMensual();
        this.cursos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.tiempoContrato = 0;
    }

    public Docente(String nombre, boolean titulo,TipoCategoria categoria,int experiencia ,int tiempoContrato) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.categoria = categoria;
        this.tiempoContrato = tiempoContrato;
        this.experiencia = experiencia;
        this.salarioMensual = calcularSalarioMensual();
        this.cursos = new ArrayList<>();
        this.trabajos = new ArrayList<>();
        this.tiempoContrato = 0;
    }
    

     public void agregarCursos(CursosActualizacion curso) {
        cursos.add(curso);
       
    }

    public void agregarTrabajos(Trabajos trabajo) {
        trabajos.add(trabajo);
    
    }
    
    public static int getSMMLV(){
        return SMMLV;
    }
    
    public int getTiempoContrato(){
        return tiempoContrato;
    }
    
    public void setTiempoContrato(int tiempoContrato){
        tiempoContrato = tiempoContrato;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }



    public TipoEstudio getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio (TipoEstudio nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

   public void setTipoCategoria(TipoCategoria categoria){
       this.categoria =categoria;
   }
    

  

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public ArrayList<CursosActualizacion> getCursosActualizacion() {
        return cursos;
    }

    public ArrayList<Trabajos> getTrabajos() {
        return trabajos;
    }
    
     public double calcularSalarioMensual() {
        double salarioBase = 0;

            
            if (categoria.equals(TipoCategoria.AUXILIAR)) {
                salarioBase = 40000; 
            } else if (categoria.equals(TipoCategoria.ASISTENTE)) {
                salarioBase = 45000; 
            } else if (categoria.equals(TipoCategoria.ASOCIADO)) {
                salarioBase = 50000; 
            }else if(categoria.equals(TipoCategoria.TITULAR)){
                salarioBase = 58000; 
            }

        
            
             if (categoria.equals(TipoCategoria.OCASIONAL)) {
                 tiempoContrato = 10;
                 System.out.println("la cantidad de meses de su contrato es: " + tiempoContrato);
            if (nivelEstudio.equals(TipoEstudio.ESPECIALIZACION)) {
                salarioBase = 3 * SMMLV; 
            } else if (nivelEstudio.equals(TipoEstudio.MAESTRIA)) {
                salarioBase = 4 * SMMLV; 
            } else if (nivelEstudio.equals(TipoEstudio.DOCTORAL)) {
                salarioBase = 5 * SMMLV; 
            }
        }

        return salarioBase; 
    }
    
        
        public void verificarDocenteCatedra(){
            if(titulo = true && cursos.size() > 0){
                setTipoCategoria(TipoCategoria.CATEDRA);
                System.out.println("el docente " + getNombre() + " es de catedra");
            }else if(titulo = false && cursos.size() < 0) {
                System.out.println("el docente " + getNombre() + " no es de catedra");
            }
        }
        
        public void verificarDocenteAsistente() {
        if (titulo = true && cursos.size() > 0){
        if (experiencia >= 4 && cursos.size() > 0 && trabajos.size() > 0) {
            setTipoCategoria(TipoCategoria.ASISTENTE);
        System.out.println("El docente " + getNombre() + "  cumple los requisitos para ser Profesor Asistente.");
        } else  if (titulo = false&& cursos.size() < 0){
        System.out.println("El docente " + getNombre() +  "  no cumple los requisitos para ser Profesor Asistente.");
        }
        }
    }

        public void verificarDocenteAsociado() {
            if (titulo = true && cursos.size() > 0){
            if (experiencia >= 6 && experiencia <= 7 && trabajos.size() > 0 && cursos.size() > 0) {
        setTipoCategoria(TipoCategoria.ASOCIADO);
        System.out.println("El docente "  + getNombre() + " es de cátedra y cumple los  requisitos para ser Profesor Asociado.");
        } else  if (titulo = false && cursos.size() < 0){
        System.out.println("El docente " + getNombre() + "  no cumple los requisitos para ser Profesor Asociado.");
            }
        }   
    }

        public void verificarDocenteTitular() {
        if (titulo = true&& cursos.size() > 0){
        if (experiencia >= 8 && trabajos.size() >= 2 && cursos.size() > 0) {
        setTipoCategoria(TipoCategoria.TITULAR);
        System.out.println("El docente es de cátedra y cumple los requisitos para ser Profesor Titular.");
        } else if (titulo = false&& cursos.size() < 0){
        System.out.println("El docente " + getNombre() + " no es de cátedra o no cumple los requisitos para ser Profesor Titular.");
        }
        }
    }

        public void verificarDocenteOcasional() {
       if (titulo = true&& cursos.size() > 0){
        if (  tiempoContrato == 10 && cursos.size() > 0) {
            setTipoCategoria(TipoCategoria.OCASIONAL);
        System.out.println("El docente " + getNombre() + " es catedra ocasional.");
      } else if (titulo = false&& cursos.size() < 0) {
        System.out.println("El docente " + getNombre() + " no es de catedra ocasional.");
        }
        }
    }

    
    public static void actualizarSMMLV(int nuevoValor) {
        SMMLV = nuevoValor;
    }
}
