package ro.ase.acs.interfaces;

@FunctionalInterface
public interface BinaryOperator {
	public double operate(double operand1, double operand2);
}
