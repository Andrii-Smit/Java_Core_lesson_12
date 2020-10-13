package task1;

public class Auto {

	private int engineHorsePower;
	private int productionYear;
	private Wheel wheel;
	private Engine engine;

	public Auto(int engineHorsePower, int productionYear, Wheel wheel, Engine engine) {
		this.engineHorsePower = engineHorsePower;
		this.productionYear = productionYear;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getEngineHorsePower() {
		return engineHorsePower;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Auto [engineHorsePower=" + engineHorsePower + ", productionYear=" + productionYear + ", wheelDiameter="
				+ wheel.getWheelDiameter() + ", wheelMaterial=" + wheel.getWheelMaterial() + ", numberOfCylinders="
				+ engine.getNumberOfCylinders() + "]";
	}
}
