package es.upm.miw.SVC.apwd.pd.tielin.jiang.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	private static final String[] textValue = {"zero", "one", "two", "three"};

	public NaturalNumberEn(int value) {
		super(value);
	}

	@Override
    public String getTextValue() {
	    int value = getValue();
        if (value >= 0 && value < textValue.length)
            return NaturalNumberEn.textValue[value];
        return "SIN TEXT";
    }
}
