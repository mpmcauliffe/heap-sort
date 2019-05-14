package algorithms;

public class Main {

    public static void main(String[] args) {
        System.out.print("\n\n");

    /**
     *  TESTING
     **/
        // instantiate
        Heap heap = new Heap(10);

        // insert
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        // print
        heap.printHeap();

        // delete
        heap.delete(1);
        heap.printHeap();

        heap.delete(5);
        heap.printHeap();

        heap.delete(0);
        heap.printHeap();

        // peek
        System.out.println(heap.peek());
        System.out.print("\n");

        /** SORT **/
        System.out.println("SORTING");
        heap.sort();
        heap.printHeap();

        System.out.println("Inserting 76 23 90 11 1");
        heap.insert(76);
        heap.insert(23);
        heap.insert(90);
        heap.insert(11);
        heap.insert(1);
        heap.printHeap();

        System.out.println("SORTING");
        heap.sort();
        heap.printHeap();


        System.out.print("\n\n");
    }
}
