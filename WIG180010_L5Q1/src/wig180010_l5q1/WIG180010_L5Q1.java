
package wig180010_l5q1;


public class WIG180010_L5Q1 {

    
    public static void main(String[] args) {
        MyLinkedList<String> linkList = new MyLinkedList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        linkList.add("d");
        linkList.add("e");
        System.out.print("All elements: ");
        linkList.print();
        System.out.print("Reverse Order: ");
        linkList.reverse();
        System.out.println("Number of elements: "+linkList.getSize());
        System.out.println("First Value: "+linkList.getFirst());
        System.out.println("Last Value: "+linkList.getLast());
        linkList.remove(2);
        System.out.print("Removed value at index==2: ");
        linkList.print();
        System.out.println("Index location for b: "+linkList.indexOf("b"));
        System.out.println("Index location for d: "+linkList.indexOf("d"));
        System.out.println("Is the list contains c? "+linkList.contains("c"));
        linkList.set(0,"h");
        linkList.set(1,"e");
        linkList.set(2,"l");
        linkList.set(3,"l");
        linkList.add("o");
        System.out.print("New List: ");
        linkList.print();
        System.out.println("Middle element: "+linkList.getMiddleValue());
    }
    
}
