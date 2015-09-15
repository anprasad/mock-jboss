package com.vsp.mock;

public class UpdateMaster {
	private long id;
	private String context;
	
	public UpdateMaster() {
	}

	public UpdateMaster(long id, String context) {
		super();
		this.id = id;
		this.context = context;
	}

	public long getId() {
		return id;
	}

	public String getContext() {
		return context;
	}
	
}