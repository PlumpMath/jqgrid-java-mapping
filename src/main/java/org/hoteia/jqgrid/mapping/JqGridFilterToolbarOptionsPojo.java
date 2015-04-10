package org.hoteia.jqgrid.mapping;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridFilterToolbarOptionsPojo implements Serializable {

    private String value;

    @JsonProperty("autosearch")
    private boolean autoSearch;

    @JsonRawValue
    @JsonProperty("beforeSearch")
    private String beforeSearch;
    
    @JsonRawValue
    @JsonProperty("afterSearch")
    private String afterSearch;
    
    @JsonRawValue
    @JsonProperty("beforeClear")
    private String beforeClear;
    
    @JsonRawValue
    @JsonProperty("afterClear")
    private String afterClear;

    @JsonProperty("searchOnEnter")
    private boolean searchOnEnter;

    @JsonProperty("stringResult")
    private boolean stringResult;

    @JsonProperty("groupOp")
    private String groupOp;

    @JsonProperty("defaultSearch")
    private String defaultSearch;

    @JsonProperty("searchOperators")
    private boolean searchOperators;

    @JsonProperty("operandTitle")
    private String operandTitle;

    // private String operands;
    // private String odata;
    
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isAutoSearch() {
        return autoSearch;
    }

    public void setAutoSearch(boolean autoSearch) {
        this.autoSearch = autoSearch;
    }

    public String getBeforeSearch() {
        return beforeSearch;
    }

    public void setBeforeSearch(String beforeSearch) {
        this.beforeSearch = beforeSearch;
    }

    public String getAfterSearch() {
        return afterSearch;
    }

    public void setAfterSearch(String afterSearch) {
        this.afterSearch = afterSearch;
    }

    public String getBeforeClear() {
        return beforeClear;
    }

    public void setBeforeClear(String beforeClear) {
        this.beforeClear = beforeClear;
    }

    public String getAfterClear() {
        return afterClear;
    }

    public void setAfterClear(String afterClear) {
        this.afterClear = afterClear;
    }

    public boolean isSearchOnEnter() {
        return searchOnEnter;
    }

    public void setSearchOnEnter(boolean searchOnEnter) {
        this.searchOnEnter = searchOnEnter;
    }

    public boolean isStringResult() {
        return stringResult;
    }

    public void setStringResult(boolean stringResult) {
        this.stringResult = stringResult;
    }

    public String getGroupOp() {
        return groupOp;
    }

    public void setGroupOp(String groupOp) {
        this.groupOp = groupOp;
    }

    public String getDefaultSearch() {
        return defaultSearch;
    }

    public void setDefaultSearch(String defaultSearch) {
        this.defaultSearch = defaultSearch;
    }

    public boolean isSearchOperators() {
        return searchOperators;
    }

    public void setSearchOperators(boolean searchOperators) {
        this.searchOperators = searchOperators;
    }

    public String getOperandTitle() {
        return operandTitle;
    }

    public void setOperandTitle(String operandTitle) {
        this.operandTitle = operandTitle;
    }

}