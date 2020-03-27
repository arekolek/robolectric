package org.robolectric.integration_tests.agp;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SampleFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final SampleApplication context = (SampleApplication) requireContext().getApplicationContext();
    }
}
