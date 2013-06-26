
public class HelloWorldCommand implements Command {

	private HelloWorldSubject subject;
	
	public HelloWorldCommand(Subject subject) {
		super();
	
		this.subject = (HelloWorldSubject)subject;
	}
	
	public void execute() {
		subject.setStr("hello world");
	}

}
