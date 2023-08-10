package unit.seconds_and_minutes_challenge;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.seconds_and_minutes_challenge.MinutesAreNegativeException;
import org.seconds_and_minutes_challenge.SecondsAreNegativeException;
import org.seconds_and_minutes_challenge.SecondsConverter;
import org.seconds_and_minutes_challenge.SecondsValueIsNotValidException;

public class TestSecondsConverterShould
{
    @Test(expected = SecondsAreNegativeException.class)
    public void not_allow_negative_seconds()
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int seconds = -5;

        converter.getDurationString(seconds);
    }

    @Test(expected = MinutesAreNegativeException.class)
    public void not_allow_negative_minutes()
            throws MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int minutes = -5;

        converter.getDurationString(minutes, 30);
    }

    @Test(expected = SecondsValueIsNotValidException.class)
    public void not_allow_seconds_greater_than_sixty_seconds()
            throws MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();

        converter.getDurationString(1, 70);
    }

    @Test
    public void keep_seconds_as_seconds_if_is_not_more_than_one_minute()
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int seconds = 55;

        Assert.assertEquals("0h 0m 55s", converter.getDurationString(seconds));
    }

    @Test
    public void convert_seconds_as_minute_when_is_more_than_one_minute()
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int seconds = 100;

        Assert.assertEquals("0h 1m 40s", converter.getDurationString(seconds));
    }

    @Test
    public void convert_seconds_as_hours_when_is_exactly_sixty_minutes()
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int seconds = 3600;

        Assert.assertEquals("1h 0m 0s", converter.getDurationString(seconds));
    }

    @Test
    public void convert_seconds_as_hours_minutes_and_seconds_when_is_more_than_sixty_minutes()
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        SecondsConverter converter = new SecondsConverter();
        int seconds = 3755;

        Assert.assertEquals("1h 2m 35s", converter.getDurationString(seconds));
    }
}
