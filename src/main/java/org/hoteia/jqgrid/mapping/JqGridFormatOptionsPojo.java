package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridFormatOptionsPojo implements Serializable {

    private boolean keys = false;

    private String srcformat;
    private String newformat;
    private String defaultValue;

	private JqGridOptionPojo editOptions;
	
	private JqGridOptionPojo addOptions;
	
	private JqGridOptionPojo delOptions;

	public boolean isKeys() {
		return keys;
	}

	public void setKeys(boolean keys) {
		this.keys = keys;
	}

	public String getSrcformat() {
        return srcformat;
    }

    public void setSrcformat(String srcformat) {
        this.srcformat = srcformat;
    }

    public String getNewformat() {
        return newformat;
    }

    public void setNewformat(String newformat) {
        this.newformat = newformat;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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