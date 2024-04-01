package com.tobeto.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tobeto.dto.request.language.AddSoftwareLanguageRequest;
import com.tobeto.dto.request.language.DeleteSoftwareLanguageRequest;
import com.tobeto.dto.request.language.UpdateSoftwareLanguageRequest;
import com.tobeto.dto.response.language.GetAllSoftwareLanguageResponse;
import com.tobeto.dto.response.language.GetByIdSoftwareLanguageResponse;

@Service
public interface SoftwareLanguageService {
	public List<GetAllSoftwareLanguageResponse> getAllSoftwareLanguage();

	public GetByIdSoftwareLanguageResponse getByIdSoftwareLanguage(int id);

	void updateSoftwareLanguage(UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);

	void addSoftwareLanguage(AddSoftwareLanguageRequest addSoftwareLanguageRequest);

	void deleteSoftwareLanguage(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);

}
