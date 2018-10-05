package com.apap.tutorial4.service;

import java.util.List;

import com.apap.tutorial4.model.PilotModel;
import com.apap.tutorial4.repository.PilotDB;

public interface PilotService {
	PilotModel getPilotModelByLicenseNumber(String licenseNumber);
	
	void addPilot(PilotModel pilot);
	
	PilotDB getPilots();
	
	void deletePilot(PilotModel pilot);

}
