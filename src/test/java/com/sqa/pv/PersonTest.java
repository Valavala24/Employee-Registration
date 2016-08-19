/**
 *   File Name: PersonTest.java<br>
 *
 *   Panchuk, Valentina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aug 18, 2016
 *   
 */

package com.sqa.pv;

import org.junit.*;

public class PersonTest {

	@Test

	public void testPersonCreation() {
		// Create Person object and store inside "person" named variable
		Person person = new Person();
		// Display person content by call the toString method on the object
		System.out.println(person.toString());

	}

}
