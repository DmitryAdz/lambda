package by.odinets.lambda4.default_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParentImpl implements Parent {
	
	public String body;
	
	public void message(String body) {
		System.out.println("Parent :: message(String body) :: body :: " + body);
		this.body = body;
	}
	
	public String getLastMessage() {
		System.out.println("Parent :: getLastMessage() :: body :: " + body);
		return body;
	}

	@Test
	public void parentDefaultUsed() {
		System.out.println("Parent :: parentDefaultUsed() :: body :: " + body);
		Parent parent = new ParentImpl();
		parent.welcome();
		assertEquals("Parent: Hi!", parent.getLastMessage());
		//assertEquals("Parent: Hi GITLER!", parent.getLastMessage());
	}
}
