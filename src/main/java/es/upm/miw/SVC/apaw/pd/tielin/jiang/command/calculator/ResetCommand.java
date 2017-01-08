package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

public class ResetCommand extends CalculateCommand {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String getCommandName() {
		return "reset";
	}

	@Override
	public void execute() {
		calculator.reset();
		io.clear();
		io.print(0);
	}

}
