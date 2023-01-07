package com.acr.animecommunityroom.Models;

import com.google.gson.annotations.SerializedName;

public class ValueNoData {
    @SerializedName("success")
    private int success;
    private String message;

    public int getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
