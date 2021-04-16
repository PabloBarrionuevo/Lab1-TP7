package TP7;
/* *****************************************************************************
            TECNICATURA UNIVERSITARIA EN DESARROLLO DE SOFTWARE
MATERIA:        LABORATORIO 1
ALUMNO:         BARRIONUEVO PABLO
TRABAJO PRACTICO:
Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista de materias
en las que está inscripto; para ello tiene un método agregarMateria que permite 
inscribir al Alumno en una materia determinada 
(implementar de manera tal que no deje inscribir un alumno en dos materias iguales.) 
y otro método cantidadMaterias que devuelve la cantidad de materias a las que 
está inscripto el alumno.
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, tiene
además un constructor que inicializa sus propiedades y métodos get y set para 
cada uno de sus atributos.
Se pide:

En el método main de una clase de nombre Colegio:

a) Crear las materias:
i. Ingles I de primer año.
ii. Matemáticas de primer año.
iii. Laboratorio 1 de primer año
b) Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
c) Inscribir a López en las 3 materias.
d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1
e) Visualizar la cantidad de materias a las que está inscripto cada alumno
Publicar el código en un repositorio GIT y enviar por la tarea el link del mismo.
Importante: Armar el modelo UML representado las clases necesarias.
Implementar en java.
Vistas sugeridas para las funcionalidades (utilice JInternalFrame y que sean
accedidas desde un menú principal): Alta de Materias, Alta de Alumnos y
Formulario de Inscripción.
REPOSITORIO: https://github.com/PabloBarrionuevo/Lab1-TP7/tree/master
***************************************************************************** */
public class Colegio {
    public static void main(String[] args) {
        //a) i, ii, y iii.
        recursos.Materia 
            ingles1 = new recursos.Materia(10000,"Ingles 1",1),
            matematicas1 = new recursos.Materia(10001,"Matemáticas 1",1),
            laboratorio1 = new recursos.Materia(10002,"Laboratorio 1",1);
        //b) a y b
        recursos.Alumno 
            lopezMartin = new recursos.Alumno(1001, "López", "Martín"),
            martinezBrenda = new recursos.Alumno(1002, "Martínez", "Brenda");
        //c)
        lopezMartin.agregarMateria(ingles1);
        lopezMartin.agregarMateria(matematicas1);
        lopezMartin.agregarMateria(laboratorio1);
        //d)
        martinezBrenda.agregarMateria(ingles1);
        martinezBrenda.agregarMateria(matematicas1);
        martinezBrenda.agregarMateria(laboratorio1);
        martinezBrenda.agregarMateria(laboratorio1);
        //e)
        System.out.printf("El alumno %s %s, está inscripto en %d matérias.\nLa alumna %s %s, está inscripta en %d matérias.\n"
            ,lopezMartin.getApellido()
            ,lopezMartin.getNombre()
            ,lopezMartin.cantidadMaterias()
            ,martinezBrenda.getApellido()
            ,martinezBrenda.getNombre()
            ,martinezBrenda.cantidadMaterias());
        System.out.println(lopezMartin.toString());
        //Para las funcionalidades muestro las vistas
        vistas.FramePrincipal.abrirFramePrincipal();
    }
}
