package com.save.tinker.cli;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.save.tinker.core.analyzer.model.PlayerData;
import com.save.tinker.core.parser.io.SaveLoader;
import com.save.tinker.core.parser.io.FileExporter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "dat/save.dat";
        InputStream stream = Main.class.getClassLoader().getResourceAsStream(fileName);

        if (stream == null) {
            System.out.println("存档文件 " + fileName + " 未找到！");
            return;
        }

        SaveLoader loader = new SaveLoader();
        String json = loader.load(stream);

        if (Objects.nonNull(json)) {
            FileExporter fileExporter = FileExporter.builder()
                    .fileContent(json)
                    .filePath("output/save.json")
                    .build();
            fileExporter.exportToJson();

            ObjectMapper objectMapper = new ObjectMapper();
            try {
                JsonParser jsonParser = objectMapper.getFactory().createParser(json);
                PlayerData playerData = objectMapper.readValue(jsonParser, PlayerData.class);
                System.out.println(playerData);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
