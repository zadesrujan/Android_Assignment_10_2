package com.example.user.android_assignment_10_2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;

public class MainActivity extends AppCompatActivity implements Frag1.OnFragmentInteractionListener {
//here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
// call the super class onCreate to complete the creation of activity like the view hierarchy
        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design
        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
    }

    @Override
    //creating the method for interaction between the layouts
    public void onFragmentInteraction(String link) {
        //All the operation that are made by the FragmentManager happens inside a “transaction” (for that Android fragment transaction)
        // like in a database operation.First, we can get the FragmentManger using the Activity method getFragmentManager().
        FragmentManager fragmentManager=getSupportFragmentManager();
        //begins the transaction
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        //A layout defines the visual structure for a user interface, such as the UI for an activity or app widget.
        Layout1 layout1; //Fragment 1
        Layout2 layout2; //Fragment 2
        Layout3 layout3; //Fragment 3
        Layout4 layout4; //Fragment 4

        switch (link){
            case "Layout":
                //creating the layout object
                layout1 = new Layout1();
                fragmentTransaction.add(R.id.detailFragment, layout1);
                fragmentTransaction.commit();
                //When the break statement is encountered inside a loop, the loop is immediately terminated and the program control
                // resumes at the next statement following the loop. It can be used to terminate a case in the switch statement
                break;
            case "Layout1":
                layout2 = new Layout2();
                // Replace whatever is in the fragment_container view with this fragment,
                fragmentTransaction.replace(R.id.detailFragment, layout2);
                // Commit the transaction
                fragmentTransaction.commit();
                break;
            case "Layout2":
                layout3 = new Layout3();
                fragmentTransaction.replace(R.id.detailFragment, layout3);
                fragmentTransaction.commit();
                break;
            case "Layout3":
                layout4 = new Layout4();
                fragmentTransaction.replace(R.id.detailFragment, layout4);
                fragmentTransaction.commit();
                break;
        }

    }
}