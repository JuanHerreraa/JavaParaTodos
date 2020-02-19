
import java.util.Date;

public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Lomas #13");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Karla");
        System.out.println(cliente1);
        
    }
}
