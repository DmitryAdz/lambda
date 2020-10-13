package by.odinets.lambda.project.book.chapter4.parent_child;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverridingChild extends OverridingParent implements Child {

	@Test
	public void concreteBeatsCloserDefault() {
		System.out.println("OverridingChild :: concreteBeatsCloserDefault()");
		Child child = new OverridingChild();
		child.welcome();
		assertEquals("Class OverridingParent: Hi!", child.getLastMessage());
	}
}
