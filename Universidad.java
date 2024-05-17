

public class Universidad
{
    public static void main(String[] args){
        Docente docente1 = new Docente("Juan Perez",true,TipoCategoria.ASISTENTE,4,10);
        Docente docente2 = new Docente("Maria Lopez", true,TipoCategoria.TITULAR,8,0);
        Docente docente3 = new Docente("juan Lopez", true,TipoCategoria.OCASIONAL,8,10,TipoEstudio.MAESTRIA);
        
        Trabajos trabajo1 = new Trabajos("Artículo 1", TipoAporte.DOCENCIA);
        Trabajos trabajo2 = new Trabajos("Artículo 2", TipoAporte.ARTES);
        Trabajos trabajo3 = new Trabajos("Artículo 2", TipoAporte.DOCENCIA);
        CursosActualizacion curso1 = new CursosActualizacion("curso1", 40);
        CursosActualizacion curso2 = new CursosActualizacion("curso2", 40);
        CursosActualizacion curso3 = new CursosActualizacion("curso3", 40);
        
        docente1.agregarTrabajos(trabajo1);
        docente1.agregarCursos(curso1);
        docente2.agregarTrabajos(trabajo2);
        docente2.agregarTrabajos(trabajo3);
        docente2.agregarCursos(curso2);
        docente2.agregarCursos(curso3);
        docente3.agregarCursos(curso3);
        
        Docente.actualizarSMMLV(900000);
        System.out.println("Su SMMLV se ha modificado a: " + Docente.getSMMLV());
        
        
        docente1.verificarDocenteCatedra();
        System.out.println("*********************************************************************");
        docente2.verificarDocenteCatedra();
        System.out.println("*********************************************************************");
        docente3.verificarDocenteCatedra();
        System.out.println("************************************************************");
        
        
        docente1.verificarDocenteAsistente();
        System.out.println("*********************************************************************");
        docente2.verificarDocenteAsociado();
        System.out.println("*********************************************************************");
        docente2.verificarDocenteTitular();
        System.out.println("*********************************************************************");
        docente3.verificarDocenteOcasional();
         System.out.println("*********************************************************************");
         System.out.println("El docente " + docente1.getNombre() + " tiene un salario mensual de $" + docente1.getSalarioMensual());
        System.out.println("El docente " + docente2.getNombre() + " tiene un salario mensual de $" + docente2.getSalarioMensual());
        System.out.println("El docente " + docente3.getNombre() + " tiene un salario mensual de $" + docente3.getSalarioMensual());

        
        
    }
    
}
