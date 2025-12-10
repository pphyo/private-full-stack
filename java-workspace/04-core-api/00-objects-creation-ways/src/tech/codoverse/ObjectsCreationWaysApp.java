package tech.codoverse;

public class ObjectsCreationWaysApp {

	@SuppressWarnings("deprecation")
	void main() {
		try {
			var withNewKeyword = new Player();
			IO.println("With new keyword: " + withNewKeyword);

			Object forName = Class.forName("tech.codoverse.Player").newInstance();
			IO.println("With Class.forName: " + forName);

			// Class<>
			var newInstance = Player.class.newInstance();
			IO.println("With newInstance: " + newInstance);

			var withConstructor = withNewKeyword.getClass()
					.getDeclaredConstructor(int.class, String.class)
					.newInstance(10, "Bernando Silva");
			IO.println("With constructor: " + withConstructor);

			var playerClone = withNewKeyword.clone();
			IO.println("With clone: " + playerClone);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
