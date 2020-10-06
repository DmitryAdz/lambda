package by.odinets.lambda4.default_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverridingChildImpl extends OverridingParentImpl implements Child{
	
	@Test
	public void concreteBeatsCloserDefault() {
		System.out.println("OverridingChildImpl :: concreteBeatsCloserDefault() :: body :: " + body);
		Child child = new OverridingChildImpl();
		child.welcome();
		assertEquals("OverridingParentImpl: Parent: Hi!", child.getLastMessage());
	}

}
