package com.example.testlifecycleapplication;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.doesNotExist;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.example.testlifecycleapplication.R.id.recyclerView;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.allOf;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.espresso.PerformException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Test class showcasing some {@link RecyclerViewActions} from Espresso.
 */
@RunWith(AndroidJUnit4.class)
public class RecyclerViewSampleTest {


     private int ResId = R.id.recyclerView;
    private RecyclerView recyclerView;


    private static final String LAST_ITEM_ID = "item: 20";


    @Rule
    public ActivityScenarioRule<MainActivity> homeActivityActivityScenarioRule2 = new ActivityScenarioRule<>(MainActivity.class);


    @Before
    public void setUpTest() {
        homeActivityActivityScenarioRule2.getScenario().onActivity(new ActivityScenario.ActivityAction<MainActivity>() {
            @Override
            public void perform(MainActivity activity) {
                recyclerView = activity.findViewById(ResId);
            }
        });
    }


    @Test
    public void recyclerView_isCorrect() {
        onView(withId(ResId)).check(matches(isDisplayed()));
    }


    @Test
    public void lastItem_NotDisplayed() {
        onView(withText(LAST_ITEM_ID)).check(doesNotExist());
    }





    @Test
    public void list_Scrolls() {
        onData(equalTo(LAST_ITEM_ID)).check(matches(isCompletelyDisplayed()));
    }


    @Test
    void row_Click() {




        onData(allOf())
                .inAdapterView(withId(R.id.recyclerView))
                .atPosition(15)
                .perform(click());





    }


}
