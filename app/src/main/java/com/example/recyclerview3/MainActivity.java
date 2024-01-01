package com.example.recyclerview3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<contentmodel> ar = new ArrayList<>();
    RecyclerView rview;
//    public FloatingActionButton btnadd;
 //   Button addbtn=findViewById(R.id.addbtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rview=findViewById(R.id.recyclerview);
     //   addbtn=findViewById(R.id.addbtn);

//        addbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
//            }
//        });
        ar.add(new contentmodel("wasim Ahmed","wasim@gmail.com",R.drawable.img1));
        ar.add(new contentmodel("vikram choudhary","vikrampatel2141@gmail.com",R.drawable.img2));
        ar.add(new contentmodel("naresh patel","naresh@gmail.com",R.drawable.img3));
        ar.add(new contentmodel("jivan","jivan@gmail.com",R.drawable.img4));
        ar.add(new contentmodel("harish jain","harish@gmail.com",R.drawable.img5));
        ar.add(new contentmodel("dasrath patel","dasrth@gmail.com",R.drawable.img6));
        ar.add(new contentmodel("mukesh bater","wasim@gmail.com",R.drawable.img7));

        ar.add(new contentmodel("bhavesh patel","bhavesh@gmail.com",R.drawable.img8));
        ar.add(new contentmodel("geeta","geeta@gmail.com",R.drawable.img9));
        ar.add(new contentmodel("nishant","nishant@gmail.com",R.drawable.img10));
        ar.add(new contentmodel("chagan","chagan21@gmail.com",R.drawable.img11));
        ar.add(new contentmodel("virendar","viru@gmail.com",R.drawable.img12));
        ar.add(new contentmodel("dipak","pateldipak@gmail.com",R.drawable.img13));
        ar.add(new contentmodel("suresh","suresh09@gmail.com",R.drawable.img14));
        ar.add(new contentmodel("mohit","mohit233@gmail.com",R.drawable.img15));
        
        LinearLayoutManager lv=new LinearLayoutManager(getApplicationContext());
        lv.setOrientation(RecyclerView.VERTICAL);
        rview.setLayoutManager(lv);
        adapter ad=new adapter(getApplicationContext(),ar);
        rview.setAdapter(ad);
    }
}

//  btnadd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
//                Dialog dialog =new Dialog( MainActivity.this);
//                dialog.setContentView(R.layout.add_update);

//                EditText edtName =dialog.findViewById(R.id.edtname);
//                EditText edtemail =dialog.findViewById(R.id.edtemail);
//                Button btnAction =dialog.findViewById(R.id.btnaction);

//                btnAction.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        String name="",email="";
//                        if (edtName.getText().toString().equals("")) {
//                             name = edtName.getText().toString();
//                        }
//                        else {
//                            Toast.makeText(MainActivity.this, "please enter name", Toast.LENGTH_SHORT).show();
//                        }
//                        if (edtemail.getText().toString().equals("")) {
//                             email = edtemail.getText().toString();
//                        } else {
//                            Toast.makeText(MainActivity.this, "please enter email", Toast.LENGTH_SHORT).show();
//                        }

//                        ar.add(new contentmodel(name, email));
//                         adapter.notifyItemInserted(ar.size()-1);
//                        rview.scrollToPosition(ar.size()-1);
//                        dialog.dismiss();
//                    }
//                });
//                dialog.show();
//            }
//        });