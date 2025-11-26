package com.save.tinker.cli;

import com.save.tinker.core.SaveLoader;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String fileName = args.length > 0 ? args[0] : "test_random.dat";
        InputStream stream = Main.class.getClassLoader().getResourceAsStream(fileName);

        if (stream == null) {
            System.out.println("资源文件 " + fileName + " 未找到！");
            return;
        }

        SaveLoader loader = new SaveLoader();
        loader.load(stream);
    }
}
