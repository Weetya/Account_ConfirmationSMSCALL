package com.example.weedya.account_confirmation.Account_conf;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.weedya.account_confirmation.MainActivity;
import com.example.weedya.account_confirmation.Navigation.SwitchToConf;
import com.example.weedya.account_confirmation.Presenter.PinPresenter;
import com.example.weedya.account_confirmation.R;
import com.example.weedya.account_confirmation.Repository.PinReposit;
import com.goodiebag.pinview.Pinview;


public class ConfirmationFragment extends Fragment {
    Pinview pin;
    private PinPresenter authentication;
    public ConfirmationFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        authentication = new PinPresenter(new SwitchToConf(), new PinReposit());
        View view = inflater.inflate(R.layout.fragment_select, container, false);
        return view;
    }

}