
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);

//        System.out.println("nombre persona:" + persona.getNombre());
//        System.out.println("sueldo persona:" + persona.getSueldo());
//        System.out.println("persona borrada?:" + persona.isEliminado());

        System.out.println("persona:" + persona);

        persona.setNombre("Carlos");
        persona.setSueldo(3000);
        persona.setEliminado(true);
        //persona.nombre = "Karla";

        System.out.println("persona:" + persona);

    }
}
