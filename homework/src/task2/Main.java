package task2;

public class Main {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		MyArrayList list5 = new MyArrayList(5);

		System.out.println(list.toString());
		list.add("10");
		list.add("15");
		list.add("17");
		list.add("18");
		list.add("19");
		list.add("25");
		list.add("35");
		list.add("45");
		list.add("55");
		list.add("65");
		System.out.println(list.toString());
		list.add("76");
		System.out.println(list.toString());

		System.out.println(list5.toString());
		list5.remove(4);
		list5.remove(3);
		list5.remove(2);
		list5.remove(1);
		list5.remove(0);
		System.out.println(list5.toString());

		list5 = list;
		System.out.println(list5.toString());

		System.out.println(list5.remove(4));
		System.out.println(list5.toString());

	}

}
