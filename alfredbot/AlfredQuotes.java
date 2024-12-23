import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    // Basic greeting
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    // Guest greeting
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // Ninja Bonus: Overloaded guestGreeting with day period
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // Sensei Bonus: Overloaded guestGreeting using Date object
    public String guestGreeting() {
        Date now = new Date();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(hourFormat.format(now));
        String dayPeriod;

        if (hour >= 5 && hour < 12) {
            dayPeriod = "morning";
        } else if (hour >= 12 && hour < 17) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    // Date announcement
    public String dateAnnouncement() {
        Date now = new Date();
        return "It is currently " + now.toString() + ".";
    }

    // Respond before Alexis
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // Sensei Bonus: Custom Alfred quote using String methods
    public String customQuote(String mood) {
        if (mood.equalsIgnoreCase("angry")) {
            return "How dare they?! I'm utterly flabbergasted!".toUpperCase();
        } else if (mood.equalsIgnoreCase("calm")) {
            return "Everything will be fine. Let us remain composed.";
        } else {
            return "I am not quite sure how to respond to that mood.";
        }
    }
}
