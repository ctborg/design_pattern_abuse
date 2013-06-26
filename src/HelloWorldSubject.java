import java.util.ArrayList;
import java.util.Iterator;

public class HelloWorldSubject implements Subject {
	
	private ArrayList<Observer> observers;
	private String str;
	
	public HelloWorldSubject() {
		super();

		observers = new ArrayList<Observer>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> iter = observers.iterator();
		
		while (iter.hasNext()) {
			Observer observer = iter.next();
			observer.update(this);
		}
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
		notifyObservers();
	}
}
