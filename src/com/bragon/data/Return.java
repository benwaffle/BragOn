package com.bragon.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

public class Return {
	@JsonProperty("userSessionVO") public UserSessionVO userSessionVO;
	@JsonProperty("@type") public String type;
	@JsonProperty("courseRequestRulesVO") public Map<String, Boolean> courseRequestRulesVO;
}
