package com.elsevier.education;

/**

TODO: Make this class immutable.

*/
//Class need to be final to avoid inheritance.
public final class Exercise1 {

	public static class Person {
		// class properties need to be final 
		private final Set<String> phoneNumbers;
		private final  String firstName;
		private final String lastName;
		// initializing class properties through constructor.
		public Person(Set<String> phoneNumbers,String lastName,String firstName) {

			this.phoneNumbers =phoneNumbers;
			this.lastName =lastName;
			this.firstName =firstName;
		}
// no setters for class properties to avoid modifications.
		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
				
		public String getFirstName() {
			return firstName;
		}
			
		public String getLastName() {
			return lastName;
		}
		
}
