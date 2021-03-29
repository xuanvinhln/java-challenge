package challenge.design_patterns.behavioral_patterns.iterator.list_ex;

public class Client {
	public static void main(String[] args) {
		AbstractList<String> list = new SkipListImpl<String>("something");
		Iterator<String> iter = list.createIterator();

		while (!iter.isDone()) {
			System.out.println(iter.currentItem());
			iter.next();
		}
	}
}
