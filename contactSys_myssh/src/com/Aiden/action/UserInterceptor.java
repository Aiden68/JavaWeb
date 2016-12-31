package com.Aiden.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class UserInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		String methodName = invocation.getProxy().getMethod();
		ActionContext ac = invocation.getInvocationContext();
		Object obj = ac.getSession().get("adminInfo");
		
		if(!"login".equals(methodName) && !"list".equals(methodName)){
			if (obj == null){
				return "login";
			} 
			else {
				return invocation.invoke();
			}
		}
		else{
			return invocation.invoke();
		}
	}

}
