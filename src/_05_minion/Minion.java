package _05_minion;

public class Minion {

	

		private String name; 
		private int eyes; 
		private String color; 
		private String master;

 public Minion(String name, int eyes, String color, String master) {
	 this.name=name;
	 this.eyes=eyes;
	 this.color=color;
	 this.master=master;
			// TODO Auto-generated constructor stub
		}

 


public void setMaster(String master) {
	this.master=master;
	
	// TODO Auto-generated method stub
	
}

public String getMaster() {
	// TODO Auto-generated method stub
	return master;
	
}
public void setEyes(int eyes) {
	this.eyes=eyes;
	
}
public int getEyes() {
	// TODO Auto-generated method stub
	return eyes;
}
public void setName(String name) {
	this.name=name;
	
}
public String getName() {
	// TODO Auto-generated method stub
	return name;
}
public void setColor(String color) {
	this.color=color;
			
}
public String getColor() {
	// TODO Auto-generated method stub
	return color;
}
	}

