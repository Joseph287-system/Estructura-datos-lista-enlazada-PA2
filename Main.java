
class Nodo {
    int dato;
    Nodo next;

    public Nodo(int dato) {
        this.dato = dato;
        this.next = null;
    }
}

public class Main {
    Nodo head;

    // PREGUNTA 1: Recorrido completo de la lista
    public void recorrer() {
        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.next;
        }

        System.out.println();
    }

    // PREGUNTA 2: Insercion al inicio
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.next = head;
        head = nuevo;
    }

    // PREGUNTA 3: Insercion al final
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (head == null) {
            head = nuevo;
            return;
        }

        Nodo actual = head;

        while (actual.next != null) {
            actual = actual.next;
        }

        actual.next = nuevo;
    }

    // PREGUNTA 4: Insercion despues de un nodo dado
    public void insertarDespuesDe(int datoBuscado, int nuevoDato) {
        Nodo actual = head;

        while (actual != null && actual.dato != datoBuscado) {
            actual = actual.next;
        }

        if (actual == null) {
            System.out.println("No se encontro el nodo " + datoBuscado);
            return;
        }

        Nodo nuevo = new Nodo(nuevoDato);
        nuevo.next = actual.next;
        actual.next = nuevo;
    }

    public static void main(String[] args) {
        Main lista = new Main();

        // Crear lista original: 29 -> 3 -> 4 -> 13
        lista.head = new Nodo(29);
        lista.head.next = new Nodo(3);
        lista.head.next.next = new Nodo(4);
        lista.head.next.next.next = new Nodo(13);

        // PREGUNTA 1
        System.out.println("PREGUNTA 1: RECORRIDO COMPLETO");
        lista.recorrer();

        // PREGUNTA 2: Insertar 10 al inicio
        System.out.println("\nPREGUNTA 2: INSERCION AL INICIO");
        lista.insertarInicio(10);
        lista.recorrer();

        // PREGUNTA 3: Insertar 50 al final
        System.out.println("\nPREGUNTA 3: INSERCION AL FINAL");
        lista.insertarFinal(50);
        lista.recorrer();

        // PREGUNTA 4: Insertar 20 despues del nodo 3
        System.out.println("\nPREGUNTA 4: INSERCION DESPUES DEL NODO 3");
        lista.insertarDespuesDe(3, 20);
        lista.recorrer();
    }
}

//ACTIVIDAD 2.1.  El algoritmo visita cada nodo desde head hasta llegar a null, mostrando 
// sus datos. La estructura de la lista no cambia, porque únicamente se recorren los nodos.

//ACTIVIDAD 2.2. Se crea un nuevo nodo con el valor 10, se conecta con el 
// primer nodo existente y se actualiza head para que apunte al nuevo nodo.

//ACTIVIDAD 2.3  Se recorre la lista hasta encontrar el último nodo, cuyo enlace apunta
//  a null. Luego, se conecta ese nodo con el nuevo nodo que contiene 50.
//Antes: 10 → 29 → 3 → 4 → 13
//Después: 10 → 29 → 3 → 4 → 13 → 50 → null

//ACTIVIDAD 2.4  Se busca el nodo que contiene 3 y se inserta un nuevo nodo con el
//  valor 20 inmediatamente después de él. Se actualizan los enlaces para conservar 
// la conexión con los demás nodos.
//Antes: 10 → 29 → 3 → 4 → 13 → 50
//Después: 10 → 29 → 3 → 20 → 4 → 13 → 50 → null