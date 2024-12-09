package recorridoarbolbinario;

// Clase para crear objetos de tipo "Nodo"
public class Nodo {
    // Atributos
    public String dato;
    public Nodo NodoIzquierdo; // Variable o atributo recursivo
    public Nodo NodoDerecho; // Variable o atributo recursivo
    
    
    // Método Constructor donde las variables o atributos tipo "Nodo" inician con valor null
    public Nodo(String dato) {
        this.dato = dato;
        this.NodoIzquierdo = null;
        this.NodoDerecho = null;
    }

    // Métodos Getter y Setter para recibir y retornar los valores
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getNodoIzquierdo() {
        return NodoIzquierdo;
    }

    public void setNodoIzquierdo(Nodo NodoIzquierdo) {
        this.NodoIzquierdo = NodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return NodoDerecho;
    }

    public void setNodoDerecho(Nodo NodoDerecho) {
        this.NodoDerecho = NodoDerecho;
    }
    
    

    
    
    
}
