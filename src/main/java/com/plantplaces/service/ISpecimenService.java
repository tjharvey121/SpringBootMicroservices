package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operations for specimens
 * @author tjhar
 *
 */
public interface ISpecimenService {
	/**
	 * Get specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching ID
	 */
	SpecimenDTO fetchById(int Id);
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 */
	void save(SpecimenDTO specimenDTO);

}