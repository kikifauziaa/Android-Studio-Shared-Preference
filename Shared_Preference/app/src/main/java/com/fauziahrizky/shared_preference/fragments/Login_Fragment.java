package com.fauziahrizky.shared_preference.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.fauziahrizky.shared_preference.R;

public class Login_Fragment extends Fragment {

    private OnLoginFragmentListener listener;

    public Login_Fragment() {
        // Required empty public constructor
    }

    public interface OnLoginFragmentListener{
        void OnLoginClicked(View view, String username, String password);
    }

    public void setListener(OnLoginFragmentListener listener) {
        this.listener = listener;
    }

    public OnLoginFragmentListener getListener() {
        return listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        TextView usernametext = view.findViewById(R.id.text_username);
        TextView passwordtext = view.findViewById(R.id.text_password);
        Button loginButton = view.findViewById(R.id.button_login);
        return view;
    }
}
