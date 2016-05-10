
import Structures.Queue;
import Structures.LinkedList;
import Structures.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicializando los TDA...");
        LinkedList list = new LinkedList();
        Stack stack = new Stack();
        Queue queue = new Queue();
        System.out.println("Insertando en los TDA...");
        for (int i = 0; i < 20; i++) {
            System.out.println("Insertando en la lista...");
            list.insert(i, i);
            System.out.println("Insertando en la pila...");
            stack.push(i);
            System.out.println("Insertando en la cola...");
            queue.queue(i);
        }
        System.out.println("Enumerando en la lista...");
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ". " + list.at(i));
        }
        System.out.println("Eliminando los TDA....");
        for (int i = 0; i < 20; i++) {
            System.out.println("Eliminando en la pila...");
            System.out.println(stack.pop());
            System.out.println("Eliminando en la cola...");
            System.out.println(queue.dequeue());
        }
        System.out.println("Verificando el tamaño resultante: ");
        System.out.println("Pila: " + stack.getSize());
        System.out.println("Cola: " + queue.getSize());
        System.out.println("Lista: " + list.getSize());
        System.out.println("Fin de la ejecución.");
    }
}
