
public class Taller3 {

    public static void main(String[] args) {
        Persona[] estudiantes1 = new Persona[3];
        estudiantes1[0] = new Persona(188220);
        estudiantes1[1] = new Persona();
        estudiantes1[2] = new Persona(71212, "Maria");
        Persona profesor1 = new Persona("Juan", 988);
        Asignatura asignatura1 = new Asignatura("Calculo");
        Grupo grupo1 = new Grupo(estudiantes1, profesor1, asignatura1, 10023, "M J 2-4");

        Persona profesor2 = new Persona(99212, "Andrea");
        Asignatura asignatura2 = new Asignatura(882);
        asignatura2.setCodigoInterno(98);
        asignatura2.cambiarDatos("Estadistica");
        Grupo grupo2 = new Grupo(2, profesor2, asignatura2, 10122, "W V 8-10");
        grupo2.cambiarEstudiante(0, estudiantes1[0]);
        grupo2.cambiarEstudiante(1, estudiantes1[2]);
        grupo2.cambiarEstudiante(estudiantes1[0], estudiantes1[1]);

    }
}
