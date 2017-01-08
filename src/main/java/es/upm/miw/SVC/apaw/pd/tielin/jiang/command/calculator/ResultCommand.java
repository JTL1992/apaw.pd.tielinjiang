package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

public class ResultCommand extends CalculateCommand {

	public ResultCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String getCommandName() {
		return "result";
	}

	@Override
	public void execute() {
		io.println(" = "+calculator.getTotal());
	}

}
