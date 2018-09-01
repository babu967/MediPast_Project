package com.codex.medipast.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.codex.medipast.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddDoctorFragment extends Fragment {

    EditText doctorName, doctorDetail, doctorAppointment, doctorPhone, doctorEmail;


    public AddDoctorFragment() {
        // Required empty public constructor

    }









    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_doctor, container, false);


    }

}
