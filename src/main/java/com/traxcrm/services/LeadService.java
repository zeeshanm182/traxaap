package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);
	public Lead getLeadById(long id);
	public void deletOneLead(long id);
	public List<Lead> listAll();
}
