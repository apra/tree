package UniPD;
import java.util.Iterator;
/**
 * Interface of a tree, defined as an empty collection or
 * a collection of nodes which have these properties:
 *  - there is a special node named r which is the root
 *    of the Tree
 *  - for each node v different from the root, v has a father
 *  - for each node v different from the root, you can reach 
 *    the root by going from father to father
 * 
 * @author Samuele Papa
 * @version 0.1a
 * @since 1.8
 */
public interface Tree<E> extends Iterable<E>{
    Position<E> root();
    Position<E> parent(Position<E> p) throws IllegalArgumentException;
    Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;

    int numChildren(Position<E> p) throws IllegalArgumentException;
    boolean isInternal(Position<E> p) throws IllegalArgumentException;
    boolean isExternal(Position<E> p) throws IllegalArgumentException;
    boolean isRoot(Position<E> p) throws IllegalArgumentException;
    int size();
    boolean isEmpty();
    Iterator<E> itarator();
    /**
    * A list of each node in the Tree
    */
    Iterable<Position<E>> positions();

}