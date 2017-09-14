package com.jonmid.programacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jonmid.programacion.Models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView firstname;
    TextView lastname;
    TextView tv_list_users;
    List<Person> listPerson = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (TextView) findViewById(R.id.tv_firstname);
        lastname = (TextView) findViewById(R.id.tv_lastname);
        tv_list_users = (TextView) findViewById(R.id.tv_list_users);
    }

    public void createPerson(View view){
        Person user = new Person();
        user.setFirst_name(firstname.getText().toString());
        user.setLast_name(lastname.getText().toString());
        listPerson.add(user);
    }

    public void listUsers(View view){
        tv_list_users.setText("");
        for (Person a : listPerson){
            tv_list_users.append("Nombre: "+a.getFirst_name()+" - Apellido: "+a.getLast_name()+"\n\n\n");
        }
    }
}
