package com.airoli.euroschool.Euroschool.controller;

import java.util.List;
import java.util.Optional;

import javax.xml.ws.RequestWrapper;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airoli.euroschool.Euroschool.model.ParentDetails;
import com.airoli.euroschool.Euroschool.service.ParentService;

@RestController
@RequestMapping(EuroController.BASE_URL)
public class EuroController {

	public static final String BASE_URL = "ap/v1/parentdetails";

	ParentService parentService;

	public EuroController(ParentService parentService) {
		this.parentService = parentService;
	}

	public void saveParentDetails(@PathVariable ParentDetails parentDetails) {
		parentService.saveParent(parentDetails);
	}

	@PostMapping
	public ParentDetails save(@RequestBody ParentDetails parentDetails) {
		return parentService.save(parentDetails);
	}

	@GetMapping(path = { "/{id}" })
	public Optional<ParentDetails> findOne(@PathVariable("id") int id) {
		return parentService.getParentById(id);
	}

	@PutMapping(path = { "/{id}" })
	public ParentDetails update(@PathVariable("id") int id, @RequestBody ParentDetails parentDetails) {
		parentDetails.setId(id);
		return parentService.update(parentDetails);
	}

	@DeleteMapping(path = { "/{id}" })
	public ParentDetails delete(@PathVariable("id") int id) {
		return parentService.delete(id);
	}

	@GetMapping
	public List<ParentDetails> findAll() {
		return parentService.findAll();
	}
}
