package com.example.notesapp.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.notesapp.R;
import com.example.notesapp.model.Note;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToAddNoteFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_addNoteFragment);
  }

  @NonNull
  public static ActionHomeFragmentToEditNoteFragment actionHomeFragmentToEditNoteFragment(
      @Nullable Note note) {
    return new ActionHomeFragmentToEditNoteFragment(note);
  }

  public static class ActionHomeFragmentToEditNoteFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToEditNoteFragment(@Nullable Note note) {
      this.arguments.put("note", note);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToEditNoteFragment setNote(@Nullable Note note) {
      this.arguments.put("note", note);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("note")) {
        Note note = (Note) arguments.get("note");
        if (Parcelable.class.isAssignableFrom(Note.class) || note == null) {
          __result.putParcelable("note", Parcelable.class.cast(note));
        } else if (Serializable.class.isAssignableFrom(Note.class)) {
          __result.putSerializable("note", Serializable.class.cast(note));
        } else {
          throw new UnsupportedOperationException(Note.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_homeFragment_to_editNoteFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Note getNote() {
      return (Note) arguments.get("note");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToEditNoteFragment that = (ActionHomeFragmentToEditNoteFragment) object;
      if (arguments.containsKey("note") != that.arguments.containsKey("note")) {
        return false;
      }
      if (getNote() != null ? !getNote().equals(that.getNote()) : that.getNote() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToEditNoteFragment(actionId=" + getActionId() + "){"
          + "note=" + getNote()
          + "}";
    }
  }
}
