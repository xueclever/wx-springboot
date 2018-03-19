package com.wmeimob.custom.system.entity;

import java.io.Serializable;

/**
 * ztree节点对象
 * Created by xiangzhao on 2016/2/2.
 */
public class ZTreeNode implements Serializable {

    private Integer id;

    private Integer pId;

    private String name;

    private boolean checked;

    private boolean chkDisabled;

    public boolean isChkDisabled() {
        return chkDisabled;
    }

    public void setChkDisabled(boolean chkDisabled) {
        this.chkDisabled = chkDisabled;
    }

    public ZTreeNode() {
        super();
    }

    public ZTreeNode(Integer id, Integer pId, String name, boolean checked, boolean chkDisabled, boolean open) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.checked = checked;
        this.chkDisabled = chkDisabled;
        this.open = open;
    }

    public ZTreeNode(Integer id, boolean checked) {
        this.id = id;
        this.checked = checked;
    }

    private boolean open;

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
