package com.tobeto.dto.request.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddSoftwareLanguageRequest {

	private String name;
	private String releaseDate;
	private String version;
	private int languageTechId;

}