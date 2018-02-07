package com.example.user.android_assignment_10_2;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Frag1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */

public class Frag1 extends Fragment {

    //Fragment represent a behavior or a portion of user in an activity
    private OnFragmentInteractionListener mListener;

    public Frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //creates and returns the hierarchy associated with the fragment
        //the layout inflater object can be used to inflate any views in the fragment
        //the view group contains views and is base class of layouts and views containers
        // Inflate the layout for this fragment
        //View occupies a rectangular area on the screen and is responsible for drawing and event handling
        View view = inflater.inflate(R.layout.frag1, null, false);
        //Containers pour a collection of widgets (and possibly child containers) into specific structures you like. If you want a form with labels on the left and fields on the right, you need a container
        //attaches the views to their parent (includes them in the parent hierarchy), so any touch event that the views recieve will also be transfered to parent view. Now it's upto the parent whether it wants to entertain those events or ignore them. if set
        // to false, they are not added as direct children of the parent and the parent doesn't recieve any touch events from the views
        Button button = (Button) view.findViewById(R.id.button);
        //creating the button view
        Button button1 = (Button) view.findViewById(R.id.button2);
        Button button2 = (Button)view.findViewById(R.id.button3);
        Button button3 = (Button)view.findViewById(R.id.button4);

        //we create button click listener so that once we click on the buttton it will direct to the respective layout
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonPressed("Layout");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonPressed("Layout1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonPressed("Layout2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonPressed("Layout3");
            }
        });
        return view;

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String link);
    }
}
