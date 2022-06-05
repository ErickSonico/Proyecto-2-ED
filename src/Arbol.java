import java.util.LinkedList;
import java.util.Queue;

class NodoArbol {
    

    NodoArbol nodoIzq;
    int datos;
    NodoArbol nodoDer;


    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null;
    }

    public void insertar(int valorInsertar) {
        if(valorInsertar < datos) {
            if(nodoIzq==null) {
                nodoIzq = new NodoArbol(valorInsertar);
            } else {
                nodoIzq.insertar(valorInsertar);
            }
        } else if(valorInsertar > datos) {
            if(nodoDer==null) {
                nodoDer = new NodoArbol(valorInsertar);
            } else {
                nodoDer.insertar(valorInsertar);
            }

        }
    }

    public NodoArbol getNodoIzq() {
        return nodoIzq;
    }
    
    public NodoArbol getNodoDer() {
        return nodoDer;
    }
    
    public int getDato() {
        return datos;
    }

}

public class Arbol {


    NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }


    public void insertarNodo(int valorInsertar) {

        if(raiz==null) {
            raiz = new NodoArbol(valorInsertar);
        } else {
            raiz.insertar(valorInsertar);
        }


    }


    public void preorden() {
        recorrePreorden(raiz);
    }


    public void recorrePreorden(NodoArbol nodo) {
        if (nodo==null) {
            return;
        }
        System.out.print(nodo.datos + " ");
        recorrePreorden(nodo.nodoIzq);
        recorrePreorden(nodo.nodoDer);
    }


    public void Inorden(){
        recorreInorden(raiz);
    }


    public void recorreInorden(NodoArbol nodo) { 
        if (nodo==null) {
            return;
        }
        recorreInorden(nodo.nodoIzq);
        System.out.print(nodo.datos + " ");
        recorreInorden(nodo.nodoDer);
    }

    public void Postorden(){
        recorrePostorden(raiz);
    }

    public void recorrePostorden(NodoArbol nodo) { 
        if (nodo==null) {
            return;
        }
        recorrePostorden(nodo.nodoIzq);
        recorrePostorden(nodo.nodoDer);
        System.out.print(nodo.datos + " ");
    }



    public String toString(){
       return toString(raiz);
    }

    private String toString(NodoArbol raiz) {
        Queue<NodoArbol> lista = new LinkedList<>();
    	String arbol = "";
    	if(raiz == null)
    		return "";

    	lista.add(raiz);
    	lista.add(null);

    	while(!lista.isEmpty()) {
	        NodoArbol tmp = lista.remove();
	        if(tmp == null) {
		        arbol = arbol + "-> ";
		        if(lista.isEmpty())
		            break;
		        else
		            lista.add(null);
	        } else {
		        arbol = arbol + tmp.getDato() + " ";
		        if(tmp.getNodoIzq() != null)
		            lista.add(tmp.getNodoIzq());

		        if(tmp.getNodoDer() != null)
		            lista.add(tmp.getNodoDer());
	        }
    	}
    	return arbol.substring(0,arbol.length()-4);
    }
 


    /**
     * Método que recibe un nodo y regresa la secuencia
     * que siguió para encontrar el elemento en caso de que esté
     * en el árbol.
     * Usa un método auxiliar llamado camino
     * @param n el nodo que buscamos
     */
    public void busquedaSeguimiento(int n){
        if(!contiene(n)){
            System.out.println("No se encontró el dato");
        }else{
            camino(raiz,n);
        }
}


    /**
     * Método auxiliar para el método busquedaSeguimiento
     * @param root raíz del árbol
     * @param dato  valor que buscamos
     */
    private void camino(NodoArbol root, int dato) {
	    if(root.getDato() == dato)
	        System.out.println();
	    else if(dato < root.getDato()) {
	        System.out.print("L ");
	        camino(root.getNodoIzq(),dato);
    	} else {
	        System.out.print("R ");
	        camino(root.getNodoDer(), dato);
    	}
    }
    

    /**
     * Método para verificar que un elemento está en el árbol
     * @param root nodo a partir del cual empezamos a buscar
     * @param dato el dato que buscamos
     * @return True si se encuentra y False en otro caso
     */
    public boolean contiene(NodoArbol root, int dato) {
    	boolean respuestaRápida = false;
    	if (root == null)
    		return respuestaRápida;
    	if(root.getDato() == dato){
    		respuestaRápida = true;
        }else if(dato < root.getDato()){
	    respuestaRápida = contiene(root.getNodoIzq(), dato);
        }else{
	    respuestaRápida = contiene(root.getNodoDer(), dato);
        }
    	return respuestaRápida;
    }

    /**
     * Método que llama al método contiene pero con un sólo argumento
     * @param dato el dato que buscamos
     * @return llamada al método contiene
     */
    public boolean contiene(int dato){
        return contiene(raiz, dato);
        }

}