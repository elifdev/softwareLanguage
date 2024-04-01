package com.tobeto.dto.response.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdSoftwareLanguageResponse {

	private int id;
	private String name;
	private String languageTechName;
}
