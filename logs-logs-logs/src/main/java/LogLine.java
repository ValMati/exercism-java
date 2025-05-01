import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {

    private static final Pattern pattern = Pattern.compile("\\[(.*?)]:\\s*(.*)");

    private final LogLevel logLevel;
    private final String message;

    public LogLine(String logLine) {
        Matcher matcher = pattern.matcher(logLine);
        if (matcher.matches()) {
            logLevel = LogLevel.calculateLogLevel(matcher.group(1));
            message = matcher.group(2);
        } else {
            logLevel = LogLevel.UNKNOWN;
            message = "UNKNOWN";
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", logLevel.getEncodedLevel(), message);
    }
}
