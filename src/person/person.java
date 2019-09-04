/**
 * 
 */

package person;

import java.math.*;
/**
 * @author pravish
 *
 */
public class person {

	
	/** attributes **/
	private String nid;
	private String firstname; 
	private String lastname;
	private String dob;
	private double height;
	private double weight;
	private char gender;
	
	
	
	/** constructor **/
	public person() {
		this.nid=null;
		this.firstname=null;
		this.lastname=null;
		this.dob=null;
		this.gender ='_';
		this.height=0.0;
		this.weight=0.0;
		
	}
		 
		 
		/**
		 * 
		 * @param dob
		 * @param weight
		 * @return 
		 */
		
		public person(String dob,double weight) {
			this.dob =dob;
			this.weight =weight;
			
			this.nid=null;
			this.firstname=null;
			this.lastname=null;
			this.gender='_';
			this.height=0.0;
	
}
	
		
		public person(String nid, String firstname, String lastname, String dob,double height,double weight,char gender ) {
		this.nid = nid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		
}
	
		public String getname() {
			return this.firstname + " " + this.lastname;
		}
		
		public double calculatebmi(double height, double weight) {
			return (weight/(Math.pow(height, weight)));
		}
		
		public double calculatebmi() {
		 return(this.weight/(Math.pow(this.height,2)));
		}
		
		public String getnid() {
			return this.nid;
		}
		
		public String getfirstname() {
			return this.firstname;
		}
		
		public String getlastname() {
			return this.lastname;
		}
		
		public String getdob() {
			return this.dob;
		}
		
		public double getheight() {
			return this.height;
		}
		
		public double getweight() {
			return this.weight;
		}
		
		public char getgender() {
			return this.gender;
		}
			
		
		
		public void setnid(String nid) {
			this.nid = nid;
		}
		
		public void setfirstname(String firstname) {
			this.firstname = firstname;
		}
		
		public void setlastname(String lastname) {
			this.lastname = lastname;
		}
		
		public void setdob(String dob) {
			this.dob = dob;
		}
		
		public void setheight(double height) {
			this.height = height;
		}
		
		public void setweight(double weight) {
			this.weight = weight;
		}
		
		public void setgender(char gender) {
			this.gender = gender;
		}
		
		public String toString(){
			return (this.nid+" "+this.firstname+" "+this.lastname+" "+this.dob+" "+" "+this.height+" "+this.weight+" "+this.gender);
		}


	
		}
		
		
