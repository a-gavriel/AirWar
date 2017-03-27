/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncategorized;

/**
 *
 * @author Alexis
 */
public class ListaDoble {
    
    //private NodoDoble tail;
    private NodoDoble head;
    private int size;
    

    public ListaDoble(){
        
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }
    public void insertFirst(GameObject data){
        if (size != 0)
        {
            NodoDoble newNode = new NodoDoble(data);
            newNode.setNext (head);
            head.getNext().setPrev(newNode);
            head = newNode;
            size++;
        }
        else
        {
            NodoDoble newNode = new NodoDoble(data);
            head = newNode;
            size++;
        }
    }
    
    public NodoDoble TakeFirst(){
        if (size > 1){
            NodoDoble temp = head;
            head.getNext().setPrev(null);
            head = head.getNext();
            size--;
            return temp;
        }
        if (size == 1)
        {
            NodoDoble temp = head;
            head = null;
            size--;
            return temp;
        }
        else{
            return null;
        }
        
    }
    
    
}