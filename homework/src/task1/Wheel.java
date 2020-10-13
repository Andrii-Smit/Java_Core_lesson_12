package task1;

public class Wheel {

	private int wheelDiameter;
	private String wheelMaterial;
		
	public Wheel(int wheelDiameter, String wheelMaterial) {
		this.wheelDiameter = wheelDiameter;
		this.wheelMaterial = wheelMaterial;
	}

	public int getWheelDiameter() {
		return wheelDiameter;
	}

	public String getWheelMaterial() {
		return wheelMaterial;
	}

	@Override
	public String toString() {
		return "Wheel [wheelDiameter=" + wheelDiameter + ", wheelMaterial=" + wheelMaterial + "]";
	}	
}
