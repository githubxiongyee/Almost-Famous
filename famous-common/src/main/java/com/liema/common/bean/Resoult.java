package com.liema.common.bean;

import com.liema.common.exception.ErrorCode;
import com.liema.common.global.KeyPrefix;

import java.util.HashMap;

public class Resoult extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public Resoult() {
    }

    public Resoult(int cmd) {
        put("cmd", cmd);
        put("code", 0);
        put("msg", "success");
    }

    public static Resoult error(int cmd, ErrorCode code, String msg) {
        Resoult r = new Resoult(cmd);
        r.put("code", code.value());
        r.put("msg", msg);
        return r;
    }

    public static Resoult ok(int cmd) {
        return new Resoult(cmd);
    }

    @Override
    public Resoult put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public Resoult responseBody(Object value) {
        super.put(KeyPrefix.RESPONSE, value);
        return this;
    }

}
