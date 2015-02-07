/**
 * Class for printing the contents of a register
 * 
 * @author IAN
 *
 */
public class OutInstruction extends Instruction {

	private int register;
	private int value;
	
	public OutInstruction(String label, String op) {
		super(label, op);
	}
	
	public OutInstruction(String label, int op1) {
		this(label, "out");
		this.register = op1;
	}

	@Override
	public void execute(Machine m) {
		value = m.getRegisters().getRegister(register);
		System.out.println(super.toString() + " value in register " + register + " is " + value);
	}

	@Override
	public String toString() {
		return super.toString() + " print content of register " + register;
	}
}
