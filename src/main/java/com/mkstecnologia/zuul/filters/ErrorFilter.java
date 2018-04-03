package com.mkstecnologia.zuul.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {

	@Override
	public Object run() {
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "error";
	}

}
