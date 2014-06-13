package com.bragon.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

public class UserSessionVO {
	@JsonProperty("serviceTicket") public String serviceTicket;
	@JsonProperty("studentIDs") public Integer studentIDs;
	@JsonProperty("@type") public String type;
	@JsonProperty("userId") public Integer userId;
	@JsonProperty("locale") public Map<String, Boolean> locale;
	@JsonProperty("serverCurrentTime") public String serverCurrentTime;
	@JsonProperty("serverInfo") public ServerInfo serverInfo;
	@JsonProperty("userType") public Integer userType;
}
