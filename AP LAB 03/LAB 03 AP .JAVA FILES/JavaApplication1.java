
package javaapplication1;

/**
 *
 * @author mkazmi.bscs16seecs
 */
public class JavaApplication1 {

    public static void main(String[] args) {
               // The elements to be sorted
       String[] elements = {"beta", "chi", "alpha", "zeta", "nu", "mu"};

        // The factory -- creates non-recursive sorting algorithms
        SortFactory factory = new NonRecursive();

        // set the factory to selection sorts
        factory.setFactory("Insertion");
        
        // Get the sorting algorithm from the factory
        SortingAlgorithm algorithm = factory.getAlgorithm();
        
        // apply the algorithm
        algorithm.sort(elements);
        
        for (int i = 0; i < elements.length; i++)
            System.out.println(elements[i]);

    }
    
}
