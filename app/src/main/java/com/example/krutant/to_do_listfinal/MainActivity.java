package com.example.krutant.to_do_listfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.EditText;
import android.widget.ListView;
import android.view.View;
import java.util.List;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.Toast;
import android.app.ActionBar;


public class MainActivity extends AppCompatActivity {

    private ListView lvPhone;
    Button Addbutton;
    EditText GetValue;
    EditText GetValue1;


    @Override

    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.list);


        lvPhone = (ListView)findViewById(R.id.listView);

        Addbutton = (Button) findViewById(R.id.button2);
        GetValue = (EditText) findViewById(R.id.editText5);
        GetValue1 = (EditText) findViewById(R.id.editText6);

        final List<Combine> listItem = new ArrayList<Combine>();

        Addbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               String sUsername = GetValue.getText().toString();
                String sUsername1 = GetValue1.getText().toString();
                if (sUsername.matches("") || sUsername1.matches("")  ) {
                    Toast.makeText(MainActivity.this, "You did not enter a TASK and/or DESCRIPTION", Toast.LENGTH_SHORT).show();
                    return;
                }



                Example.item = (GetValue.getText().toString());
                Example.subitem= (GetValue1.getText().toString());
                listItem.add(new Combine(Example.item, Example.subitem));
                Toast.makeText(MainActivity.this, "Item Added, Press Back or Minimize Keyboard to See", Toast.LENGTH_LONG).show();
                GetValue.setText("");
                GetValue1.setText("");
               //listAdapter adapter = new listAdapter(MainActivity.this, listItem);
               // lvPhone.setAdapter(adapter);

                }

        }

            );

        final listAdapter adapter = new listAdapter(MainActivity.this, listItem);
        lvPhone.setAdapter(adapter);

        lvPhone.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub


                listItem.remove(position);
               adapter.notifyDataSetChanged();

                Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_LONG).show();
                return true;
            }


        });

    }

}