package com.bragon.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;

public class ServerInfo {
	@JsonProperty("apiVersion") public String apiVersion;
	@JsonProperty("dayLightSavings") public Integer dayLightSavings;
	@JsonProperty("@type") public String type;
	@JsonProperty("serverTime") public String serverTime;
	@JsonProperty("rawOffset") public Integer rawOffset;
	@JsonProperty("timeZoneName") public String timeZoneName;
}
