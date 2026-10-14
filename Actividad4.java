public class Actividad4 {

    // Cada nodo doble tiene un dato y dos enlaces.
    static class NodoDoble {
        int dato;
        NodoDoble anterior;
        NodoDoble siguiente;

        NodoDoble(int dato) {
            this.dato = dato;
        }
    }

    // Cada nodo circular tiene un dato y un enlace.
    static class NodoCircular {
        int dato;
        NodoCircular siguiente;

        NodoCircular(int dato) {
            this.dato = dato;
        }
    }

    public static void main(String[] args) {

        // LISTA DOBLE: solicitudes 29, 3, 4 y 13.
        NodoDoble primero = new NodoDoble(29);
        NodoDoble segundo = new NodoDoble(3);
        NodoDoble tercero = new NodoDoble(4);
        NodoDoble ultimo = new NodoDoble(13);

        primero.siguiente = segundo;
        segundo.anterior = primero;

        segundo.siguiente = tercero;
        tercero.anterior = segundo;

        tercero.siguiente = ultimo;
        ultimo.anterior = tercero;

        System.out.println("LISTA DOBLE: RECORRIDO HACIA ADELANTE");

        NodoDoble actual = primero;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println("\nLISTA DOBLE: RECORRIDO HACIA ATRAS");

        actual = ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }

        // LISTA CIRCULAR: las mismas solicitudes.
        NodoCircular inicio = new NodoCircular(29);
        NodoCircular nodo2 = new NodoCircular(3);
        NodoCircular nodo3 = new NodoCircular(4);
        NodoCircular fin = new NodoCircular(13);

        inicio.siguiente = nodo2;
        nodo2.siguiente = nodo3;
        nodo3.siguiente = fin;
        fin.siguiente = inicio; // El ultimo vuelve al primero.

        System.out.println("\nLISTA CIRCULAR: UNA VUELTA COMPLETA");

        NodoCircular auxiliar = inicio;
        do {
            System.out.print(auxiliar.dato + " ");
            auxiliar = auxiliar.siguiente;
        } while (auxiliar != inicio);

        System.out.println("\nDespues del 13, se vuelve a la solicitud "
                + auxiliar.dato);
    }
}