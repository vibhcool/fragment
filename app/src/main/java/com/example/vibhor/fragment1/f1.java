package com.example.vibhor.fragment1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Fragment;
import android.widget.Toast;

public class f1 extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View InputFragmentView = inflater.inflate(R.layout.fragment_f1, container, false);

        Button b1 = (Button) InputFragmentView.findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getActivity().getApplicationContext(), "Test", Toast.LENGTH_LONG).show();

/*             //errors and errors
                fr2 fragment = new  fr2();
                //final Bundle bundle = new Bundle();
                LinearLayout abTitle = (LinearLayout) getView().findViewById(R.id.ll2);
                //abTitle.setBackgroundResource(R.color.accent_material_dark);
                Bundle b = getIntent().getExtras();
                abTitle.putExtra("Color" , "Red");
                Fragment_2 f2 = new Fragment_2();
                f2.setArguments(b);
                */
            }
        });

        return InputFragmentView;
    }


}
