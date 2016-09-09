package com.mjm.android.sunshine;

import android.nfc.NfcAdapter;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView;
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String[] forecastArray = {  "Hoje - Ensolarado - 16/30",
                                    "Sabado - Chuvoso - 12/20 ",
                                    "Domingo - Ensolarado - 20/25",
                                    "Segunda - Ensolarado - 15/30",
                                    "Terça - Nublado - 16/30",
                                    "Quarta - Nublado - 11/19",
                                    "Quinta - Ensolarado - 9/22",
                                    "Sexta - Chuvoso - 5/16" };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                weekForecast);
        ListView listview;
        listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);
        return rootView;
    }
}
