import java.util.List;

/* 
 * 
 * authors ALEJANDRO GOMEZ & THOMAS VANEGAS (E.D.A MA-JU 4-6)
 * 
*/


public class Main {
    public static void main(String[] args) {

        //String cp = System.getProperty("java.classpath");


        // INGRESAR LA LONGITUD DEL ARREGLO PARA EVALUAR EXPERIMENTALMENTE
        List<String> nombresCompletos = GeneradorADTs.generar(10000000);

        DoublyLinkedList listaPersonas = new DoublyLinkedList();

        for (String nombreCompleto : nombresCompletos) {
            String[] partes = nombreCompleto.split(" ");
            String nombre1 = partes[0];
            String nombre2 = partes[1];
            String apellido1 = partes[2];
            String apellido2 = partes[3];
            listaPersonas.insert(new Person(nombre1 + " " + nombre2 + "", apellido1 + " " + apellido2 + ",").toString());
        }

        System.out.println(" --- Lista sin ordenar: --- \n");
        listaPersonas.display();

        System.out.println("--- Lista ordenada: --- \n");
        long start = System.nanoTime();
        DoublyLinkedList listaOrdenada = DoublyLinkedList.mergesort(listaPersonas);
        long end = System.nanoTime();
        listaOrdenada.display();


        long execTime = end - start;
        double execTimeSec = execTime / 1_000_000_000.0; // nano = 10^-9
        System.out.println("\nTiempo de Ejecución (MergeSort) Experimentalmente -> " + execTimeSec + "\n");

    }
}
