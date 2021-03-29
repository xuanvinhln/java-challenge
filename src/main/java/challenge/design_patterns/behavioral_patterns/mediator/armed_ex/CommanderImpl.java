package challenge.design_patterns.behavioral_patterns.mediator.armed_ex;

public class CommanderImpl implements Commander {
	ArmedUnit soldierUnit;
	ArmedUnit tankUnit;
	boolean attackStatus = true;

	@Override
	public void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit) {
		this.soldierUnit = soldierUnit;
		this.tankUnit = tankUnit;
	}

	@Override
	public void setAttackStatus(boolean attackStatus) {
		this.attackStatus = attackStatus;
	}

	@Override
	public boolean canAttack() {
		return attackStatus;
	}

	@Override
	public void startAttack(ArmedUnit armedUnit) {
		armedUnit.attack();
	}

	@Override
	public void ceaseAttack(ArmedUnit armedUnit) {
		armedUnit.stopAttack();
	}
}