package com.example.vibhor.fragment1;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.graphics.Color;

public class fr2 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View InputFragmentView = inflater.inflate(R.layout.fragment_fr2, container, false);

            Button b2 = (Button) InputFragmentView.findViewById(R.id.b2);


          b2.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                    Toast.makeText(getActivity().getApplicationContext(), "Test", Toast.LENGTH_LONG).show();
                    /* //errors and errors
                    LinearLayout abTitle = (LinearLayout) getView().findViewById(R.id.ll2);
                    abTitle.setBackgroundResource(R.color.material_blue_grey_800);
*/
                }
            });

            return InputFragmentView;
    }

    public void fa1(View view)
    {
        LinearLayout abTitle = (LinearLayout) getView().findViewById(R.id.ll1);

        abTitle.setBackgroundColor(Color.parseColor("00ff77"));


    }

}
