package UniPD;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    public Position<E> sibling(Position<E> p){
        Position<E> parent = parent(p);
        if(parent == null) return null;
        if(p == left(parent))
            return right(parent);
        else
            return left(parent);
    }
    public int numChildren(Position<E> p){
        
    }
}