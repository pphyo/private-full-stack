package tech.codoverse;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateTimei18nApp {

    void main() {
        runForRb();
    }

    void runForRb() {
        Locale canada = Locale.CANADA_FRENCH;
        Locale myanmar = Locale.of("my", "MM");
        ResourceBundle rb = ResourceBundle.getBundle("lang");
        IO.println(rb.getString("greeting"));
        IO.println(MessageFormat.format(rb.getString("greeting"), "Alan", "Zyan"));
    }

    void runForI18N() {
        var locale = new Locale.Builder()
                .setLanguage("my")
                .setRegion("mm").build();
        IO.println(Locale.getDefault());
        IO.println(locale);
    }

    void runForDateFormat() {
        LocalDateTime now = LocalDateTime.now();
        final DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

        IO.println(now.format(df));
    }

    void runForPeriodDuration() {
        LocalDate birthday = LocalDate.of(1998, 10, 20);
        LocalDate today = LocalDate.now();
        Period p1 = Period.between(birthday, today);
        IO.println(p1.toTotalMonths());

        Period p2 = Period.ofDays(200);
        IO.println(p2);

        Duration d1 = Duration.ofDays(10);
        IO.println(d1);
    }

    void runForInstant() {
        var instant = Instant.now();
        IO.println(instant.atZone(ZoneId.of("Asia/Tokyo")));

        var zdt = ZonedDateTime.now(ZoneId.of("Asia/Bangkok"));
        IO.println(zdt.withZoneSameInstant(ZoneId.of("Europe/Paris")));
    }

    void runForCoreClasses() {
        var dtf = DateTimeFormatter.ofPattern("yyMMdd");
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();

        IO.println(ld.until(LocalDate.parse("260306", dtf)));
        IO.println(ld);
        IO.println(lt);
    }

}
