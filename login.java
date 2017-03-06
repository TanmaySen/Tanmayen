package com.bluetooth.bluetooth;


import android.content.Intent;

import android.os.Bundle;

import android.support.v7.app.ActionBarActivity;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import android.widget.Toast;

/**
 * Created by SST on 16/2/17.
 */

public class login extends ActionBarActivity 
{
    
TextView txt_username;
 
   TextView txt_password;

    Button btn_login;
    
@Override

    protected void onCreate(Bundle savedInstanceState)
 
   {
       
         super.onCreate(savedInstanceState);
     
         setContentView(R.layout.login);
  
         Intent newint = getIntent();

         btn_login=(Button)findViewById(R.id.btn_login);

         txt_username = (TextView)findViewById(R.id.txt_username);
 
         txt_password = (TextView)findViewById(R.id.txt_password);


         btn_login.setOnClickListener(new View.OnClickListener()); 
      {
            
      @Override
          
      public void onClick(View v) 
        {
                
          checkLogin();    //method to turn on
          
          }
       
         }    
       }
   
        public void  checkLogin()
   
         {
        
           String username=txt_username.getText().toString();
 
           String password=txt_password.getText().toString();
      
          if(username.equals("sharda") && password.equals("sharda@123"))
      
          {
         
            Intent i = new Intent(login.this, MainActivity.class);
       
            startActivity(i);

            finish();
       
          }
      
          else
   
         {
         
          msg("Something Wrong");
    
          }
   
         }
  
       private void msg(String s)
  
       {
        
       Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
 
   }


}
