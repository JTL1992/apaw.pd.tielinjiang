package es.upm.miw.SVC.apwd.pd.tielin.jiang.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {

	private static final String[] textValue = {"cero", "uno", "dos", "tres"};

	public NaturalNumberEs(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
	    int value = getValue();
	    if (value >= 0 && value < textValue.length) {
	        return NaturalNumberEs.textValue[value];
        }
		return "SIN TEXT";
	}

}
