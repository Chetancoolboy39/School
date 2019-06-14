package com.airoli.euroschool.Euroschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.airoli.euroschool.Euroschool.model.ParentDetails;
import com.airoli.euroschool.Euroschool.repository.ParentRepository;

@Component
public class ParentServiceImpl implements ParentService {

	ParentRepository parentRepository;

	public ParentServiceImpl(ParentRepository parentRepository) {
		this.parentRepository = parentRepository;
	}

	@Override
	public void saveParent(ParentDetails parentDetails) {
		parentRepository.save(parentDetails);
	}
	
	@Override
	public void deleteParent(ParentDetails parentDetails) {
		parentRepository.delete(parentDetails);
	}
	
	@Override
	public List<ParentDetails> findAll() {
		return parentRepository.findAll();
	}
	@Override
	public Optional<ParentDetails> getParentById(int id) {
		return parentRepository.findById(id);
	}

	@Override
	public ParentDetails save(ParentDetails parentDetails) {
		// TODO Auto-generated method stub
		return parentRepository.save(parentDetails);
	}

	@Override
	public ParentDetails update(ParentDetails parentDetails) {
		// TODO Auto-generated method stub
		return parentRepository.save(parentDetails);
	}

	@Override
	public ParentDetails delete(int id) {
		// TODO Auto-generated method stub
		Optional<ParentDetails> parentDetailsOptional = getParentById(id);
		ParentDetails parentDetails =parentDetailsOptional.get();
        if(parentDetails != null){
        	parentRepository.delete(parentDetails);
        }
        return parentDetails;
	}
}
