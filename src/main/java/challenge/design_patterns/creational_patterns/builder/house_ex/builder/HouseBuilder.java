package challenge.design_patterns.creational_patterns.builder.house_ex.builder;

import challenge.design_patterns.creational_patterns.builder.house_ex.House;

public interface HouseBuilder {
	void buildFoundation();

	void buildStructure();

	void buildRoof();

	void paintHouse();

	void furnishHouse();

	House getHouse();
}