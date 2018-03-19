package com.wmeimob.custom.system.entity;

import java.io.Serializable;

/**
 * Created by xiangzhao on 2016/2/2.
 */
public class ZTreeNodeArray implements Serializable {

    private ZTreeNode[] nodes;


    public ZTreeNode[] getNodes() {
        return nodes;
    }

    public void setNodes(ZTreeNode[] nodes) {
        this.nodes = nodes;
    }

//    public ZTreeNodeArray(ZTreeNode[] zTreeNodes) {
//        this.nodes = zTreeNodes;
//    }


}
