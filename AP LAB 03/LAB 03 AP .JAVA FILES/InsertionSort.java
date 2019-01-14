
package javaapplication1;

public class InsertionSort implements SortingAlgorithm
{
    public void sort(Object[] items) { 
                int j;
                for (int p = 1; p < items.length; p++) { 
                        Object temp = items[p];

                        for (j = p; j > 0; j--)
                            if( ((Comparable) items[j]).compareTo(items[p]) < 0)
                                items[j] = items[j-1];
                                
                        items[j] = temp; 
                } 
}

}