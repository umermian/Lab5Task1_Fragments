package com.example.popie.lab5task1_fragments.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.popie.lab5task1_fragments.ActivityA;
import com.example.popie.lab5task1_fragments.ActivityB;
import com.example.popie.lab5task1_fragments.R;


public class SampleFragment extends Fragment {

    EditText text;
    Button button;
    private Communicator communicator;

    public SampleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_sample, container, false);
        text = v.findViewById(R.id.editText);
        button = v.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        communicator.supplyData(text.getText().toString());
                    }
                }
        );
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ActivityA || context instanceof ActivityB) {
            communicator = (Communicator) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        communicator = null;
    }


    public interface Communicator {

        void supplyData(String data);
    }
}
