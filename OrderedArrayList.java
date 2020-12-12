import java.util.*;
import java.io.*;
//An OrderedArrayList is an ArrayList that maintains all elements in order
//from least to greatest. It is important to realize that this requires
//that the type is Comparable it would also require that there are no
//null values, which is why it will extend the NoNullArrayList.
OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

}
