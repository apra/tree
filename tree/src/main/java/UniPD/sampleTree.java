package UniPD;

import java.util.Iterator;


public class sampleTree{
    
    public static void main(String[] args){
        LinkedBinaryTree<Integer> prova = new LinkedBinaryTree<Integer>();

        prova.addRoot(4);

        System.out.println(prova.size());

        System.out.println(prova.root().getElement());
        int[] arr =new int[]{4,5,6,7,8,9,10,11,12,13};
        Integer[] array = new Integer[arr.length];
        int i = 0;
        for (int value : arr) {
            array[i++] = Integer.valueOf(value);
        }
        prova.importa(array);

        System.out.println(prova.size());
        System.out.println(prova.root().getElement());
        System.out.println(prova.left(prova.root()));

        Iterable<Position<Integer>> iter = prova.positions();
        Iterator<Position<Integer>> iterator = iter.iterator();
        while(iterator.hasNext()){
            Position<Integer> node = iterator.next();
            System.out.println(node.getElement());
        }
        
        System.out.println("finished broadcast");

    }

}