
class Nodo {
    int dato;
    Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
}

public class Actividad {
    Nodo head;

    // RECORRIDO COMPLETO DE LA LISTA
    public void recorrer() {
        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.next;
        }

        System.out.println();
    }

    // PREGUNTA 1: BUSQUEDA DE UN NODO
    public boolean buscar(int valor) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.dato == valor) {
                return true;
            }
            actual = actual.next;
        }

        return false;
    }

    // PREGUNTA 2: MODIFICACION DE UN NODO
    public boolean modificar(int valorBuscado, int nuevoValor) {
        Nodo actual = head;

        while (actual != null) {
            if (actual.dato == valorBuscado) {
                actual.dato = nuevoValor;
                return true;
            }
            actual = actual.next;
        }

        return false;
    }

    // PREGUNTA 3: ELIMINACION DE UN NODO
    public boolean eliminar(int valor) {

        // Caso 1: la lista esta vacia
        if (head == null) {
            return false;
        }

        // Caso 2: el nodo que se elimina es el primero
        if (head.dato == valor) {
            head = head.next;
            return true;
        }

        // Caso 3: buscar el nodo anterior al que se eliminara
        Nodo anterior = head;
        Nodo actual = head.next;

        while (actual != null) {
            if (actual.dato == valor) {
                anterior.next = actual.next;
                return true;
            }

            anterior = actual;
            actual = actual.next;
        }

        return false;
    }

    // PREGUNTA 4: COMPARACION DE EFICIENCIA
    public static void compararEficiencia() {
        System.out.println("PREGUNTA 4: EFICIENCIA");
        System.out.println("Insercion al inicio: O(1)");
        System.out.println("Insercion al final: O(n)");
        System.out.println("Insercion despues de buscar un nodo: O(n)");
        System.out.println("Eliminacion al inicio: O(1)");
        System.out.println("Eliminacion por valor: O(n)");
        System.out.println("Eliminacion despues de buscar un nodo: O(n)");
    }

    public static void main(String[] args) {
        Actividad lista = new Actividad();

        // Crear la lista inicial: 29 -> 3 -> 4 -> 13
        lista.head = new Nodo(29);
        lista.head.next = new Nodo(3);
        lista.head.next.next = new Nodo(4);
        lista.head.next.next.next = new Nodo(13);

        System.out.println("LISTA ORIGINAL:");
        lista.recorrer();

        // PREGUNTA 1: BUSQUEDA
        System.out.println("\nPREGUNTA 1: BUSQUEDA DE UN NODO");

        int valorBuscado = 4;

        if (lista.buscar(valorBuscado)) {
            System.out.println("Nodo " + valorBuscado + " encontrado.");
        } else {
            System.out.println("Nodo " + valorBuscado + " no encontrado.");
        }

        // PREGUNTA 2: MODIFICACION
        System.out.println("\nPREGUNTA 2: MODIFICACION DE UN NODO");

        if (lista.modificar(4, 40)) {
            System.out.println("Nodo modificado correctamente.");
        } else {
            System.out.println("No se encontro el nodo para modificar.");
        }

        System.out.println("Lista despues de modificar:");
        lista.recorrer();

        // PREGUNTA 3: ELIMINACION
        System.out.println("\nPREGUNTA 3: ELIMINACION DE UN NODO");

        int valorEliminar = 3;

        if (lista.eliminar(valorEliminar)) {
            System.out.println("Nodo " + valorEliminar + " eliminado correctamente.");
        } else {
            System.out.println("No se encontro el nodo para eliminar.");
        }

        System.out.println("Lista despues de eliminar:");
        lista.recorrer();

        // PREGUNTA 4: EFICIENCIA
        System.out.println();
        compararEficiencia();
    }
}
