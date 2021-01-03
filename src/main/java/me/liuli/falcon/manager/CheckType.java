package me.liuli.falcon.manager;

import com.alibaba.fastjson.JSONObject;

public enum CheckType {
    KILLAURA(CheckCategory.COMBAT),
    KA_BOT(CheckCategory.COMBAT),
    KA_NOSWING(CheckCategory.COMBAT),
    CRITICALS(CheckCategory.COMBAT),
    ILLEGAL_INTERACT(CheckCategory.WORLD);

    public boolean enable=false;
    public int addVl=1;
    public CheckCategory category;
    public JSONObject otherData=new JSONObject();
    private CheckType(CheckCategory category){
        this.category=category;
    }
}