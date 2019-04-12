package com.fauziahrizky.shared_preference.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder>  {

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    protected abstract void onBindViewHolder(Note note);

    public class ListViewHolder extends ViewHolder {

        TextView titleText;
        TextView dateText;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            titleText = itemView.findViewById(R.id.text_title);
            dateText = itemView.findViewById(R.id.text_date);
        }

        @Override
        protected void onBindViewHolder(Note note) {
            titleText.setText(note.getTitle());
            dateText.setText(note.getFormattedDate());
        }
}
