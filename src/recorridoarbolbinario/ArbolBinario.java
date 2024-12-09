package recorridoarbolbinario;

// Clase "ArbolBinario" para crear objetos de tipo "Nodo" ESTÁTICO y realizar el ordenamiento Pre, In y Post-Orden
public class ArbolBinario {

    public static void main(String[] args) {
        // Creación del arbol
        Nodo raiz = new Nodo("2");              // Nodo "raiz(2)"
        Nodo nodo2 = new Nodo("7");             // Nodo2 a la izquierda bajo la "raiz(7)"
        Nodo nodo3 = new Nodo("5");             // Nodo3 a la derecha bajo la "raiz(5)"
        
        raiz.setNodoIzquierdo(nodo2);           // Tomando "nodo2(7)"
        nodo2.setNodoIzquierdo(new Nodo("2"));  // Agrega un nuevo "nodo(2)" a la izquierda bajo "nodo(7)"
        
        Nodo nodo4 = new Nodo("6");             // Crea nuevo nodo, "nodo4" con el valor (6)
        nodo2.setNodoDerecho(nodo4);            // Agrega el nuevo "nodo4(6)" a ña derecha bajo "nodo2(7)"
        
        nodo4.setNodoIzquierdo(new Nodo("5"));  // Crea un nuevo nodo a la izquierda bajo "nodo4(6)" con el valor (5)
        nodo4.setNodoDerecho(new Nodo("11"));   // Crea un nuevo nodo a la derecha bajo "nodo4(6)" con el valor (11)
        
        raiz.setNodoDerecho(nodo3);             // Toma el "nodo3(5)"
        
        Nodo nodo5 = new Nodo("9");             // Crea nuevo nodo, "nodo5" con el valor(9)
        nodo3.setNodoDerecho(nodo5);            // Agrega el nuevo "nodo5(9)" a la derecha bajo "nodo3(7)"
        
        nodo5.setNodoIzquierdo(new Nodo("4"));  // Crea nuevo nodo a la izquierda bajo "nodo5(6)" con el valor (4)

        //Ejecuta los resultados en PRE-ORDEN
        System.out.println("Pre-Orden:");
        preOrden(raiz);

        //Ejecuta los resultados en IN-ORDEN
        System.out.println("\nIn-Orden:");
        inOrden(raiz);
        
        //Ejecuta los resultados en POST-ORDEN
        System.out.println("\nPost-Orden:");
        postOrden(raiz);
        System.out.println("");
    }

    // Método para ordenamiento PRE-ORDEN
    public static void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(" "+raiz.getDato());  // Obtiene y muestra la "raiz"
            preOrden(raiz.getNodoIzquierdo());       // Recursividad a la iaquierda
            preOrden(raiz.getNodoDerecho());         // Recursividad a la derecha
        }
    }

    // Método para ordenamiento IN-ORDEN
    public static void inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getNodoIzquierdo());       // Recursividad a la iaquierda
            System.out.print(" "+raiz.getDato());  // Obtiene y muestra la "raiz"
            inOrden(raiz.getNodoDerecho());         // Recursividad a la derecha
        }
    }

    // Método para ordenamiento POST-ORDEN
    public static void postOrden(Nodo raiz) {
        if (raiz != null) {
            postOrden(raiz.getNodoIzquierdo());       // Recursividad a la iaquierda
            postOrden(raiz.getNodoDerecho());         // Recursividad a la derecha
            System.out.print(" "+raiz.getDato());  // Obtiene y muestra la "raiz"
        }
    }
}
