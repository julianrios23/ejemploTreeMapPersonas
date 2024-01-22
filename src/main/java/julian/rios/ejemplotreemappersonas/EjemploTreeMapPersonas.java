
package julian.rios.ejemplotreemappersonas;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Julian Rios
 */
public class EjemploTreeMapPersonas {

    public static void main(String[] args) {
        
        // Crear un TreeMap de personas
        Map<String, Persona> mapaPersonas = new TreeMap<>();

        // Crear objetos Persona
        Persona persona1 = new Persona("12345678", "Juan");
        Persona persona2 = new Persona("98765432", "María");
        Persona persona3 = new Persona("56789012", "Pedro");

        // Agregar personas al mapa
        mapaPersonas.put(persona1.getDni(), persona1);
        mapaPersonas.put(persona2.getDni(), persona2);
        mapaPersonas.put(persona3.getDni(), persona3);

        // Obtener una persona por su DNI
        String dniBuscado = "98765432";
        Persona personaEncontrada = mapaPersonas.get(dniBuscado);
        if (personaEncontrada != null) {
            System.out.println("Persona encontrada:");
            System.out.println("DNI: " + personaEncontrada.getDni());
            System.out.println("Nombre: " + personaEncontrada.getNombre());
        } else {
            System.out.println("Persona no encontrada.");
        }

        // Eliminar una persona del mapa
        String dniEliminar = "56789012";
        mapaPersonas.remove(dniEliminar);
        System.out.println("Persona con DNI " + dniEliminar + " ha sido eliminada del mapa.");

        // Imprimir el mapa de personas actualizado
        System.out.println("Personas en el mapa actualizado:");
        for (Map.Entry<String, Persona> entry : mapaPersonas.entrySet()) {
            String dni = entry.getKey();
            Persona persona = entry.getValue();
            System.out.println("DNI: " + dni);
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("-----");
        }
    }
}
/*
En este ejemplo, se crea un TreeMap llamado mapaPersonas que almacenará objetos Persona. 
Cada persona se identifica por su número de DNI, que se utiliza como clave en el mapa.

Se crean tres objetos Persona con diferentes DNIs y nombres, y se agregan al mapa 
utilizando el método put().

Dado que TreeMap es una implementación de SortedMap, se asegura que las claves estén 
ordenadas de forma natural. En este caso, las claves (DNIs) se ordenan de forma 
ascendente debido a la implementación de Comparable en la clase Persona.

Luego, se muestra cómo obtener una persona del mapa utilizando su DNI como clave, 
utilizando el método get(). Si se encuentra una persona con el DNI buscado, 
se imprime su información. Si no se encuentra ninguna persona, se muestra un mensaje 
indicando que no se encontró.

También se muestra cómo eliminar una persona del mapa utilizando el método remove()
y se imprime el mapa actualizado.

Recuerda que un TreeMap en Java es una estructura de datos que permite almacenar pares
clave-valor, donde las claves se mantienen en orden natural.
*/