package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridSearchOptionsPojo implements Serializable {

    @JsonProperty("dataUrl")
	private String dataUrl;
    
    @JsonRawValue
    @JsonProperty("buildSelect")
    private String buildSelect;
    
    @JsonRawValue
    @JsonProperty("dataInit")
    private String dataInit;
    
    @JsonProperty("dataEvents")
    private String[] dataEvents;
    
//    private String attr;
    
    @JsonProperty("searchhidden")
    private boolean searchHidden = false;
    
    @JsonProperty("sopt")
    private String[] sOpt;
    
    @JsonProperty("defaultValue")
    private String defaultValue;
    
    @JsonProperty("value")
    private String value;
    
    @JsonProperty("clearSearch")
    private boolean clearSearch = false;

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getBuildSelect() {
        return buildSelect;
    }

    public void setBuildSelect(String buildSelect) {
        this.buildSelect = buildSelect;
    }

    public String getDataInit() {
        return dataInit;
    }

    public void setDataInit(String dataInit) {
        this.dataInit = dataInit;
    }

    public String[] getDataEvents() {
        return dataEvents;
    }

    public void setDataEvents(String[] dataEvents) {
        this.dataEvents = dataEvents;
    }

    public boolean isSearchHidden() {
        return searchHidden;
    }

    public void setSearchHidden(boolean searchHidden) {
        this.searchHidden = searchHidden;
    }

    public String[] getsOpt() {
        return sOpt;
    }

    public void setsOpt(String[] sOpt) {
        this.sOpt = sOpt;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isClearSearch() {
        return clearSearch;
    }

    public void setClearSearch(boolean clearSearch) {
        this.clearSearch = clearSearch;
    }
	
}