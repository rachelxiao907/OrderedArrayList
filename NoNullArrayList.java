import java.util.*;
import java.io.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    return super.add(element);
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot add null");
    }
    super.add(index, element);
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Cannot set value to null");
    }
    return super.set(index, element);
  }

}
