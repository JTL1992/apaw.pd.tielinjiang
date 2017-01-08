package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {

	private Map<String, T> mementos = new HashMap<String, T>();

	public void addMemento(String key, T memento) {
		this.mementos.put(key, memento);
	}

	public T getMemento(String key) {
		return this.mementos.get(key);
	}

	public String[] getKeys() {
		return this.mementos.keySet().toArray(new String[0]);
	}

}
