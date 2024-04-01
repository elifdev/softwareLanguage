package com.tobeto.dto.response.tech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdLanguageTechResponse {
	private String name;
	private String version;
	private int softwareLanguageId;
}
