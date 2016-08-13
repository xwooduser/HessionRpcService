package com.xwood.search.client;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.xwood.search.service.ISearchService;

public class SearchClientTest {
	
	public static void main(String[] args) throws MalformedURLException {
		 	String remoteUrl = "http://localhost:8080/HessionRpcService/search";
	        HessianProxyFactory factory = new HessianProxyFactory();
	        ISearchService  searcher = (ISearchService) factory.create(ISearchService.class, remoteUrl);
	        System.out.println(searcher.invoke("小木人"));
	}

}
