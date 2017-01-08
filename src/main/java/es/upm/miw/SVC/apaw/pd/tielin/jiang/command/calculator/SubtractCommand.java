package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

public class SubtractCommand extends CalculateCommand {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String getCommandName() {
		return "substract";
	}

	@Override
	public void execute() {
	    int value = io.readInt();
		calculator.subtract(value);
		io.print(" - " + value);
	}

}
