package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

import upm.jbb.IO;

public abstract class CalculateCommand implements Command {

	protected Calculator calculator;

	protected IO io = IO.getIO();

	public CalculateCommand(Calculator calculator) {
		this.calculator = calculator;
	}

}
