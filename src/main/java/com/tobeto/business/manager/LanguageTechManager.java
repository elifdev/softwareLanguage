package com.tobeto.business.manager;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tobeto.business.service.LanguageTechService;
import com.tobeto.dto.request.tech.AddLanguageTechRequest;
import com.tobeto.dto.request.tech.DeleteLanguageTechRequest;
import com.tobeto.dto.request.tech.UpdateLanguageTechRequest;
import com.tobeto.dto.response.tech.GetAllLanguageTechResponse;
import com.tobeto.dto.response.tech.GetByIdLanguageTechResponse;
import com.tobeto.entities.LanguageTech;
import com.tobeto.repository.LanguageTechRepository;

@Service
public class LanguageTechManager implements LanguageTechService {

	@Autowired
	private LanguageTechRepository languageTechRepository;

	@Autowired
	@Qualifier("requestMapper")
	private ModelMapper requestMapper;

	@Autowired
	@Qualifier("responseMapper")
	private ModelMapper responseMapper;

	@Override
	public List<GetAllLanguageTechResponse> getAllLanguageTech() {
		return languageTechRepository.findAll().stream()
				.map(t -> requestMapper.map(t, GetAllLanguageTechResponse.class)).toList();

	}

	@Override
	public GetByIdLanguageTechResponse getByIdLanguageTech(int id) {
		Optional<LanguageTech> languageTech = languageTechRepository.findById(id);
		return responseMapper.map(languageTech, GetByIdLanguageTechResponse.class);
	}

	@Override
	public void updateLanguageTech(UpdateLanguageTechRequest updateLanguageTechRequest) {
		LanguageTech languageTech = requestMapper.map(updateLanguageTechRequest, LanguageTech.class);
		languageTechRepository.save(languageTech);

	}

	@Override
	public void addLanguageTech(AddLanguageTechRequest addLanguageTechRequest) {
		LanguageTech languageTech = requestMapper.map(addLanguageTechRequest, LanguageTech.class);
		languageTechRepository.save(languageTech);

	}

	@Override
	public void deleteLanguageTech(DeleteLanguageTechRequest deleteLanguageTechRequest) {
		LanguageTech languageTech = requestMapper.map(deleteLanguageTechRequest, LanguageTech.class);
		languageTechRepository.delete(languageTech);
	}

}
