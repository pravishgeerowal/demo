/**
 * 
 */
 
package person;

import java.util.Scanner;
/**
 * @author pravish
 *
 */
public class TestPerson {

	/**
	 * @param args
	 * @param input 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String inputnid,inputfirstname,inputlastname,inputdob;
		 double inputheight,inputweight;
		 char inputgender;
		  
		  
		  person p1 = new person();
		  Scanner myScanner = new Scanner(System.in);
		  System.out.println("Enter nid of person 1:");
		  inputnid = myScanner.next();
		  
		  System.out.println("Enter firstname of person 1:");
		  inputfirstname = myScanner.next();
		  
		  System.out.println("Enter lastname of person 1:");
		  inputlastname = myScanner.next();
		  
		  System.out.println("Enter dob of person 1:");
		  inputdob = myScanner.next();
		  
		  System.out.println("Enter height of person 1:");
		  inputheight = myScanner.nextDouble();
		  
		  System.out.println("Enter weight of person 1:");
		  inputweight = myScanner.nextDouble();
		  
		  System.out.println("Enter gender of person 1:");
		  inputgender =myScanner.next().charAt(0);
		  
		  p1.setnid(inputnid);
		  p1.setfirstname(inputfirstname);
		  p1.setlastname(inputlastname);
	      p1.setdob(inputdob);
		  p1.setheight(inputheight);
		  p1.setweight(inputweight);
		  p1.setgender(inputgender);

		  System.out.println("nid of person 1:"+p1.getnid());
		  System.out.println("firstname of person 1:"+p1.getfirstname());
		  System.out.println("lastname of person 1:"+p1.getlastname());
		  System.out.println("dob of person 1:"+p1.getdob());
		  System.out.println("height of person 1:"+p1.getheight());
		  System.out.println("weight of person 1:"+p1.getweight());
		  System.out.println("gender of person 1:"+p1.getgender());
		  
		  System.out.println(p1.toString());
		  
		  
		  
		  
		  System.out.println("Enter dob of person 2:");
		  inputdob = myScanner.next();
		  
		  System.out.println("Enter weight of person 2:");
		  inputweight = myScanner.nextDouble();
		  
		  person p2 = new person(inputdob,inputweight);
		  
		  System.out.println(p2.toString());
		  
		  		  
		  person p3 = new person();
		  System.out.println(p3);
		  
		  
		  
		
		
		  int size =0;
		  System.out.println("number of student present in the class:");
		  size=myScanner.nextInt();
		 
		person[] classroom = new person[size];
			for(int i =0; i<classroom.length; i++) {
				classroom[i]=new person();
				System.out.println("Enter details of person"+(i+1));
				
				System.out.println("Enter nid:");
				inputnid = myScanner.next();
				
				System.out.println("Enter firstname:");
				inputfirstname = myScanner.next();
				
				System.out.println("Enter lastname:");
				inputlastname = myScanner.next();
				
				System.out.println("Enter dob:");
				inputdob = myScanner.next();
				
				System.out.println("Enter gender");
				inputgender = myScanner.next().charAt(0);
				
				System.out.println("Enter weight");
				inputweight = myScanner.nextDouble();
				
				System.out.println("height");
				inputheight = myScanner.nextDouble();
				
				
			classroom[i] = new person(inputnid, inputfirstname, inputlastname, inputdob, inputweight, inputheight, inputgender);
			}  
			  
			 for (int i =0; i<classroom.length; i++) {
				 System.out.println("BMI of person"+ (i+1)+":");
				 double x = classroom[i].calculatebmi();
				 System.out.println(x);
			 }
			  
			  
			  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
