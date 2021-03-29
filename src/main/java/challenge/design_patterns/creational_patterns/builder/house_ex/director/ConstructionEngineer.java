package challenge.design_patterns.creational_patterns.builder.house_ex.director;

import challenge.design_patterns.creational_patterns.builder.house_ex.House;
import challenge.design_patterns.creational_patterns.builder.house_ex.builder.HouseBuilder;

public class ConstructionEngineer {
	private HouseBuilder houseBuilder;

	public ConstructionEngineer(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public House constructHouse() {
		this.houseBuilder.buildFoundation();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.paintHouse();
		this.houseBuilder.furnishHouse();
		return this.houseBuilder.getHouse();
	}
}