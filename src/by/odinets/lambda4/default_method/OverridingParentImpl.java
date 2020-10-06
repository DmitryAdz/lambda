package by.odinets.lambda4.default_method;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OverridingParentImpl extends ParentImpl {

	@Override
	public void welcome() {
		System.out.println("OverridingParentImpl :: welcome() :: ");
		message("OverridingParentImpl: Parent: Hi!");
	}
	
	@Test
	public void concreteBeatsDefault() {
		System.out.println("OverridingParentImpl :: concreteBeatsDefault() :: body :: " + body);
		Parent parent = new OverridingParentImpl();
		parent.welcome();
		assertEquals("OverridingParentImpl: Parent: Hi!", parent.getLastMessage());
		//assertEquals("OverridingParentImpl: Parent: Hi GITLER!", parent.getLastMessage());
	}
}
