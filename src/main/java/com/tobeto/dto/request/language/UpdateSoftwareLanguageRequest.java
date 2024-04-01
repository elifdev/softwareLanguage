package com.tobeto.dto.request.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSoftwareLanguageRequest {

	private int id;
	private String name;
	private String version;
	private String languageTechName;

}
