package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

import upm.jbb.IO;

public class RedoCommand extends MementoCommand{

    public RedoCommand(MementoManager<Memento> mementoManager, CalculadorMementable calculadorMementable) {
        super(mementoManager, calculadorMementable);
    }

    @Override
    public String getCommandName() {
        return "redo";
    }

    @Override
    public void execute() {
        calculadorMementable.
            restoreMemento(mementoManager.getMemento((String) IO.getIO().select(mementoManager.getKeys(), "redo")));
        IO.getIO().clear();
        IO.getIO().print(calculadorMementable.getTotal());      
    }
}
