public class PizzaTestDrive {
 
	public static void main(String args[]) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Rita ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Lerrisa ordered a " + pizza.getName() + "\n");

		

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Shivani ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Pranali ordered a " + pizza.getName() + "\n");
	}
}