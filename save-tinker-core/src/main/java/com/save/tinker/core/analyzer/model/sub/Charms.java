package com.save.tinker.core.analyzer.model.sub;

import com.save.tinker.core.analyzer.model.Abstract;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class Charms extends Abstract {

    /*
     * 护符，主体包共36个护符，后续更新内容包新增4个护符，共40个护符，5个可升级或变化的护符
     */

    private int charmsOwned;

    // Deepseek友善提醒：通常推荐使用数组，如 private boolean[] gotCharm = new boolean[40];
    private boolean gotCharm_1;
    private boolean gotCharm_2;
    private boolean gotCharm_3;
    private boolean gotCharm_4;
    private boolean gotCharm_5;
    private boolean gotCharm_6;
    private boolean gotCharm_7;
    private boolean gotCharm_8;
    private boolean gotCharm_9;
    private boolean gotCharm_10;
    private boolean gotCharm_11;
    private boolean gotCharm_12;
    private boolean gotCharm_13;
    private boolean gotCharm_14;
    private boolean gotCharm_15;
    private boolean gotCharm_16;
    private boolean gotCharm_17;
    private boolean gotCharm_18;
    private boolean gotCharm_19;
    private boolean gotCharm_20;
    private boolean gotCharm_21;
    private boolean gotCharm_22;
    private boolean gotCharm_23;
    private boolean gotCharm_24;
    private boolean gotCharm_25;
    private boolean gotCharm_26;
    private boolean gotCharm_27;
    private boolean gotCharm_28;
    private boolean gotCharm_29;
    private boolean gotCharm_30;
    private boolean gotCharm_31;
    private boolean gotCharm_32;
    private boolean gotCharm_33;
    private boolean gotCharm_34;
    private boolean gotCharm_35;
    private boolean gotCharm_36;
    private boolean gotCharm_37;
    private boolean gotCharm_38;
    private boolean gotCharm_39;
    private boolean gotCharm_40;


    @Override
    public Map<String, Boolean> getMap() {
        Map<String, Boolean> map = new HashMap<>();
        map.put("gotCharm_1", gotCharm_1);
        map.put("gotCharm_2", gotCharm_2);
        map.put("gotCharm_3", gotCharm_3);
        map.put("gotCharm_4", gotCharm_4);
        map.put("gotCharm_5", gotCharm_5);
        map.put("gotCharm_6", gotCharm_6);
        map.put("gotCharm_7", gotCharm_7);
        map.put("gotCharm_8", gotCharm_8);
        map.put("gotCharm_9", gotCharm_9);
        map.put("gotCharm_10", gotCharm_10);
        map.put("gotCharm_11", gotCharm_11);
        map.put("gotCharm_12", gotCharm_12);
        map.put("gotCharm_13", gotCharm_13);
        map.put("gotCharm_14", gotCharm_14);
        map.put("gotCharm_15", gotCharm_15);
        map.put("gotCharm_16", gotCharm_16);
        map.put("gotCharm_17", gotCharm_17);
        map.put("gotCharm_18", gotCharm_18);
        map.put("gotCharm_19", gotCharm_19);
        map.put("gotCharm_20", gotCharm_20);
        map.put("gotCharm_21", gotCharm_21);
        map.put("gotCharm_22", gotCharm_22);
        map.put("gotCharm_23", gotCharm_23);
        map.put("gotCharm_24", gotCharm_24);
        map.put("gotCharm_25", gotCharm_25);
        map.put("gotCharm_26", gotCharm_26);
        map.put("gotCharm_27", gotCharm_27);
        map.put("gotCharm_28", gotCharm_28);
        map.put("gotCharm_29", gotCharm_29);
        map.put("gotCharm_30", gotCharm_30);
        map.put("gotCharm_31", gotCharm_31);
        map.put("gotCharm_32", gotCharm_32);
        map.put("gotCharm_33", gotCharm_33);
        map.put("gotCharm_34", gotCharm_34);
        map.put("gotCharm_35", gotCharm_35);
        map.put("gotCharm_36", gotCharm_36);
        map.put("gotCharm_37", gotCharm_37);
        map.put("gotCharm_38", gotCharm_38);
        map.put("gotCharm_39", gotCharm_39);
        map.put("gotCharm_40", gotCharm_40);
        return map;
    }

    @Override
    public String getName(String key) {
        switch (key) {
            case "gotCharm_1":
                return "魔法之盾";
            case "gotCharm_2":
                return "魔法之盾";
            case "gotCharm_3":
                return "魔法之盾";
            case "gotCharm_4":
                return "魔法之盾";
            case "gotCharm_5":
                return "魔法之盾";
            case "gotCharm_6":
                return "魔法之盾";
            case "gotCharm_7":
                return "魔法之盾";
            case "gotCharm_8":
                return "魔法之盾";
            case "gotCharm_9":
                return "魔法之盾";
            case "gotCharm_10":
                return "魔法之盾";
            case "gotCharm_11":
                return "魔法之盾";
            case "gotCharm_12":
                return "魔法之盾";
            case "gotCharm_13":
                return "魔法之盾";
            case "gotCharm_14":
               return "魔法之盾";
            case "gotCharm_15":
                return "魔法之盾";
            case "gotCharm_16":
                return "魔法之盾";
            case "gotCharm_17":
                return "魔法之盾";
            case "gotCharm_18":
                return "魔法之盾";
            case "gotCharm_19":
                return "魔法之盾";
            case "gotCharm_20":
                return "魔法之盾";
            case "gotCharm_21":
                return "魔法之盾";
            case "gotCharm_22":
                return "魔法之盾";
            case "gotCharm_23":
                return "魔法之盾";
            case "gotCharm_24":
                return "魔法之盾";
            case "gotCharm_25":
                return "魔法之盾";
            case "gotCharm_26":
                return "魔法之盾";
            case "gotCharm_27":
                return "魔法之盾";
            case "gotCharm_28":
                return "魔法之盾";
            case "gotCharm_29":
                return "魔法之盾";
            case "gotCharm_30":
                return "魔法之盾";
            case "gotCharm_31":
                return "魔法之盾";
            case "gotCharm_32":
                return "魔法之盾";
            case "gotCharm_33":
                return "魔法之盾";
            case "gotCharm_34":
                return "魔法之盾";
            case "gotCharm_35":
                return "魔法之盾";
            case "gotCharm_36":
                return "魔法之盾";
            case "gotCharm_37":
                return "魔法之盾";
            case "gotCharm_38":
                return "魔法之盾";
            case "gotCharm_39":
                return "魔法之盾";
            case "gotCharm_40":
                return "魔法之盾";
            default:
                return "";
        }
    }

    @Override
    public int getValue() {
        return 1;
    }
}
