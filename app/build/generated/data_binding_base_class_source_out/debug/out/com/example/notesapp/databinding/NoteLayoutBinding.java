// Generated by data binding compiler. Do not edit!
package com.example.notesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.notesapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NoteLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView noteDesc;

  @NonNull
  public final TextView noteTitle;

  protected NoteLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView noteDesc, TextView noteTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.noteDesc = noteDesc;
    this.noteTitle = noteTitle;
  }

  @NonNull
  public static NoteLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.note_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NoteLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NoteLayoutBinding>inflateInternal(inflater, R.layout.note_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NoteLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.note_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NoteLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NoteLayoutBinding>inflateInternal(inflater, R.layout.note_layout, null, false, component);
  }

  public static NoteLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NoteLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (NoteLayoutBinding)bind(component, view, R.layout.note_layout);
  }
}
