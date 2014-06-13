package com.bragon.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetStudentData {
	@JsonProperty("userSessionVO") public UserSessionVO userSessionVO;
	@JsonProperty("studentIDs") public long studentIDs;
	@JsonProperty("qil") public QueryIncludeListVO qil;
}
