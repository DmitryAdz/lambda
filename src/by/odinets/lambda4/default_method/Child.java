package by.odinets.lambda4.default_method;

public interface Child extends Parent {

	@Override
	public default void welcome() {
		message("Child: Hi!");
	}
}
