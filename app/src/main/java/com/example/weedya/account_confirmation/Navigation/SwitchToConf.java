package com.example.weedya.account_confirmation.Navigation;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.example.weedya.account_confirmation.Account_conf.ConfirmationFragment;
import com.example.weedya.account_confirmation.MoveTo;

public class SwitchToConf {
    public void switchToConf(MoveTo moveTo) {
        moveTo.moveTo(new ConfirmationFragment());
    }

    public void exitApplication(Activity activity) {
        activity.finish();
    }



}



