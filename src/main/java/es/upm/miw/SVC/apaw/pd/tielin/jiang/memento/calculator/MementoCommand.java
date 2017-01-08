package es.upm.miw.SVC.apaw.pd.tielin.jiang.memento.calculator;

import es.upm.miw.SVC.apaw.pd.tielin.jiang.command.calculator.Command;

public abstract class MementoCommand implements Command{
    
    protected MementoManager<Memento> mementoManager;
    protected CalculadorMementable calculadorMementable;
    
    public MementoCommand(MementoManager<Memento> mementoManager, CalculadorMementable calculadorMementable) {
        this.mementoManager = mementoManager;
        this.calculadorMementable = calculadorMementable;
    }
}
