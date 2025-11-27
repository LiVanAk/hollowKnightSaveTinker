package com.save.tinker.core.parser.transform;

import com.google.gson.Gson;
import com.save.tinker.core.analyzer.model.CompletionDegree;
import com.save.tinker.core.analyzer.model.JsonSaveFile;
import com.save.tinker.core.analyzer.model.PlayerData;

public class JsonParserUtil {
    private static final Gson gson = new Gson();

    public static JsonSaveFile parse(String json) {
        return gson.fromJson(json, JsonSaveFile.class);
    }

    public static CompletionDegree parseCompletion(String json) {
        return gson.fromJson(json, CompletionDegree.class);
    }
}
