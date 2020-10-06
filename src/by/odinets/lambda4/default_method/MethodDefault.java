package by.odinets.lambda4.default_method;

import org.junit.Test;

public class MethodDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentImpl parent = new ParentImpl();
		parent.parentDefaultUsed();
		
		ChildImpl child = new ChildImpl();
		child.childOverrideDefault();
		
		OverridingParentImpl overridingParent = new OverridingParentImpl();
		overridingParent.concreteBeatsDefault();
		
		OverridingChildImpl overridingChild = new OverridingChildImpl();
		overridingChild.concreteBeatsCloserDefault();
	}

	
}
