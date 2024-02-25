package com.example.notesapp.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.notesapp.R;

public class AddNoteFragmentDirections {
  private AddNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddNoteFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_addNoteFragment_to_homeFragment);
  }
}
