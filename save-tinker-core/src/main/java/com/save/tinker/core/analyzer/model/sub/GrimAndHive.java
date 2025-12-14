package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class GrimAndHive {
    // ★ 格林剧团
    private boolean killedGrimm;                    // 击败格林团长
    private boolean killedNightmareGrimm;           // 击败梦魇之王格林
    private boolean destroyedNightmareLantern;      // 摧毁梦魇之灯，放逐格林剧团

    // ★ 生命血（更新了蜂巢和蓝血）
    private boolean killedHiveKnight;               // 击败蜂巢骑士
}
