package com.capgemini.jpa.onetomany.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Certificate {

	@Id
	private int certificateId;
	private String certificateDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Person person;

	public Certificate() {
		super();

	}

	public Certificate(int certificateId, String certificateDescription) {
		super();
		this.certificateId = certificateId;
		this.certificateDescription = certificateDescription;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateDescription() {
		return certificateDescription;
	}

	public void setCertificateDescription(String certificateDescription) {
		this.certificateDescription = certificateDescription;
	}

	@Override
	public String toString() {
		return "Certificate [certificateId=" + certificateId + ", certificateDescription=" + certificateDescription
				+ "]";
	}

}
