package com.bragon.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QueryIncludeListVO {
	public QueryIncludeListVO(Integer includes) {
		this.includes = includes;
	}

	@JsonProperty("includes")
	public Integer includes;
}
