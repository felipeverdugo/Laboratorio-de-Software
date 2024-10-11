
public enum Direcciones {


	
	LEFT(-1,0), 
	RIGTH(1,0),  
	UP(0,-1), 
	DOWN(0,1), 
	STAY(0,0);
	
	public int x;
	public int y;
	

	
	
	 Direcciones(int deltaX, int deltaY) {
		this.x = deltaX;
		this.y = deltaY;
	}

	
	
	
	
	
	
}
