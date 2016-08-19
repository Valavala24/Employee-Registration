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

/**
 * PersonTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PersonTest {

	@Test
	public void test() {
		Person person = new Person("JF", "Teacher", 34, "123 1st St. SF CA");
		System.out.println(person);
		person.sleep();
		person.move();
		person.doWork();
	}

}
