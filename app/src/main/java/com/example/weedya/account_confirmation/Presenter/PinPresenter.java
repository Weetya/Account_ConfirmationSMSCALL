package com.example.weedya.account_confirmation.Presenter;

import com.example.weedya.account_confirmation.MoveTo;
import com.example.weedya.account_confirmation.Navigation.SwitchToConf;
import com.example.weedya.account_confirmation.Repository.PinReposit;

public class PinPresenter {
    private SwitchToConf navigation;
    private PinReposit repository;

    public PinPresenter(SwitchToConf navigation, PinReposit repository) {
        this.navigation = navigation;
        this.repository = repository;
    }


    public boolean checkPin(int pin) {
        return repository.getPinCode() == pin;
    }

    public boolean authenticate(int pin, MoveTo moveTo) throws IllegalArgumentException {
        if (checkPin(pin)) {
            navigation.switchToConf(moveTo);
            return true;
        }
        else
            return false;
    }
}
