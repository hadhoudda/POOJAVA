package fr.houda.generic;

public class StartBox {

	public static void main(String[] args) {
		GenericBox<String> box = new GenericBox<>("test");
		System.out.println(box.getElement());
		box.setElement("test 2");
		System.out.println(box.getElement());
	}

}
