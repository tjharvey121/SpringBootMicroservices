package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;


@Component
public class SpecimentServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchById (int Id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("40.55");
		specimenDTO.setLongitude("84.51");
		specimenDTO.setDescription("A beautiful Eastern Redbud");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
}
