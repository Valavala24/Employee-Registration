/**
 *   File Name: Person.java<br>
 *
 *   Panchuk, Valentina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aug 18, 2016
 *   
 */

package com.sqa.pv;

/**
 * Person //ADDD (description of class)
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
public class Person {

	private String name;
	private String jobTitle;
	private int age;
	private String address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle
	 *            the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param name
	 * @param jobTitle
	 * @param age
	 * @param address
	 */
	public Person(String name, String jobTitle, int age, String address) {
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
		this.address = address;

	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + ", address=" + address + "]";
	}

	public void doWork() {
		System.out.println(this.name + " works!");
	}

	public void sleep() {
		System.out.println(this.name + " sleep!");
	}

	public void move() {
		System.out.println(this.name + " move!");
	}
}
