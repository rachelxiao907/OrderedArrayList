public class Tester {
  public static void main(String[] args) {
    //Testing NoNullArrayList
    NoNullArrayList<Integer> a = new NoNullArrayList<Integer>();
    System.out.println(a.add(4));
    try {
      a.add(1);
      a.add(null);
      a.add(5);
    } catch (IllegalArgumentException e) {
      System.out.println("bruh no null");
      //e.printStackTrace();
    }
    System.out.println(a);
    System.out.println();

    System.out.println(a.set(0,3));
    try {
      a.set(0,null);
    } catch (IllegalArgumentException e) {
      System.out.println("no set null!!");
      e.printStackTrace();
    }
    System.out.println(a);

    System.out.println();
    NoNullArrayList<Integer> a1 = new NoNullArrayList<Integer>(1);
    try {
      a1.add(0,null);
    } catch (IllegalArgumentException e) {
      System.out.println("bruh no null!!");
      e.printStackTrace();
    }
    a1.add(0,1);
    a1.add(0,2);
    System.out.println(a1);
    System.out.println();
    System.out.println();
    System.out.println("Testing OrderedArrayList");

    OrderedArrayList<Integer> o = new OrderedArrayList<Integer>();
    o.add(1);
    System.out.println(o);
    o.add(4);
    System.out.println(o);
    o.add(-1);
    System.out.println(o);
    o.add(2);
    System.out.println(o);
    o.add(1,3);
    System.out.println(o);
  }
}
