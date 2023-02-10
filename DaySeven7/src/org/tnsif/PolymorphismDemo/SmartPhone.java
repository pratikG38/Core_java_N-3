package org.tnsif.PolymorphismDemo;
// the example of method overloading 
public class SmartPhone {
	// Method 
	private int resolution;
	private String slottype;
	 void display (int resolution) {
		 System.out.println(" Camera MegaPixels are : " +resolution);
		 
	 }
	 void display ( int resolution , String slottype ) {
		 System.out.println(" Camera MegaPixels are : " +resolution +" The slot type is " +slottype);
	 }
	public int getResolution() {
		return resolution;
	}
	public void setResolution(int resolution) {
		this.resolution = resolution;
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}

}
