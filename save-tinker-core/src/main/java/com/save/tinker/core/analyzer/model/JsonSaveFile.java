package com.save.tinker.core.analyzer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonSaveFile {

    private PlayerData playerData;

}
