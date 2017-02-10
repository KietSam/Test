import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

  public static void main(String[] args) {
    TreeSet<String> test = new TreeSet<>();
    test.add("a");
    test.add("b");
    test.add("c");
    test.add("A");
    test.add("B");
    test.add("C");
    System.out.println(test.toString());
  }
  
  public static void testSortedAssertion() {
    String[] test = {"a", "b", "c", "d"};
    boolean sorted = true;
    for (int i = 0; i < test.length - 1; i++) {
      assert(test[i].compareTo(test[i + 1]) <= 0);
    }
  }
  
  public static void testTreeSetOrdering() {
    TreeMap<String, String> testy = new TreeMap<>();
    testy.put("dan", "a");
    testy.put("app", "b");
    testy.put("bad", "c");
    testy.put("cat", "d");
    testy.put("kin", "e");
    testy.put("man", "f");
    Set<String> keys = testy.keySet();
    for (String a : keys) {
      System.out.println(a);
    }
    System.out.println();
    Set<Entry<String, String>> entries = testy.entrySet();
    Iterator<Entry<String, String>> itr = entries.iterator();
    while (itr.hasNext()) {
      Entry<String, String> a = itr.next();
      System.out.println(a.getKey() + " " + a.getValue());
    }
  }
  
  public void testListIteratorRepExposure() {
    List<Integer> test = new ArrayList<>();
    test.add(1);
    test.add(2);
    test.add(3);
    test.add(4);
    test.add(5);
    System.out.println(test.toString());
    Iterator<Integer> itr = test.iterator();
    while(itr.hasNext()) {
      Integer a = itr.next();
      a += 1;
    }
    System.out.println(test.toString());
  }

}
