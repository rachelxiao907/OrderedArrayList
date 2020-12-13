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
    super.add(index(element), element);
    return true;
  }

  private int index(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    int index = 0;
    //loop through elements and stop when element doesn't precede current index anymore
    while(index < size() && element.compareTo(get(index)) > 0) {
      index++;
    }
    return index;
  }

  public void add(int index, T element) {
    super.add(index(element), element);
  }

  public T set(int index, T element) {
    T replaced = get(index);
    if (element == null) {
      throw new IllegalArgumentException("Cannot set to null");
    }
    super.remove(index);
    super.add(index(element), element);
    return replaced;
  }

}
