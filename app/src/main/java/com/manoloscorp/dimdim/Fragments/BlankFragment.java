package com.manoloscorp.dimdim.Fragments;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manoloscorp.dimdim.R;
import com.manoloscorp.dimdim.ViewModel.ClienteViewModel;

public class BlankFragment extends Fragment {


    private ClienteViewModel clienteViewModel;

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.blank_fragment, container, false);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        clienteViewModel = ViewModelProviders.of(this).get(ClienteViewModel.class);
        // TODO: Use the ViewModel
    }

}
