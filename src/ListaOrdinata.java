public class ListaOrdinata <T extends Comparable<T>> extends Lista {
    public void add(T newValue) {
        if (len >= size) {
            // il nostro array è sold-out
            Nodo<T> newNodo = new Nodo<T>(newValue);    
            if (root == null) {
                root = newNodo; return;
            } else {
                Nodo<T> current = root;
                Nodo<T> previous = null;
                while (current != null && current.getValue().compareTo(newValue) < 0) {
                    previous = current;
                    current = current.getNext();
                }
                if (previous == null) {
                    newNodo.setNext(root);
                    root = newNodo;
                } else {
                    newNodo.setNext(current);
                    previous.setNext(newNodo);
                }
            }
            v = nuovoV;
            size += delta;
        }
        int i = 0;
        while (i < len && ((T) v[i]).compareTo(newValue) < 0) {
            i++;
        }
        for (int j = len; j > i; j--) {
            v[j] = v[j - 1];
        }
        v[i] = newValue;
        len++;
    }

    

}