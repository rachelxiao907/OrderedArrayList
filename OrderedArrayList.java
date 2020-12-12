import java.util.*;
import java.io.*;
//An OrderedArrayList is an ArrayList that maintains all elements in order
//from least to greatest. It is important to realize that this requires
//that the type is Comparable it would also require that there are no
//null values, which is why it will extend the NoNullArrayList.
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    int old = super.size();
    super.add(index(element), element);
    return super.size() == old + 1;
  }

  private int index(T element) {
    int index = super.size() - 1;
    if (super.size() == 0) {
      index = 0;
    }
    for (int i = 0; i < super.size()-1; i++) {
      if (element.compareTo(super.get(i)) <= 0 && element.compareTo(super.get(i+1)) >= 0) {
        index = i;
      }
    }
    return index;
  }

}
