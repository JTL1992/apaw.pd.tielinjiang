package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;


import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.AddCommand;
import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.CommandManager;
import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.ResetCommand;
import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.ResultCommand;
import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;
	private CalculadorMementable calculadorMementable;
	private MementoManager<Memento> mementoManager;

	public MainCalculator() {
		mementoManager = new MementoManager<>();
		calculadorMementable = new CalculadorMementable();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddCommand(calculadorMementable));
		this.commandManager.add(new SubtractCommand(calculadorMementable));
		this.commandManager.add(new ResetCommand(calculadorMementable));
		this.commandManager.add(new ResultCommand(calculadorMementable));
		this.commandManager.add(new SaveCommand(mementoManager, calculadorMementable));
		this.commandManager.add(new RedoCommand(mementoManager, calculadorMementable));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculator());
		IO.getIO().print(0);
	}
}
