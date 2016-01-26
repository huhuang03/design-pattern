package observer;

import java.util.Observable;

public class WeatherObservable extends Observable{
	private float temperature;
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		setChanged();
		notifyObservers(temperature);
	}
	
}
