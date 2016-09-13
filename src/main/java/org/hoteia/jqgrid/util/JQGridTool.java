package org.hoteia.jqgrid.util;

import org.hoteia.jqgrid.mapping.JqGridSearchOptionsPojo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JQGridTool {

	public static ObjectMapper getObjectMapper() {
		 ObjectMapper mapper = new ObjectMapper();
		 mapper.setSerializationInclusion(Include.NON_NULL);
		 return mapper;
	}
	
    public static JqGridSearchOptionsPojo buildDefaultJqGridSearchOptions(){
        JqGridSearchOptionsPojo searchOptionsPojo = new JqGridSearchOptionsPojo();
        searchOptionsPojo.setClearSearch(true);
        searchOptionsPojo.setDefaultValue("");
        return searchOptionsPojo;
    }
}
