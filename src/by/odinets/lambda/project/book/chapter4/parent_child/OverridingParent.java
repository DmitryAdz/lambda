package by.odinets.lambda.project.book.chapter4.parent_child;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverridingParent extends ParentImpl{

	@Override
	public void welcome() {
		message("Class OverridingParent: Hi!");
	}
	
	@Test
	public void concreteBeatsDefault() {
		System.out.println("OverridingParent :: concreteBeatsDefault()");
		Parent parent = new OverridingParent();
		parent.welcome();
		assertEquals("Class OverridingParent: Hi!", parent.getLastMessage());
	}
}
