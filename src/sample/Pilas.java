package sample;

/**
 * Created by lenovo on 08/11/2017.
 */
public class Pilas {
    private Nodo top;

    public Pilas(){
        top = null;
    }

    public boolean vacia(){
        return (top == null);
    }

    public void Push(int valor){
        Nodo nuevoNodo;
        if(vacia())
            top = new Nodo(valor);
        else {
            nuevoNodo = new Nodo(valor);
            nuevoNodo.setProx(top);
            top = nuevoNodo;
        }
    }

    public void peek(){
        Nodo temp = top;
        if(temp!=null){
            System.out.println("La pila es: ");
            while (temp!=null){
                System.out.println(temp.getValor());
                temp=temp.getProx();
            }
        }
        else
            System.out.println("PILA VACÍA.");
    }

    public void Cima(){
        if(!vacia())
            System.out.println("Cima; "+top.getValor());
        else
            System.out.println("La pila esta vacía");
    }

    public void Pop(){
        if(!vacia()){
            System.out.println("Data extraido: "+top.getValor());
            top = top.getProx();
        }
        else
            System.out.println("La pila esta vacia");
    }


}
