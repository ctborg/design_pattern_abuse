
public class FactoryMakerSingleton {
	
	private static FactoryMakerSingleton instance = null;
	private AbstractFactory factory;

	private FactoryMakerSingleton() {
		factory = new HelloWorldFactory();
	}
	
	public static synchronized FactoryMakerSingleton getInstance() {
		if (instance == null) {
			instance = new FactoryMakerSingleton();
		}
		
		return instance;
	}

	public AbstractFactory getFactory() {
		return factory;
	}
}
