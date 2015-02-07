/**
 * Class for branching on not zero
 * 
 * @author IAN
 *
 */
public class BnzInstruction extends Instruction {

	private int register;
	private String instruction;
	
	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, int result, String statement) {
		this(label, "bnz");
		this.register = result;
		this.instruction = statement;
	}
	
	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(register);
		if (value1 != 0) {
			m.setPc(m.getLabels().indexOf(instruction));
		}
	}

	@Override
	public String toString() {
		return super.toString() + " if contents of register " + register + " are not zero, branching " +
									"to statement labelled " + instruction;
	}
}
