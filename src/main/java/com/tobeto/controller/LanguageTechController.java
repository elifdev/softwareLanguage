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

import com.tobeto.business.service.LanguageTechService;
import com.tobeto.dto.request.tech.AddLanguageTechRequest;
import com.tobeto.dto.request.tech.DeleteLanguageTechRequest;
import com.tobeto.dto.request.tech.UpdateLanguageTechRequest;
import com.tobeto.dto.response.tech.GetAllLanguageTechResponse;
import com.tobeto.dto.response.tech.GetByIdLanguageTechResponse;

@RestController
@RequestMapping("/tech")
public class LanguageTechController {

	@Autowired
	private LanguageTechService languageTechService;

	@GetMapping("/getAll")
	public List<GetAllLanguageTechResponse> getAllLanguageTechResponse() {
		return languageTechService.getAllLanguageTech();
	}

	@GetMapping("/get/{id}")
	public GetByIdLanguageTechResponse getByIdLanguageTechResponse(@PathVariable int id) {
		return languageTechService.getByIdLanguageTech(id);
	}

	@PutMapping("/update")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void updateLanguageTechRequest(@RequestBody UpdateLanguageTechRequest updateLanguageTechRequest) {
		languageTechService.updateLanguageTech(updateLanguageTechRequest);
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void addLanguageTechRequest(@RequestBody AddLanguageTechRequest addLanguageTechRequest) {
		languageTechService.addLanguageTech(addLanguageTechRequest);
	}

	@DeleteMapping("/delete")
	@ResponseStatus(code = HttpStatus.OK)
	public void deleteLanguageRequest(@RequestBody DeleteLanguageTechRequest deleteLanguageTechRequest) {
		languageTechService.deleteLanguageTech(deleteLanguageTechRequest);
	}

}
