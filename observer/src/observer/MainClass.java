package observer;

import java.awt.print.Printable;
import java.util.Observable;
import java.util.Observer;

public class MainClass {
	public static void main(String[] args) {
		WeatherObservable weatherObservable = new WeatherObservable();

		Observer weatherObserver1 = new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("Observer1 templature change, current templature: " + arg);
			}
		};
		
		Observer weatherObserver2 = new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("Observer2 templature change, current templature: " + arg);
			}
		};
		
		weatherObservable.addObserver(weatherObserver1);
		weatherObservable.addObserver(weatherObserver2);
		weatherObservable.setTemperature(100.0f);
	}
}
