package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class WarriorDreams {
    private boolean killedGhostAladar;                 // 击败戈布（戈布曾以其支持者的名字命名为Aladar，游戏文件中也有时这样称呼他）
    private boolean killedGhostXero;                   // 击败泽若
    private boolean killedGhostHu;                     // 击败胡长老
    private boolean killedGhostMarmu;                  // 击败马尔穆
    private boolean killedGhostNoEyes;                 // 击败无眼
    private boolean killedGhostMarkoth;                // 击败马科斯
    private boolean killedGhostGalien;                 // 击败加利安

    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("killedGhostAladar", killedGhostAladar);
        map.put("killedGhostXero", killedGhostXero);
        map.put("killedGhostHu", killedGhostHu);
        map.put("killedGhostMarmu", killedGhostMarmu);
        map.put("killedGhostNoEyes", killedGhostNoEyes);
        map.put("killedGhostMarkoth", killedGhostMarkoth);
        map.put("killedGhostGalien", killedGhostGalien);
        return map;
    }

    public String getName(String key) {
        switch (key) {
            case "killedGhostAladar":
                return "戈布";
            case "killedGhostXero":
                return "泽若";
            case "killedGhostHu":
                return "胡长老";
            case "killedGhostMarmu":
                return "马尔穆";
            case "killedGhostNoEyes":
                return "无眼";
            case "killedGhostMarkoth":
                return "马科斯";
            case "killedGhostGalien":
                return "加利安";
            default:
                return "";
        }
    }

    public List<String> getKilled() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getMap().entrySet()) {
            if (entry.getValue()) {
                list.add(getName(entry.getKey()));
            }
        }
        return list;
    }

    public List<String> getUnkilled() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : getMap().entrySet()) {
            if (!entry.getValue()) {
                list.add(getName(entry.getKey()));
            }
        }
        return list;
    }
}
