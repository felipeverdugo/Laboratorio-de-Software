
public enum Content {
	W("Wall",1), 
	F("Food",2),  
	E("Empty",3); 
	
	private String name;
	private int value;
	
	
	
	public String getName() {
		return name;
	}



	public int getValue() {
		return value;
	}



	 Content(String name, int value) {
		this.name = name;
		this.value = value;
		
		// TODO Auto-generated constructor stub
	}
}
