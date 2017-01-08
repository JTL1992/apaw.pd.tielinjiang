package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

public class AddCommand extends CalculateCommand {

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String getCommandName() {
		return "add";
	}

	@Override
	public void execute() {
	    int value = io.readInt();
		calculator.add(value);
		io.print(" + " + value);
	}

}
