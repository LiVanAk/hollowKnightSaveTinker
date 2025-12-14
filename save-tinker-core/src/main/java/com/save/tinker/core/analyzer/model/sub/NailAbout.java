package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class NailAbout {
    // ★ 梦之钉
    private boolean hasDreamNail;           // 获得梦之钉
    private boolean dreamNailUpgraded;      // 觉醒梦之钉，获得1800精华后与先知对话后觉醒
    private boolean mothDeparted;           // 聆听先知的遗言，获得2400精华后与先知对话后完成，先知升天

    // ★ 骨钉技艺
    private boolean hasDashSlash;           // 强力劈砍，向骨钉大师席奥学习
    private boolean hasCyclone;             // 旋风劈砍，向骨钉大师马托学习
    private boolean hasUpwardSlash;         // 冲刺劈砍，向骨钉大师奥罗学习

    // ★ 骨钉升级
    private int nailSmithUpgrades;          // 骨钉共需升级4次

}
