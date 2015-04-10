package org.hoteia.jqgrid.mapping;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class JqGridPojo<C> {

	private String url;
	
	@JsonProperty("editurl")
	private String editUrl;

	private String mtype; // GET
	
	@JsonProperty("datatype")
	private String dataType; // json jsonp

	@JsonProperty("data")
	private List<C> datas = new ArrayList<C>();

	@JsonProperty("colModel")
	private List<JqGridColModelPojo> colModels = new ArrayList<JqGridColModelPojo>();

	@JsonProperty("viewrecords")
	private boolean viewRecords = false;

	@JsonProperty("loadonce")
	private boolean loadOnce = false;
	
	private int page;
	private int width;
	private int height;
	private int rowNum;
	private int scroll;

	private String sortname;
	
	private boolean subGrid = false;
	
	@JsonProperty("subgridtype")
	private String subGridType;
	
	private String subGridUrl;

	@JsonProperty("subGridModel")
	private List<JqGridSubModelPojo> subGridModels = new ArrayList<JqGridSubModelPojo>();

	private String pager;
	private String caption;
	
	@JsonProperty("emptyrecords")
	private String emptyRecords;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getEditUrl() {
		return editUrl;
	}
	
	public void setEditUrl(String editUrl) {
		this.editUrl = editUrl;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public List<C> getDatas() {
		return datas;
	}
	
	public void setDatas(List<C> datas) {
		this.datas = datas;
	}

	public List<JqGridColModelPojo> getColModels() {
		return colModels;
	}

	public void setColModels(List<JqGridColModelPojo> colModels) {
		this.colModels = colModels;
	}

	public boolean isViewRecords() {
		return viewRecords;
	}

	public void setViewRecords(boolean viewRecords) {
		this.viewRecords = viewRecords;
	}

	public boolean isLoadOnce() {
		return loadOnce;
	}

	public void setLoadOnce(boolean loadOnce) {
		this.loadOnce = loadOnce;
	}

	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRowNum() {
		return rowNum;
	}

	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	public int getScroll() {
		return scroll;
	}

	public void setScroll(int scroll) {
		this.scroll = scroll;
	}

	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	public boolean isSubGrid() {
		return subGrid;
	}

	public void setSubGrid(boolean subGrid) {
		this.subGrid = subGrid;
	}

	public String getSubGridType() {
		return subGridType;
	}

	public void setSubGridType(String subGridType) {
		this.subGridType = subGridType;
	}

	public String getSubGridUrl() {
		return subGridUrl;
	}

	public void setSubGridUrl(String subGridUrl) {
		this.subGridUrl = subGridUrl;
	}
	
	public List<JqGridSubModelPojo> getSubGridModels() {
		return subGridModels;
	}
	
	public void setSubGridModels(List<JqGridSubModelPojo> subGridModels) {
		this.subGridModels = subGridModels;
	}

	public String getPager() {
		return pager;
	}

	public void setPager(String pager) {
		this.pager = pager;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getEmptyRecords() {
		return emptyRecords;
	}

	public void setEmptyRecords(String emptyRecords) {
		this.emptyRecords = emptyRecords;
	}

}
