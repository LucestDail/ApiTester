package service;

import util.Type;

public class ApiMaker {
	private static final String HOST = "http://tcorp.zlgoon.com/";
	
	private static final String LSSEND = "lssend.hc/";
	private static final String DOTHC = ".hc/";
	
	String getCslssendUri(){
		return HOST + LSSEND + Type.valueOf(LSSEND) + DOTHC;
	}
	
	String getResendUri(){
		return HOST + LSSEND;
	}
	
	String getAllOrderCancelUri(){
		return HOST + LSSEND + Type.ALLORDERCANCEL + DOTHC;
	}
	
	String getCouponDetailUri(){
		return HOST + LSSEND + Type.COUPONDETAIL + DOTHC;
	}
}
