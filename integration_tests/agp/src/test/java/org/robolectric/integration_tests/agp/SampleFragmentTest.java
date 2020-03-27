package org.robolectric.integration_tests.agp;

import androidx.fragment.app.testing.FragmentScenario;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class SampleFragmentTest {

    @Test
    public void testApplicationCanBeDeclaredInADependencyLibrary() {
        FragmentScenario.launchInContainer(SampleFragment.class);
    }
}
