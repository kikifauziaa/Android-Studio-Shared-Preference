package com.fauziahrizky.shared_preference;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.fauziahrizky.shared_preference.fragments.Login_Fragment;
import com.fauziahrizky.shared_preference.fragments.NoteFragment;
import com.fauziahrizky.shared_preference.models.User;

public class MainActivity extends AppCompatActivity implements Login_Fragment.OnLoginFragmentListener {

    Session session;
    Settings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        settings = new Settings(this);
        session = new Session(settings);
        addFragment();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void addFragment(){
        Fragment fragment = null;
        if(session.isLogin()){
            fragment = new NoteFragment();

        }else{
            fragment = new Login_Fragment();
            ((Login_Fragment) fragment).setListener(this);
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
    }

  /*  public void OnLoginButtonClicked(View view, String username, String password){
        User user = session.doLogin(username, password);
        String message = "authetication failed!";
        if(user != null){
            message = "Welcome " + ((User) user).getUsername();
            session.setUser(user.getUsername());
            addFragment();
        }
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }*/

    @Override
    public void OnLoginClicked(View view, String username, String password) {
        User user = session.doLogin(username, password);
        String message = "authetication failed!";
        if(user != null){
            message = "Welcome " + ((User) user).getUsername();
            session.setUser(user.getUsername());
            addFragment();
        }
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show();
    }
}
