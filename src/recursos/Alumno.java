package recursos;

public class Alumno {
    private int legajo;
    private String apellido, nombre;
    private java.util.List<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new java.util.ArrayList<Materia>();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia materia){
        if(!materias.stream().anyMatch(mat -> mat.getIdMateria() == materia.getIdMateria())) materias.add(materia);
        else {
            System.out.printf("%s %s, no necesita volver a inscribirse en la materia %s.\n"
            ,apellido
            ,nombre
            ,materia.getNombre());
            javax.swing.JOptionPane.showMessageDialog(null,apellido +" "+ nombre +", no necesita volver a inscribirse en la materia "+ materia.getNombre()+ ".\n");
        }
    }
    public int cantidadMaterias(){return materias.size();}
    
    //Metodos para vistas, orden, y mostrar
    @Override
    public String toString(){
        return legajo +";"+ apellido +";"+ nombre +";"+ materias
                .stream().map(materia -> materia.getIdMateria()).collect(java.util.stream.Collectors.toList()).toString().replaceAll(", ", ",");
    }
    @Override
    public boolean equals(Object o) {return legajo == ((Alumno)o).legajo;}

    @Override
    public int hashCode() {return 7 * 37 + legajo;}
}
