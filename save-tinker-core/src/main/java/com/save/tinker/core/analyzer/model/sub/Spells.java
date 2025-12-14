package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class Spells {

    /*
     * 法术，每个占有1%完成度，共6%
     */

    private int fireballLevel;          // 0：未获得；1：复仇之魂，白波；2：暗影之魂，黑波
    private int screamLevel;            // 0：未获得；1：嚎叫幽灵，白吼；2：深渊尖啸，黑吼
    private int quakeLevel;             // 0：未获得；1：荒芜俯冲，白砸；2：黑暗降临，黑砸

}
