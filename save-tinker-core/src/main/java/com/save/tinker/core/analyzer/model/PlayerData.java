package com.save.tinker.core.analyzer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PlayerData {
    // ★ 能力，在获得装备后获取相应能力
    @SerializedName("hasDash") private boolean hasDash;                     // 冲刺，获得蛾翼披风
    @SerializedName("hasWalljump") private boolean hasWalljump;             // 攀墙跳，获得螳螂爪
    @SerializedName("hasDoubleJump") private boolean hasDoubleJump;         // 二段跳，获得帝王之翼
    @SerializedName("hasSuperDash") private boolean hasSuperDash;           // 超冲，获得水晶之心
    @SerializedName("hasShadowDash") private boolean hasShadowDash;         // 黑冲，获得暗影披风
    @SerializedName("hasAcidArmour") private boolean hasAcidArmour;         // 酸泳，获得伊思玛的眼泪
    @SerializedName("hasCrystalHeart") private boolean hasKingsBrand;       // 进深渊，获得王之印记

    // ★ 法术
    @SerializedName("fireballLevel") private int fireballLevel;     // 0：未获得；1：复仇之魂，白波；2：暗影之魂，黑波
    @SerializedName("screamLevel") private int screamLevel;         // 0：未获得；1：嚎叫幽灵，白吼；2：深渊尖啸，黑吼
    @SerializedName("quakeLevel") private int quakeLevel;           // 0：未获得；1：荒芜俯冲，白砸；2：黑暗降临，黑砸

    // ★ 面具碎片 / 容器碎片  （仅能查看当前拥有的碎片数量）
    @SerializedName("heartPieces") private int heartPieces;
    @SerializedName("vesselFragments") private int vesselFragments;

    // ★ 骨钉技艺
    @SerializedName("hasCyclone") private boolean hasCyclone;           // 强力劈砍
    @SerializedName("hasDashSlash") private boolean hasDashSlash;       // 冲刺劈砍
    @SerializedName("hasUpwardSlash") private boolean hasUpwardSlash;   // 旋风劈砍

    // ★ 骨钉升级
    @SerializedName("nailSmithUpgrades") private int nailSmithUpgrades; // 骨钉共需升级4次

    // ★ 守梦者
    @SerializedName("lurienDefeated") private boolean lurienDefeated;   // 守望者卢瑞恩
    @SerializedName("monomonDefeated") private boolean monomonDefeated; // 教师莫诺蒙
    @SerializedName("hegemolDefeated") private boolean hegemolDefeated; // 野兽赫拉

    // ★ 梦之钉
    @SerializedName("hasDreamNail") private boolean hasDreamNail;           // 获得梦之钉
    @SerializedName("dreamNailUpgraded") private boolean dreamNailUpgraded;

    // ★ 战士之梦
    @SerializedName("xeroDefeated") private int xeroDefeated;
    @SerializedName("elderHuDefeated") private int elderHuDefeated;
    @SerializedName("noEyesDefeated") private int noEyesDefeated;
    @SerializedName("galienDefeated") private int galienDefeated;

    // ★ 神居
    @SerializedName("bossDoorStateTier1") private BossDoorState bossDoorStateTier1;
    @SerializedName("bossDoorStateTier2") private BossDoorState bossDoorStateTier2;
    @SerializedName("bossDoorStateTier3") private BossDoorState bossDoorStateTier3;
    @SerializedName("bossDoorStateTier4") private BossDoorState bossDoorStateTier4;

    // ★ 护符
    @SerializedName("charmsOwned") private int charmsOwned;

    // ★ 愚人斗兽场
    @SerializedName("colosseumBronzeCompleted") private boolean colosseumBronzeCompleted;
    @SerializedName("colosseumSilverCompleted") private boolean colosseumSilverCompleted;
    @SerializedName("colosseumGoldCompleted") private boolean colosseumGoldCompleted;

    // ★ 格林剧团
    @SerializedName("nightmareLanternLit") private boolean nightmareLanternLit;
    @SerializedName("grimmChildLevel") private int grimmChildLevel;

    @Data
    public class BossDoorState {
        @SerializedName("completed")
        private boolean completed;

        @SerializedName("unlocked")
        private boolean unlocked;
    }
}
