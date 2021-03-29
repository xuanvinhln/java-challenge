package challenge.design_patterns.behavioral_patterns.mediator.armed_ex;

public interface Commander {
	void registerArmedUnits(ArmedUnit soldierUnit, ArmedUnit tankUnit);

	void setAttackStatus(boolean attackStatus);

	boolean canAttack();

	void startAttack(ArmedUnit armedUnit);

	void ceaseAttack(ArmedUnit armedUnit);
}