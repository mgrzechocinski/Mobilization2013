package net.grzechocinski.android.mobilization3;

import android.app.Activity;
import android.widget.TextView;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.*;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void shouldDisplayPackageName() throws Exception {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        TextView results = (TextView) activity.findViewById(R.id.package_name);
        String resultsText = results.getText().toString();
        Assertions.assertThat(resultsText).startsWith("Package name:");
    }
}
