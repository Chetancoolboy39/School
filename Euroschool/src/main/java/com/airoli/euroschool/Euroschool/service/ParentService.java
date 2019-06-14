package com.airoli.euroschool.Euroschool.service;

import java.util.List;
import java.util.Optional;

import com.airoli.euroschool.Euroschool.model.ParentDetails;

public interface ParentService {

	void saveParent(ParentDetails parentDetails);

	ParentDetails save(ParentDetails parentDetails);

	ParentDetails update(ParentDetails parentDetails);

	ParentDetails delete(int id);

	void deleteParent(ParentDetails parentDetails);

	List<ParentDetails> findAll();

	Optional<ParentDetails> getParentById(int id);

}
