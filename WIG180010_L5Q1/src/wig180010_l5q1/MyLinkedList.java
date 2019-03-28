
package wig180010_l5q1;


public class MyLinkedList<E> {
     private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    
    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }
    
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail==null){
            tail = head;
        } 
    }
    
    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        if(tail==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void add(int index, E e){
        Node<E> newNode = new Node<>(e);
        if(index==0)
            addFirst(e);
        else if(index>=size)
            addLast(e);
        else{
            Node<E> current = head;
            for(int i=1; i<index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = newNode;
            (current.next).next = temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size==0) return null;
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head==null) tail = null;
            return temp.element;
        }
    }
    
    public E removeLast(){
        if(size==0) return null;
        else if(size==1){
           Node<E> temp = head;
           head = tail = null;
           size--;
           return temp.element;
        }
        else{
            Node<E> current = head;
            for(int i=1; i<size-1; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
       }
   }
   
    public E remove(int index){
        if(index<0 || index>=size) return null;
        else if(index==0) return removeFirst();
        else if(index==size-1) return removeLast();
        else{
            Node<E> previous = head;
            for(int i=1; i<index; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    public void add(E e){
        Node<E> newNode = new Node<>(e);
        if(size==0){
            head = tail = newNode;
            size++;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
            size++;
        }
    }
    
    public boolean contains(E e){
        boolean found = false;
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                found = true;
            }
            current = current.next;
        }
        return found;
    }
    
    public E get(int index){
        Node<E> current = head;
        for(int i=0; i<index; i++){
            current = current.next;
        }
        return current.element;
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    public int indexOf(E e){
        int index = -1;
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                index = i;
                break;
            }
            current = current.next;
        }
        return index;
    }
    
    public int lastIndexOf(E e){
        int index = -1;
        Node<E> current = head;
        E [] temp = (E[]) new Object[size];
        for(int i=0; i<size; i++){
            temp[i] = current.element;
            current = current.next;
        }
        for(int i=size-1; i>=0; i--){
            if(temp[i].equals(e)){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public E set(int index, E e){
        if(index<0 || index>=size){
            return null;
        }
        else if(index == 0){
            head.element = e;
            return head.element;
        }
        else if(index == size-1){
            tail.element = e;
            return tail.element;
        }
        else{
            Node<E> current = head;
            for(int i=0; i<index; i++){
                current = current.next;
            }
            E tmp = tail.element;
            current.element = e;
            return tmp;
        }
    }
    
    public void clear(){
        size = 0;
        head = tail = null;
    }
    
    public void print(){
        Node<E> current = head;
        E [] temp = (E[]) new Object[size];
        for(int i=0; i<size; i++){
            temp[i] = current.element;
            current = current.next;
        }
        for(int i=0; i<size; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    
    public void reverse(){
        Node<E> current = head;
        E [] temp = (E[]) new Object[size];
        for(int i=0; i<size; i++){
            temp[i] = current.element;
            current = current.next;
        }
        for(int i=size-1; i>=0; i--){
            System.out.print(temp[i]+" ");
        }
        System.out.println("");
    }
    
    public E getMiddleValue(){
        int middle = size/2;
        Node<E> current = head;
        for(int i=0; i<middle; i++){
            current = current.next;
        }
        return current.element;
}
}
