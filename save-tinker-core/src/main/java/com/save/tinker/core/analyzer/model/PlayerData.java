package com.save.tinker.core.analyzer.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class PlayerData {
    // ★ 基础能力
    @SerializedName("hasDash") private boolean hasDash;                     // 冲刺
    @SerializedName("hasWalljump") private boolean hasWalljump;             // 攀墙跳
    @SerializedName("hasDoubleJump") private boolean hasDoubleJump;         // 二段跳
    @SerializedName("hasSuperDash") private boolean hasSuperDash;           // 超冲
    @SerializedName("hasShadowDash") private boolean hasShadowDash;         // 黑冲
    @SerializedName("hasMothwingCloak") private boolean hasMothwingCloak;   //
    @SerializedName("hasCrystalHeart") private boolean hasCrystalHeart;     //

    // ★ 法术
    @SerializedName("fireballLevel") private int fireballLevel;
    @SerializedName("screamLevel") private int screamLevel;
    @SerializedName("quakeLevel") private int quakeLevel;

    // ★ 面具碎片 / 容器碎片
    @SerializedName("heartPieces") private int heartPieces;
    @SerializedName("vesselFragments") private int vesselFragments;

    // ★ 钉技
    @SerializedName("cycloneSlash") private boolean cycloneSlash;
    @SerializedName("greatSlash") private boolean greatSlash;
    @SerializedName("dashSlash") private boolean dashSlash;

    // ★ 骨钉升级
    @SerializedName("nailSmithUpgrades") private int nailSmithUpgrades;

    // ★ 守梦者
    @SerializedName("lurienDefeated") private boolean lurienDefeated;
    @SerializedName("monomonDefeated") private boolean monomonDefeated;
    @SerializedName("hegemolDefeated") private boolean hegemolDefeated;

    // ★ 梦之钉
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
