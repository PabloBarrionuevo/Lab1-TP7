package recursos;
public class Materia {
    private int idMateria, anio;
    private String nombre;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    //Metodos para vistas
    @Override
    public String toString(){
        return String.valueOf(idMateria) +";"+ nombre +";"+ String.valueOf(anio);
    }
    @Override
    public boolean equals(Object o) {return idMateria == ((Materia)o).idMateria;}

    @Override
    public int hashCode() {return 7 * 19 + this.idMateria;}
}
