package com.xwood.search.service.impl;

import com.caucho.hessian.server.HessianServlet;
import com.xwood.search.service.ISearchService;

public class SearchServiceImpl extends HessianServlet implements ISearchService {
	@Override
	public String invoke(String kwords) {
		return kwords+" 搜索结果:************";
	}
}
