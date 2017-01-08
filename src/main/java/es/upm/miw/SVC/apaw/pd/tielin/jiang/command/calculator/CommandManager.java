package es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
	private Map<String, Command> commands = new HashMap<>();

	public void add(Command command) {
		this.commands.put(command.getCommandName(), command);
	}

	public void execute(String key) {
		this.commands.get(key).execute();
	}

	public String[] keys() {
		return this.commands.keySet().toArray(new String[0]);
	}
}
