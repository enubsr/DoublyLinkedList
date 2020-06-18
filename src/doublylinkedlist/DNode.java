/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author Enubs
 */
public class DNode<E> {
    private DNode prev, next;
    private E element;

    public DNode(DNode prev, E element, DNode next){
        this.prev = prev;
        this.element = element;
        this.next = next;
    }
    
    /**
     * @return the prev
     */
    public DNode getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public DNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(DNode next) {
        this.next = next;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }
    
    
    
}
