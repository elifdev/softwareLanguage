package com.tobeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.service.SoftwareLanguageService;
import com.tobeto.dto.request.language.AddSoftwareLanguageRequest;
import com.tobeto.dto.request.language.DeleteSoftwareLanguageRequest;
import com.tobeto.dto.request.language.UpdateSoftwareLanguageRequest;
import com.tobeto.dto.response.language.GetAllSoftwareLanguageResponse;
import com.tobeto.dto.response.language.GetByIdSoftwareLanguageResponse;

@RestController
@RequestMapping("/language")
public class SoftwareLanguageController {

	@Autowired
	private SoftwareLanguageService softwareLanguageService;

	@GetMapping("/getAll")
	public List<GetAllSoftwareLanguageResponse> getAllSoftwareLanguageResponse() {
		return softwareLanguageService.getAllSoftwareLanguage();
	}

	@GetMapping("/get/{id}")
	public GetByIdSoftwareLanguageResponse getByIdSoftwareLanguageResponse(@PathVariable int id) {
		return softwareLanguageService.getByIdSoftwareLanguage(id);
	}

	@PutMapping("/update")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void updateSoftwareLanguageRequest(
			@RequestBody UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
		softwareLanguageService.updateSoftwareLanguage(updateSoftwareLanguageRequest);
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addSoftwareLangugeRequest(@RequestBody AddSoftwareLanguageRequest addSoftwareLanguageRequest) {
		softwareLanguageService.addSoftwareLanguage(addSoftwareLanguageRequest);
	}

	@DeleteMapping("/delete")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteSoftwareLanguageRequest(
			@RequestBody DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
		softwareLanguageService.deleteSoftwareLanguage(deleteSoftwareLanguageRequest);
	}

}