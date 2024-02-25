package com.example.notesapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.notesapp.databinding.ActivityMainBindingImpl;
import com.example.notesapp.databinding.FragmentAddNoteBindingImpl;
import com.example.notesapp.databinding.FragmentEditNoteBindingImpl;
import com.example.notesapp.databinding.FragmentHomeBindingImpl;
import com.example.notesapp.databinding.NoteLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTADDNOTE = 2;

  private static final int LAYOUT_FRAGMENTEDITNOTE = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_NOTELAYOUT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.notesapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.notesapp.R.layout.fragment_add_note, LAYOUT_FRAGMENTADDNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.notesapp.R.layout.fragment_edit_note, LAYOUT_FRAGMENTEDITNOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.notesapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.notesapp.R.layout.note_layout, LAYOUT_NOTELAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTADDNOTE: {
          if ("layout/fragment_add_note_0".equals(tag)) {
            return new FragmentAddNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_note is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTEDITNOTE: {
          if ("layout/fragment_edit_note_0".equals(tag)) {
            return new FragmentEditNoteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_edit_note is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_NOTELAYOUT: {
          if ("layout/note_layout_0".equals(tag)) {
            return new NoteLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for note_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.notesapp.R.layout.activity_main);
      sKeys.put("layout/fragment_add_note_0", com.example.notesapp.R.layout.fragment_add_note);
      sKeys.put("layout/fragment_edit_note_0", com.example.notesapp.R.layout.fragment_edit_note);
      sKeys.put("layout/fragment_home_0", com.example.notesapp.R.layout.fragment_home);
      sKeys.put("layout/note_layout_0", com.example.notesapp.R.layout.note_layout);
    }
  }
}
