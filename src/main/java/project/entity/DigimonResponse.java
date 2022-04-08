package project.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonResponse {

	@JsonProperty("name")
	private String name;

	@JsonProperty("img")
	private String img;

	@JsonProperty("level")
	private int level;



	public Object getname(){
		return name;
	}
	public Object getImg(){
		return img;
	}
	public Object getlevel(){
		return level;
	}


}