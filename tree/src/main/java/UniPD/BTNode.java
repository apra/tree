package UniPD;

public class BTNode<E> implements BTPosition<E> {

    private E element;
    private BTPosition<E> left, right, parent;

    public BTNode(E element, BTPosition<E> parent, BTPosition<E> left, BTPosition<E> right) {
        setElement(element);
        setRight(right);
        setLeft(left);
        setParent(parent);
    }
    public E getElement() { return element;}
    public void setElement(E e){
        element = e;
    }
    public BTPosition<E> getRight(){
        return right;
    }
    public void setRight(BTPosition<E> r){
        right = r;
    }
    public BTPosition<E> getLeft(){
        return left;
    }
    public void setLeft(BTPosition<E> r){
        left = r;
    }
    public BTPosition<E> getParent(){
        return parent;
    }
    public void setParent(BTPosition<E> r){
        parent = r;
    }


}