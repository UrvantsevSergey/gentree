import java.util.Iterator;
import java.util.List;

class HumanIterator<E> implements Iterator<E> {
    private int curIdx;
    private List<E> famtree;

    public HumanIterator(List<E> famtree) {
        this.famtree = famtree;
    }

    @Override
    public boolean hasNext() {
        return famtree.size() > curIdx;
    }

    @Override
    public E next() {
        return famtree.get(curIdx++);
    }
}