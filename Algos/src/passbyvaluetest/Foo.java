package passbyvaluetest;

public class Foo {
	private int attribute;

	public Foo(int a) {
		this.attribute = a;
	}

	public int getAttribute() {
		return attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}
}