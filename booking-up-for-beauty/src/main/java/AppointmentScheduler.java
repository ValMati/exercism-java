import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    private static final DateTimeFormatter SCHEDULE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_DATE_FORMATTER = DateTimeFormatter.ofPattern("EEEE, MMMM d, y");
    private static final DateTimeFormatter DESCRIPTION_TIME_FORMATTER = DateTimeFormatter.ofPattern("h:mm a");

    private static final int AFTERNOON_STARTING_HOUR = 12;
    private static final int AFTERNOON_FINISHING_HOUR = 18;

    private static final int ANNIVERSARY_MONTH = 9;
    private static final int ANNIVERSARY_DAY = 15;

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, SCHEDULE_FORMATTER);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int appointmentHour = appointmentDate.getHour();
        return appointmentHour >= AFTERNOON_STARTING_HOUR && appointmentHour < AFTERNOON_FINISHING_HOUR;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return String.format(
                "You have an appointment on %s, at %s.",
                DESCRIPTION_DATE_FORMATTER.format(appointmentDate),
                DESCRIPTION_TIME_FORMATTER.format(appointmentDate).toUpperCase());
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), ANNIVERSARY_MONTH, ANNIVERSARY_DAY);
    }
}
