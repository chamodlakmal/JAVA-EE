package com.jcl.strut.model;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Video {
	@GeneratedValue
	@Id
	private int id;
	private String title;
	private String description;
	private File video;
	private String videoFileName;
	private String videoContentType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public File getVideo() {
		return video;
	}
	public void setVideo(File video) {
		this.video = video;
	}
	public String getVideoFileName() {
		return videoFileName;
	}
	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}
	public String getVideoContentType() {
		return videoContentType;
	}
	public void setVideoContentType(String videoContentType) {
		this.videoContentType = videoContentType;
	}
	

}
