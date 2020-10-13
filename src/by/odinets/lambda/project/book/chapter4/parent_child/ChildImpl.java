package by.odinets.lambda.project.book.chapter4.parent_child;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ChildImpl extends ParentImpl implements Child{

	@Test
	public void childOverrideDefault() {
		System.out.println("ChildImpl :: childOverrideDefault()");
		Child child = new ChildImpl();
		child.welcome();
		assertEquals("Child :: welcome :: Hi!", child.getLastMessage());		
	}
}
