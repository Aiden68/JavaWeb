package com.Aiden.action;

import com.Aiden.entity.Admin;
import com.Aiden.service.IAdminService;
import com.Aiden.service.impl.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	
	private IAdminService adminService;
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	private String adminName;
	private String pwd;
	private Admin admin = new Admin();
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public String login(){
		if(admin == null){
			System.out.println("fuck you");
		}
		System.out.println(adminName);
		System.out.println(pwd);
		admin.setAdminName(adminName);
		admin.setPwd(pwd);
		Admin adminInfo = adminService.login(admin);
		if(adminInfo != null){
			System.out.println("what is the fuck");
			ActionContext.getContext().getSession().put("adminInfo", adminInfo);
			return "list";
		}
		else{
			System.out.println("no this admin");
			return "loginFail";
		}
	}
}
