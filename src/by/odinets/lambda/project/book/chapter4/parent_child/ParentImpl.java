package by.odinets.lambda.project.book.chapter4.parent_child;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParentImpl implements Parent {

	public String body;
	
	@Override
	public void message(String body) {
		System.out.println("ParentImpl :: message() :: ");
		this.body = body;
	}
	
	@Override
	public String getLastMessage() {
		return body;
	}
	
	@Test
	public void parentDefaultUsed() {
		System.out.println("ParentImpl :: parentDefaultUsed() :: ");
		Parent parent = new ParentImpl();
		parent.welcome();
		assertEquals("Parent :: welcome :: Hi!", parent.getLastMessage());
	}
}
