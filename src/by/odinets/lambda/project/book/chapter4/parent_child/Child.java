package by.odinets.lambda.project.book.chapter4.parent_child;

public interface Child extends Parent{

	@Override
	public default void welcome() {
		message("Child :: welcome :: Hi!");
	}
}
