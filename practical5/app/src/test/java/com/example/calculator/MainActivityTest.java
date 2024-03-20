import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.espresso.Espresso;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import com.example.calculator.MainActivity;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void calculate_addition_displaysCorrectResult() {
        onView(withId(R.id.number1Input)).perform(typeText("10"));
        onView(withId(R.id.number2Input)).perform(typeText("5"));
        onView(withId(R.id.addButton)).perform(click());
        onView(withId(R.id.calculateButton)).perform(click());
        onView(withId(R.id.resultText)).check(matches(withText("15.0")));
    }
}