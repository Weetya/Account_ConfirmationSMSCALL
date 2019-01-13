package com.example.weedya.account_confirmation.Account_conf;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.weedya.account_confirmation.MoveTo;
import com.example.weedya.account_confirmation.Navigation.SwitchToConf;
import com.example.weedya.account_confirmation.Presenter.PinPresenter;
import com.example.weedya.account_confirmation.R;
import com.goodiebag.pinview.Pinview;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectFragment extends Fragment {

SwitchToConf navigation;
    public SelectFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_select, container, false);
        view.findViewById(R.id.call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToConf();
            }
        });
        view.findViewById(R.id.mes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchToConf();
            }
        });


        return view;
    }
    public void switchToConf() {
        navigation.switchToConf((MoveTo) getActivity());
    }
}
