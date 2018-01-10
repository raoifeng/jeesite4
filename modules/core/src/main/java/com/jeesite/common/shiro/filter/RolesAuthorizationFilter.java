/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.common.shiro.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 角色权限过滤器
 * @author ThinkGem
 * @version 2017-03-22
 */
public class RolesAuthorizationFilter extends org.apache.shiro.web.filter.authz.RolesAuthorizationFilter {

	@Override
	protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
		super.redirectToLogin(request, response);
//		PermissionsAuthorizationFilter.redirectToDefaultPath(request, response);
	}
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
		return super.onAccessDenied(request, response);
//		return PermissionsAuthorizationFilter.redirectTo403Page(request, response);
    }
	
}