import java.util.HashMap;

public class Entity {
	HashMap<Integer, String> entities;
	int mykey = 0;
	java.util.Scanner in = new java.util.Scanner(System.in);

	public Entity() {
    	entities = new HashMap<Integer, String>();
  	}


	public void readAll() {
		System.out.println("The entities:");
		System.out.println(entities);
	}

	public void create() {
		System.out.println(">>Please enter the name");
		String name = in.next();
		entities.put(mykey++, name);
	}

	public void update() {
		System.out.println(">>Please enter the key");
		int key = in.nextInt();
		if(entities.get(key) == null){
			System.out.println("The entity doesn't exist.");
			return;
		}
		System.out.println("Updating the entity " + entities.get(key));
		System.out.println(">>Please enter the new name");
		String name = in.next();
		entities.put(key, name);
	}

	public void delete() {
		System.out.println(">>Please enter the key");
		int key = in.nextInt();
		if(entities.get(key) == null){
			System.out.println("The entity doesn't exist.");
			return;
		}
		System.out.println("The entity " + entities.get(key) + " has been deleted.");
		entities.remove(key);
	}
}

