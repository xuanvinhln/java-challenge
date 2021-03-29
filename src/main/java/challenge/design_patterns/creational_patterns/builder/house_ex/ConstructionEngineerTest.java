package challenge.design_patterns.creational_patterns.builder.house_ex;

import challenge.design_patterns.creational_patterns.builder.house_ex.builder.ConcreteHouseBuilder;
import challenge.design_patterns.creational_patterns.builder.house_ex.builder.HouseBuilder;
import challenge.design_patterns.creational_patterns.builder.house_ex.builder.PrefabricatedHouseBuilder;
import challenge.design_patterns.creational_patterns.builder.house_ex.director.ConstructionEngineer;

/*
 * Product (House): A class that represents the product to create.
 * 
 * Builder (HouseBuilder): Is an interface to build the parts of a product.
 * 
 * ConcreteBuilder(ConcreteHouseBuilder and PrefabricatedHouseBuilder): Are concrete classes that implement
 *  Builder to construct and assemble parts of the product and return the finished product.
 * 
 * Director (ConstructionEngineer): A class that directs a builder to perform the steps in the order that is required to build the product.
 * 
 * While abstract factory emphasizes on creating a family of related objects in one go, builder is about creating an object
 *  through a step-by-step construction process and returning the object as the final step. In short abstract factory is
 *  concerned with what is made, while the builder with how it is made
 */

public class ConstructionEngineerTest {
	public static void main(String[] args) {
		HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
		ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
		House houseA = engineerA.constructHouse();
		System.out.println("House is: " + houseA);

		PrefabricatedHouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
		ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
		House houseB = engineerB.constructHouse();
		System.out.println("House is: " + houseB);
	}
}
