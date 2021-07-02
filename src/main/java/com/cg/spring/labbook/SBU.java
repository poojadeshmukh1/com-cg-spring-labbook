package com.cg.spring.labbook;

public class SBU {
	
	private int sbuid;
	private String sbuName;
	private String sbuHead;
	
	public SBU() {
		super();
	}
	


	@Override
	public String toString() {
		return "SBU [sbuid=" + sbuid + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}



	public SBU(int sbuid, String sbuName, String sbuHead) {
		super();
		this.sbuid = sbuid;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}

	public int getSbuid() {
		return sbuid;
	}
	public void setSbuid(int sbuid) {
		this.sbuid = sbuid;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

}
