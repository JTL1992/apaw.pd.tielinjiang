package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

import upm.jbb.IO;

public class SaveCommand extends MementoCommand{

    
    public SaveCommand(MementoManager<Memento> mementoManager, CalculadorMementable calculadorMementable) {
        super(mementoManager, calculadorMementable);
    }

    @Override
    public String getCommandName() {
        return "save result";
    }

    @Override
    public void execute() {
        mementoManager.addMemento(IO.getIO().readString(), calculadorMementable.createMemento());
    }

}
