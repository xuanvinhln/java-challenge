package challenge.design_patterns.structural_patterns.decorator.flower_ex;

/*
 * Component (FlowerBouquet): Is an abstract base class that can be decorated with responsibilities dynamically.
 * 
 * ConcreteComponent(RoseBouquet and OrchidBouquet): Are concrete classes that extends Component to represent objects to which additional responsibilities can be attached.
 * 
 * Decorator (FlowerBouquetDecorator): Is an abstract class that extends Component and acts as the base class for concrete decorator classes.
 * 
 * ConcreteDecorator (PapperWrapper, RibbonBow, and Glitter): Are concrete classes that extends Decorator to decorate Components with responsibilities.
 */

public class FlowerBouquetTest {
	public static void main(String[] args) {
		/* Rose bouquet with no decoration */
		FlowerBouquet roseBouquet = new RoseBouquet();
		System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());

		/* Rose bouquet with paper wrapper, ribbon bow, and glitter */
		FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
		decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
		decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
		decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
		System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());

		/* Orchid bouquet with double paper wrapper and ribbon bow */
		FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
		decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
		decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
		decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
		System.out.println(decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
	}
}
