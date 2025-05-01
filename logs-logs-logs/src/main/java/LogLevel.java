import java.util.Arrays;

public enum LogLevel {
    UNKNOWN("", 0),
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private final String abbreviation;
    private final int encodedLevel;

    LogLevel(String abbreviation, int encodedLevel) {
        this.abbreviation = abbreviation;
        this.encodedLevel = encodedLevel;
    }

    public static LogLevel calculateLogLevel(String abbreviation) {
        return Arrays
                .stream(LogLevel.values())
                .filter(l -> l.abbreviation.equals(abbreviation))
                .findFirst()
                .orElse(LogLevel.UNKNOWN);
    }

    public int getEncodedLevel() {
        return encodedLevel;
    }
}
