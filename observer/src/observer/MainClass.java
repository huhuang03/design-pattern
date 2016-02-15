package observer;

import java.util.Observable;
import java.util.Observer;

public class MainClass {
	public static void main(String[] args) {
		//被观察者
		WeatherObservable weatherObservable = new WeatherObservable();

		//观察者1
		Observer weatherObserver1 = new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("Observer1 templature change, current templature: " + arg);
			}
		};
		
		//观察者2
		Observer weatherObserver2 = new Observer() {
			
			@Override
			public void update(Observable o, Object arg) {
				System.out.println("Observer2 templature change, current templature: " + arg);
			}
		};
		
		//添加观察者
		weatherObservable.addObserver(weatherObserver1);
		weatherObservable.addObserver(weatherObserver2);
		
		//设置变化，会通知观察者
		weatherObservable.setTemperature(100.0f);
	}
}
