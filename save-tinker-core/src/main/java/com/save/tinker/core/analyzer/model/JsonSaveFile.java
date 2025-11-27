package com.save.tinker.core.analyzer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class JsonSaveFile {

    @SerializedName("playerData")
    private PlayerData playerData;

}
