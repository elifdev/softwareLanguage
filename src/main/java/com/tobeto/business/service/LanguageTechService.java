package com.tobeto.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tobeto.dto.request.tech.AddLanguageTechRequest;
import com.tobeto.dto.request.tech.DeleteLanguageTechRequest;
import com.tobeto.dto.request.tech.UpdateLanguageTechRequest;
import com.tobeto.dto.response.tech.GetAllLanguageTechResponse;
import com.tobeto.dto.response.tech.GetByIdLanguageTechResponse;

@Service
public interface LanguageTechService {
	List<GetAllLanguageTechResponse> getAllLanguageTech();

	GetByIdLanguageTechResponse getByIdLanguageTech(int id);

	void updateLanguageTech(UpdateLanguageTechRequest updateLanguageTechRequest);

	void addLanguageTech(AddLanguageTechRequest addLanguageTechRequest);

	void deleteLanguageTech(DeleteLanguageTechRequest deleteLanguageTechRequest);

}
