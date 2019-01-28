package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="app")
public class ConfigClass {
	 private String name;
	    private String description;
	    private String uploadDir;
	   // private String roles;
	    
	    
	    
	    private List<String> roles = new ArrayList<>();
	    
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getUploadDir() {
			return uploadDir;
		}
		public void setUploadDir(String uploadDir) {
			this.uploadDir = uploadDir;
		}
		public List<String> getRoles() {
			return roles;
		}
		public void setRoles(List<String> roles) {
			this.roles = roles;
		}
	    
}
