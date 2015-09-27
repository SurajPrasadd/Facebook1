package com.suraj.facebook1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FullscreenActivity extends Activity implements OnClickListener {
	
	EditText userName,password;
	Button login;
	String u="suraj";
	String p="prasad";
	String inputUser;
	String inputPass;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        
         userName =(EditText)findViewById(R.id.editTextUser);
         password=(EditText) findViewById(R.id.editTextPass);
         
         login=(Button) findViewById(R.id.buttonLogin);
         login.setOnClickListener(this);}
    
    
 /*public void login1(View arg0) {
		inputUser=userName.getText().toString();
    	inputPass=password.getText().toString();
    	
    	if(u.equalsIgnoreCase(inputUser)&&p.equalsIgnoreCase(inputPass)){
    		Toast.makeText(this, "login pass", Toast.LENGTH_SHORT).show();
    	}
    	else{Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();}
		
	}
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.fullscreen, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		inputUser=userName.getText().toString();
    	inputPass=password.getText().toString();
    	
    	if(u.equalsIgnoreCase(inputUser)&&p.equalsIgnoreCase(inputPass)){
    		Toast.makeText(this, "login pass", Toast.LENGTH_SHORT).show();
    	}
    	else{Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();}
		
	}


}
