package com.android.carromking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VerifyOTPResponseDataModel {
    @SerializedName("userData")
    @Expose
    private UserDataModel userData;
    @SerializedName("userWalletData")
    @Expose
    private UserWalletDataModel userWalletData;

    public UserDataModel getUserData() {
        return userData;
    }

    public void setUserData(UserDataModel userData) {
        this.userData = userData;
    }

    public UserWalletDataModel getUserWalletData() {
        return userWalletData;
    }

    public void setUserWalletData(UserWalletDataModel userWalletData) {
        this.userWalletData = userWalletData;
    }
}
