
public interface AbstractFactory {
	public Subject createSubject();
	public Observer createObserver();
	public Command createCommand(Subject subject);
}
