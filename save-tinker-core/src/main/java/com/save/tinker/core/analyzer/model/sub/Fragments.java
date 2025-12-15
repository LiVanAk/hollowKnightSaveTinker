package com.save.tinker.core.analyzer.model.sub;

import lombok.Data;

@Data
public class Fragments {

    /*
     * 面具碎片 / 容器碎片
     */

    // 当前拥有的碎片数量
    private int heartPieces;
    private int vesselFragments;

    /*
     * 面具碎片
     */

    // 斯莱商店
    private boolean slyShellFrag1;  // 150吉欧
    private boolean slyShellFrag2;  // 500吉欧
    private boolean slyShellFrag3;  // 800吉欧，拿到斯莱的地下室钥匙后
    private boolean slyShellFrag4;  // 1500吉欧，同上

    /*
     * 容器碎片
     */

    // 斯莱商店
    private boolean slyVesselFrag1;
    private boolean slyVesselFrag2;
    private boolean slyVesselFrag3;
    private boolean slyVesselFrag4;
}
