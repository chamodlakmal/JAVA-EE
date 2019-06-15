package com.jcl.strut.action;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.jcl.strut.db.DB;
import com.jcl.strut.model.Video;
import com.opensymphony.xwork2.ActionSupport;

public class VideoAction extends ActionSupport {
	private List<Video> itemList;
	private Video item;
	
	public String list() {
		System.out.println("list");
		itemList =  (List<Video>) DB.list("Video");
		return SUCCESS;
	}
	
	public String add(){
		
		try {
			ServletContext servletContext = ServletActionContext.getServletContext();
			String path = "/uploads/";
			String filePath = servletContext.getRealPath(path);
			System.out.println("Server path:" + filePath);
		    File fileToCreate = new File(filePath, item.getVideoFileName());
		    FileUtils.copyFile(item.getVideo(), fileToCreate);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		DB.save(item);
		itemList =  (List<Video>) DB.list("Video");
		return SUCCESS;
	}

	public List<Video> getItemList() {
		return itemList;
	}

	public void setItemList(List<Video> itemList) {
		this.itemList = itemList;
	}

	public Video getItem() {
		return item;
	}

	public void setItem(Video item) {
		this.item = item;
	}

	
	
	
	
	
	

}
