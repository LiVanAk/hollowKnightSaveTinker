package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class Equipments {

    /*
     * 装备，在获得装备后获取相应能力，每个占有2%完成度，共14%
     */

    private boolean hasDash;                // 冲刺，获得蛾翼披风
    private boolean hasWalljump;            // 攀墙跳，获得螳螂爪
    private boolean hasDoubleJump;          // 二段跳，获得帝王之翼
    private boolean hasSuperDash;           // 超冲，获得水晶之心
    private boolean hasShadowDash;          // 黑冲，获得暗影披风
    private boolean hasAcidArmour;          // 酸泳，获得伊思玛的眼泪
    private boolean hasKingsBrand;          // 进深渊，获得王之印记

}
