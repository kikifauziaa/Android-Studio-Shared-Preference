package com.fauziahrizky.shared_preference.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fauziahrizky.shared_preference.R;
import com.fauziahrizky.shared_preference.adapters.NoteAdapter;

public class NoteFragment extends Fragment {

    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;
    private OnNoteFragmentListener listener;

    public NoteFragment() {
    }

    public interface OnNoteFragmentListener{
        void
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note, container, false);
    }


}
