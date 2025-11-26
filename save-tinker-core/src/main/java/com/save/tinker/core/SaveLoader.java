package com.save.tinker.core;

import com.save.tinker.core.crypto.SaveDecryptor;
import com.save.tinker.core.extractor.BinaryFormatterStringExtractor;

import java.io.InputStream;


public class SaveLoader {

    public void load(InputStream stream) {

        try {
            String base64 = new BinaryFormatterStringExtractor().extractString(stream);

            SaveDecryptor decryptor = new SaveDecryptor();
            String json = decryptor.decryptBase64ToJson(base64);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}