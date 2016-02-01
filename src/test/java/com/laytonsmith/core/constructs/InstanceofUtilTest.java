package com.laytonsmith.core.constructs;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 */
public class InstanceofUtilTest {

	@Test
	public void testInstanceofUtil() throws ClassNotFoundException{
		assertTrue(InstanceofUtil.isInstanceof(new CInt(0, Target.UNKNOWN), "int"));
		assertTrue(InstanceofUtil.isInstanceof(new CInt(0, Target.UNKNOWN), "number"));
		assertTrue(InstanceofUtil.isInstanceof(new CInt(0, Target.UNKNOWN), "mixed"));
		assertFalse(InstanceofUtil.isInstanceof(new CInt(0, Target.UNKNOWN), "string"));
	}
}
