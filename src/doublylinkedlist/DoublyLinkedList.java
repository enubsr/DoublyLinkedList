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
public class DoublyLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DNode<String> node1 = new DNode(null, "node1", null);
        DNode<String> node2 = new DNode(null, "node2", null);
        DNode<String> node3= new DNode(null, "node3", null);
        
        DList<DNode> list = new DList<>();
        list.addFirst(node1);
        list.addFirst(node2);
        list.addLast(node3);
        
        System.out.println("Before Remove");
        list.showList();
        
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + list.removeFirst().getElement());
        list.showList();
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + list.removeLast().getElement());
        list.showList();
        
    }
    
}
