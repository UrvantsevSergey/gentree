import java.util.Iterator;
import java.util.List;

class HumanIterator implements Iterator<Human> {
    private int curIdx;
    private List<Human> famtree;

    public HumanIterator(List<Human> famtree) {
        this.famtree = famtree;
    }

    @Override
    public boolean hasNext() {
        return famtree.size() > curIdx;
    }

    @Override
    public Human next() {
        return famtree.get(curIdx++);
    }
}