
public class HelloWorldObserver implements Observer {

	public void update(Subject subject) {
		HelloWorldSubject sub = (HelloWorldSubject)subject;
		System.out.println(sub.getStr());
	}

}
