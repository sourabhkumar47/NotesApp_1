package com.example.notesapp.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.notesapp.R;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAddNoteFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_addNoteFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToEditNoteFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_editNoteFragment);
  }
}
