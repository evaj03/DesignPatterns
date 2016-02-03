package pattern.factory.before;

public class Pizza {

	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void prepare() {
		System.out.println("Preparing " + name + " pizza");
	}
	
	
	public void bake() {
		System.out.println("Baking " + name + " pizza");
	}
	
	
	public void cut() {
		System.out.println("Cutting " + name + " pizza");
	}
	
	
	public void box() {
		System.out.println("Boxing " + name + " pizza");
	}
}
