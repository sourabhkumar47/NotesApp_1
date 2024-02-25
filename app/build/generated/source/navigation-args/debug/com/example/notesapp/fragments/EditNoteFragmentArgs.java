package com.example.notesapp.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.example.notesapp.model.Note;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditNoteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditNoteFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private EditNoteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static EditNoteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditNoteFragmentArgs __result = new EditNoteFragmentArgs();
    bundle.setClassLoader(EditNoteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("note")) {
      Note note;
      if (Parcelable.class.isAssignableFrom(Note.class) || Serializable.class.isAssignableFrom(Note.class)) {
        note = (Note) bundle.get("note");
      } else {
        throw new UnsupportedOperationException(Note.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("note", note);
    } else {
      throw new IllegalArgumentException("Required argument \"note\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditNoteFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    EditNoteFragmentArgs __result = new EditNoteFragmentArgs();
    if (savedStateHandle.contains("note")) {
      Note note;
      note = savedStateHandle.get("note");
      __result.arguments.put("note", note);
    } else {
      throw new IllegalArgumentException("Required argument \"note\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public Note getNote() {
    return (Note) arguments.get("note");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("note")) {
      Note note = (Note) arguments.get("note");
      if (Parcelable.class.isAssignableFrom(Note.class) || note == null) {
        __result.set("note", Parcelable.class.cast(note));
      } else if (Serializable.class.isAssignableFrom(Note.class)) {
        __result.set("note", Serializable.class.cast(note));
      } else {
        throw new UnsupportedOperationException(Note.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditNoteFragmentArgs that = (EditNoteFragmentArgs) object;
    if (arguments.containsKey("note") != that.arguments.containsKey("note")) {
      return false;
    }
    if (getNote() != null ? !getNote().equals(that.getNote()) : that.getNote() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditNoteFragmentArgs{"
        + "note=" + getNote()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull EditNoteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@Nullable Note note) {
      this.arguments.put("note", note);
    }

    @NonNull
    public EditNoteFragmentArgs build() {
      EditNoteFragmentArgs result = new EditNoteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNote(@Nullable Note note) {
      this.arguments.put("note", note);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public Note getNote() {
      return (Note) arguments.get("note");
    }
  }
}
