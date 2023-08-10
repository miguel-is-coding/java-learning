package org.seconds_and_minutes_challenge;

public class SecondsConverter {
    public String getDurationString(int seconds)
            throws SecondsAreNegativeException, MinutesAreNegativeException, SecondsValueIsNotValidException {
        if (seconds < 0) {
            throw new SecondsAreNegativeException();
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public String getDurationString(int minutes, int seconds)
            throws MinutesAreNegativeException, SecondsValueIsNotValidException {
        if (minutes < 0) {
            throw new MinutesAreNegativeException();
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecondsValueIsNotValidException();
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return String.format("%dh %dm %ds", hours, remainingMinutes, seconds);
    }
}
