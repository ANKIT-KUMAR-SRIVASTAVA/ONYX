package com.as.ankitshubham.onyx;


import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

//import com.mxn.soul.flowingdrawer_core.FlowingView;
//import com.mxn.soul.flowingdrawer_core.LeftDrawerLayout;

import java.util.ArrayList;

import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class Register extends Fragment {
    EditText name, collg, email, phone;
    CheckBox e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12;
    Button send;
    String all_event;
    View view;




    public Register() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_register, container, false);
        init();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
        return view;
    }


    void init() {
        name = (EditText) view.findViewById(R.id.register_name);
        collg = (EditText) view.findViewById(R.id.register_college_name);
        email = (EditText) view.findViewById(R.id.register_email);
        phone = (EditText) view.findViewById(R.id.register_phone);
        e1 = (CheckBox) view.findViewById(R.id.checkBox1);
        e2 = (CheckBox) view.findViewById(R.id.checkBox2);
        e3 = (CheckBox) view.findViewById(R.id.checkBox3);
        e4 = (CheckBox) view.findViewById(R.id.checkBox4);
        e5 = (CheckBox) view.findViewById(R.id.checkBox5);
        e6 = (CheckBox) view.findViewById(R.id.checkBox6);
        e7 = (CheckBox) view.findViewById(R.id.checkBox7);
        e8 = (CheckBox) view.findViewById(R.id.checkBox8);
        send = (Button) view.findViewById(R.id.register_button);

    }

    protected void send() {
        String[] recipients = {"lingofreaksgcet@gmail.com"};
        String[] body={name.getText().toString(),collg.getText().toString(),
                email.getText().toString(),phone.getText().toString(),
                check()};
        SendEmailAsyncTask email1 = new SendEmailAsyncTask();
        email1.activity = this;
        email1.m = new GMailSender("lingofreaksgcet@gmail.com","lingo1234");
        email1.m.set_from(email.getText().toString());
        email1.m.setBody(body);
        email1.m.set_to(recipients);
        email1.m.set_subject("Regarding REGISTRATION");
        email1.execute();
    }

    public String check() {
        ArrayList<String> event= new ArrayList<String>();
        if(e1.isChecked()){
            event.add(e1.getText().toString());
        }
        else
        {
            event.remove(e1.getText().toString());
        }

        if(e2.isChecked())
            event.add(e2.getText().toString());

        else
            event.remove(e2.getText().toString());

        if(e3.isChecked())
            event.add(e3.getText().toString());

        else
            event.remove(e3.getText().toString());

        if(e4.isChecked())
            event.add(e4.getText().toString());

        else
            event.remove(e4.getText().toString());

        if(e5.isChecked())
            event.add(e5.getText().toString());

        else
            event.remove(e5.getText().toString());

        if(e6.isChecked())
            event.add(e6.getText().toString());

        else
            event.remove(e6.getText().toString());

        if(e7.isChecked())
            event.add(e7.getText().toString());

        else
            event.remove(e7.getText().toString());

        if(e8.isChecked())
            event.add(e8.getText().toString());

        else
            event.remove(e8.getText().toString());


        return event.toString();

    }

    public void displayMessage(String message) {
        Snackbar.make(view.findViewById(R.id.fab), message, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
class SendEmailAsyncTask extends AsyncTask<Void, Void, Boolean> {
    GMailSender m;
    Register activity;
    public int a;
    private ProgressDialog progressDialog;
    public SendEmailAsyncTask() {}

    @Override
    protected Boolean doInBackground(Void... params) {
        try {
            if (m.send()) {
                activity.displayMessage("Email sent.");
                a=1;

            } else {
                activity.displayMessage("Email failed to send.");
            }

            return true;
        } catch (AuthenticationFailedException e) {
            Log.e(SendEmailAsyncTask.class.getName(), "Bad account details");
            e.printStackTrace();
            activity.displayMessage("Authentication failed.");
            return false;
        } catch (MessagingException e) {
            Log.e(SendEmailAsyncTask.class.getName(), "Email failed");
            e.printStackTrace();
            activity.displayMessage("Email failed to send.");
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            activity.displayMessage("Unexpected error occured.");
            return false;
        }
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(activity.getActivity(),"Sending Registration Details","Please wait...",false,false);

    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        progressDialog.dismiss();
        if (a==1) {
            new SweetAlertDialog(activity.getActivity(), SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Registered!")
                    .setContentText("Thank You and All The Best!!")
                    .show();

        }
    }


}
