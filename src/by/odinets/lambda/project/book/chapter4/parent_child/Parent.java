package by.odinets.lambda.project.book.chapter4.parent_child;

public interface Parent {

	public void message(String body);
	
	public String getLastMessage();
	
	public default void welcome() {
		message("Parent :: welcome :: Hi!");
	}
}
