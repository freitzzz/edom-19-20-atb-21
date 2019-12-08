
package domain;

/**
 * @generated NOT
 */
public class FFactory {

	private static Factory instance=null;

	public static Factory getInstance() {
		if (instance==null) {
			instance=new FactoryImpl();
		}
		return instance;
	}
}
