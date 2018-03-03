package accountsguy.net;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import accountsguy.net.loginscreen.MainActivity;
import accountsguy.net.loginscreen.R;

import static org.junit.Assert.*;

/**
 * Created by AccountsGuy.Net on 27/02/2018.
 */

// All the code in the class will be called automatically by andriod in line of series.

// This will the Android to run this class with AndroidJUnit4 class.
@RunWith(AndroidJUnit4.class)
public class EmailValidatorTest {
    // This Rule will tell the Test Case to test the MainAcitivity.class and this rule will be
    // ececuted before all annotation in the Test Cases.
    // We need to declare Rules before writing Annotations like Test, Before, or After
    @Rule
    public ActivityTestRule<MainActivity> maRule = new ActivityTestRule<>(MainActivity.class);
    public ActivityTestRule<EmailValidator> emvRule = new ActivityTestRule<>(EmailValidator.class);

    @Test
    public void testmailid()
    {
        onView(withId(R.id.email)).perform(typeText("advice@accountsguy.net"),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("accountsguy.net"),closeSoftKeyboard());
        onView(withText("login")).perform(click());
        assertTrue(EmailValidator.isValidEmail("advice@accountsguy.net"));
//        onView(withId(R.id.result)).check(matches(withText("Welcome to AccoutsGuy.Net")));
    }


}