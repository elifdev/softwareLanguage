package com.tobeto.dto.request.tech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLanguageTechRequest {
	private int id;
	private String name;
	private String version;
	private int softwareLanguageId;
}
