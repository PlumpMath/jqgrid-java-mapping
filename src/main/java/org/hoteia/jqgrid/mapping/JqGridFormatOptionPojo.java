package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

public class JqGridFormatOptionPojo implements Serializable {

    private boolean keys = false;
	private JqGridOptionPojo editOptions;
	private JqGridOptionPojo addOptions;
	private JqGridOptionPojo delOptions;

	public boolean isKeys() {
		return keys;
	}

	public void setKeys(boolean keys) {
		this.keys = keys;
	}

	public JqGridOptionPojo getEditOptions() {
		return editOptions;
	}

	public void setEditOptions(JqGridOptionPojo editOptions) {
		this.editOptions = editOptions;
	}

	public JqGridOptionPojo getAddOptions() {
		return addOptions;
	}

	public void setAddOptions(JqGridOptionPojo addOptions) {
		this.addOptions = addOptions;
	}

	public JqGridOptionPojo getDelOptions() {
		return delOptions;
	}

	public void setDelOptions(JqGridOptionPojo delOptions) {
		this.delOptions = delOptions;
	}
	
}