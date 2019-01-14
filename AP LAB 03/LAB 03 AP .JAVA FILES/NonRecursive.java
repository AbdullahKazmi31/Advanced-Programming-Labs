
package javaapplication1;

/**
 *
 * @author mkazmi.bscs16seecs
 */
public class NonRecursive extends SortFactory{
     public SortingAlgorithm getAlgorithm(){
            if(algorithm.equals("Selection")){
                System.out.println("The algorithm is implemented by Selection Sort: ");
                return new SelectionSort();
            }
            else{
                System.out.println("The algorithm is implemented by Insertion Sort: ");
                return new InsertionSort();
            }
       }
    
}
