package challenge.design_patterns.structural_patterns.flyweight.game_ex;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GameApp {
	private static List<ISoldier> soldiers = new ArrayList<>();

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		GameApp.createSoldier(5, "Yuri", 1);
		GameApp.createSoldier(5, "Spy", 1);
		GameApp.createSoldier(3, "Spy", 3);
		GameApp.createSoldier(2, "Yuri", 2);
		long endTime = System.currentTimeMillis();
		
		System.out.println("---");
		System.out.println("Total soldiers made : " + soldiers.size());
		System.out.println("Total time worked : " + Duration.ofMillis(endTime - startTime).getSeconds() + " seconds");
		System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
	}

	private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
		for (int i = 1; i <= numberOfSoldier; i++) {
			Context star = new Context("Soldier" + (soldiers.size() + 1), numberOfStar);
			ISoldier soldier = SoldierFactory.createSoldier(soldierName);
			
			soldier.promote(star);
			soldiers.add(soldier);
		}
	}
}
