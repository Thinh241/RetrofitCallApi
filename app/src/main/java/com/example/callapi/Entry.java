package com.example.callapi;

import com.google.gson.annotations.SerializedName;

public class Entry {
    @SerializedName("USDVND")
    private Float usdVnd;

    public Float getUsdVnd() {
        return usdVnd;
    }

    public void setUsdVnd(Float usdVnd) {
        this.usdVnd = usdVnd;
    }
}
