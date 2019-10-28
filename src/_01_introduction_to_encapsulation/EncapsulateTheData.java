package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.ItemSelectable;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	
	public static void main(String[] args) {
		//test();
	}
	@Test
	void test() {
		EncapsulateTheData tester = new EncapsulateTheData();
		tester.setItemsReceived(-3);
		assertEquals(0, tester.getItemsReceived());
		
		tester.setdegreesTurned(372);
		assertEquals(360, tester.getdegreesTurned());
		
		tester.setnomenclature("");
		assertEquals(" ", tester.getnomenclature());
		
		Object obj = new Object();
		tester.setmemebrObj("jjj");
		assertEquals(obj, tester.getmemebrObj());
	}
	
	public void setItemsReceived(int itemsReceived) {
		if(itemsReceived < 0) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;
		
	}
	public void setdegreesTurned(float degreesTurned) {
		if(degreesTurned < 0) {
			degreesTurned = 0;
		}
		if(degreesTurned > 360) {
			degreesTurned = 360;
		}
		this.degreesTurned = degreesTurned;
		
	}
	public void setnomenclature(String nomenclature) {
		if(nomenclature.equals("")) {
			nomenclature = " ";
		}
		this.nomenclature = nomenclature;
		
	}
	public void setmemebrObj(Object memberObj) {
		if(memberObj.getClass().isPrimitive()) {
			this.memberObj = memberObj;
		}
		else {
			this.memberObj = new Object();
		}
		
		
	}
	
	
	
	public int getItemsReceived() {
		return itemsReceived;
		
	}
	public float getdegreesTurned() {
		return degreesTurned;
	}
	public String getnomenclature() {
		return nomenclature;
	}
	public Object getmemebrObj() {
		return memberObj;
	}
	
}
