import java.time.LocalDate;
import java.time.LocalDateTime;

public class GigaSecond {
    private LocalDateTime now;

    private static final long GIGA_SECONDS = 1000000000L;

    public GigaSecond(LocalDate localDate) {
        now = localDate.atStartOfDay();
    }

    public GigaSecond(LocalDateTime localDateTime) {
        now = localDateTime;
    }

    public LocalDateTime getDate() {
        return now.plusSeconds(GIGA_SECONDS);
    }
}
