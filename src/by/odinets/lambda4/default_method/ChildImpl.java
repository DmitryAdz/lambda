package by.odinets.lambda4.default_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChildImpl implements Child {

	public String body;
	
	public void message(String body) {
		System.out.println("Child :: message(String body) :: body :: " + body);
		this.body = body;
	}
	
	public String getLastMessage() {
		System.out.println("Child :: getLastMessage() :: body :: " + body);
		return body;
	}
	
	@Test
	public void childOverrideDefault() {
		System.out.println("Child :: childOverrideDefault() :: body :: " + body);
		Child child = new ChildImpl();
		child.welcome();
		assertEquals("Child: Hi!", child.getLastMessage());
		//assertEquals("Child: Hi GITLER!", child.getLastMessage());
	}
}
