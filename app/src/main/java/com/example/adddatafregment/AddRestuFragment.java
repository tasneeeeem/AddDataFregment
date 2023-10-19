package com.example.adddatafregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.CollapsibleActionView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Collection;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddRestuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddRestuFragment extends Fragment {
    private FirebaseServises fbs;
    private EditText etName,etPrice,etAddress, description,phone;
    private Button btnAdd;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddRestuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddRestuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddRestuFragment newInstance(String param1, String param2) {
        AddRestuFragment fragment = new AddRestuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_restu, container, false);
    }
    @Override
    public void onStart(){
        super.onStart();
        connectComponents();

    }

    private void connectComponents() {
        fbs=FirebaseServises.getInstance();
        etName=getView().findViewById(R.id.etNameAddRestuFragment);
        etPrice=getView().findViewById(R.id.etPriceAddRestuFragment);
        etAddress=getView().findViewById(R.id.etAdressAddRestuFragment);
        description=getView().findViewById(R.id.etMDescriptionAddRestuFragment);
        phone=getView().findViewById(R.id.etPPhoneAddRestuFragment);
        btnAdd=getView().findViewById(R.id.btnaddRestuFragment);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get data from screen
                String name =etName.getText().toString();
                String price =etPrice.getText().toString();
                String etMDescription =description.getText().toString();
                String Address =etAddress.getText().toString();
                String etPPhone =phone.getText().toString();
                // data validation
                if (name.trim().isEmpty()|| price.trim().isEmpty()||
                        Address.trim().isEmpty()|| etPPhone.trim().isEmpty())
                    Toast.makeText(getActivity(), "Check your data plz !", Toast.LENGTH_LONG).show();
                return;
            }
            //Add data to FirsStore
            resturant rest =new resturant (etName,etPrice,description,etAddress,phone);
          //  fbs.getFire().Collection("resturant").add(rest).addOnSuccessListner(new)

        });
    }
}