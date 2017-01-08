package es.upm.miw.SVC.apwd.pd.tielin.jiang.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

	private static final String[] textValue = { "zéro", "un", "deux", "trois"};

	public NaturalNumberFr(int value) {
		super(value);
	}

	@Override
	public String getTextValue() {
	    int value = getValue();
	    if (value >= 0 && value < textValue.length) {
	        return NaturalNumberFr.textValue[value];
        }
		return "SIN TEXT";
	}

}
