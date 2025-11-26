package com.save.tinker.core;

import com.save.tinker.core.io.BinaryReader;
import com.save.tinker.core.io.HeaderParser;
import com.save.tinker.core.io.SaveHeader;

import java.io.InputStream;

public class SaveLoader {

    private final HeaderParser headerParser = new HeaderParser();

    public void load(InputStream stream) {
        try (BinaryReader reader = new BinaryReader(stream)) {
            SaveHeader header = headerParser.parse(reader);
            System.out.println("解析的头部信息:");
            System.out.println(header);
        } catch (Exception e) {
            System.err.println("读取失败: " + e.getMessage());
        }
    }
}