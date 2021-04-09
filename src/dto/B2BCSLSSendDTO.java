package dto;

public class B2BCSLSSendDTO extends B2BDTO{
	private String goodsId;
	private String orderCnt;
	private String receivermobile;
	private String tmessage;
	private String cmessage;
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getOrderCnt() {
		return orderCnt;
	}
	public void setOrderCnt(String orderCnt) {
		this.orderCnt = orderCnt;
	}
	public String getReceivermobile() {
		return receivermobile;
	}
	public void setReceivermobile(String receivermobile) {
		this.receivermobile = receivermobile;
	}
	public String getTmessage() {
		return tmessage;
	}
	public void setTmessage(String tmessage) {
		this.tmessage = tmessage;
	}
	public String getCmessage() {
		return cmessage;
	}
	public void setCmessage(String cmessage) {
		this.cmessage = cmessage;
	}
	
	
}
