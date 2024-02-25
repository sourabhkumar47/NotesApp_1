package com.example.notesapp.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.notesapp.R;

public class EditNoteFragmentDirections {
  private EditNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionEditNoteFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_editNoteFragment_to_homeFragment);
  }
}
