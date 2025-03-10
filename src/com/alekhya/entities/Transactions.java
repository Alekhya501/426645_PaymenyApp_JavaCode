package com.alekhya.entities;

import java.security.Timestamp;

public class Transactions {
	private int txnId;
	private Timestamp txnDateTime;
	private int sourceId;
	private int targetId;
	private SourceType sourceType;
	private SourceType destType;
	private double txnAmount;
	private User user;

	public Transactions() {
		super();
	}

	public Transactions(int txnId, Timestamp txnDateTime, int sourceId, int targetId, SourceType sourceType,
			SourceType destType, double txnAmount, User user) {
		super();
		this.txnId = txnId;
		this.txnDateTime = txnDateTime;
		this.sourceId = sourceId;
		this.targetId = targetId;
		this.sourceType = sourceType;
		this.destType = destType;
		this.txnAmount = txnAmount;

		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}

	public Timestamp getTxnDateTime() {
		return txnDateTime;
	}

	public void setTxnDateTime(Timestamp txnDateTime) {
		this.txnDateTime = txnDateTime;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public SourceType getSourceType() {
		return sourceType;
	}

	public void setSourceType(SourceType sourceType) {
		this.sourceType = sourceType;
	}

	public SourceType getDestType() {
		return destType;
	}

	public void setDestType(SourceType destType) {
		this.destType = destType;
	}

	public double getTxnAmount() {
		return txnAmount;
	}

	public void setTxnAmount(double txnAmount) {
		this.txnAmount = txnAmount;
	}

}
