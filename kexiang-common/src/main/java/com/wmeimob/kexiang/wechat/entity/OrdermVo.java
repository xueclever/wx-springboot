package com.wmeimob.kexiang.wechat.entity;

public class OrdermVo extends Orderm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String  memberName;

	private String detailAddress;
	
	
	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
}
