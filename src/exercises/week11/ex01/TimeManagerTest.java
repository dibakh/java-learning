package exercises.week11.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeManagerTest {
    @Test
    void testTimetable() {

        LocalTime localTime = LocalTime.parse("10:00:00");
        System.out.println("\nHour (Hours:Minutes): " + localTime.getHour() + ":" + localTime.getMinute());

        LocalDate localDate = LocalDate.parse("2003-03-13");
        LocalDateTime start = LocalDateTime.of(localDate, localTime);

        System.out.println("\nDay of week: " + start.toLocalDate().getDayOfWeek());
        LocalDateTime getReadyDateTime = start
                .plusMinutes(37)
                .plusSeconds(21);

        System.out.println("\nPick up time (Hours:Minutes): "
                + getReadyDateTime.getHour() + ":" + getReadyDateTime.getMinute());

        LocalDateTime airportArrivalDateTime = getReadyDateTime
                .plusHours(1)
                .plusMinutes(30);
        System.out.println("\narrive at airport: " + airportArrivalDateTime);

        LocalTime flightTime = LocalTime.parse("11:04");
        boolean isLate = airportArrivalDateTime.toLocalTime().isAfter(flightTime);
        showMessage(isLate, "\nYou missed your flight!", "\nYou did NOT miss your flight!");

        LocalTime nextFlightTime = LocalTime.parse("18:45");
        Duration timeToNextFlight = Duration.between(airportArrivalDateTime.toLocalTime(), nextFlightTime);
        System.out.println("\nhe should wait " + durationToString(timeToNextFlight));

        LocalDateTime takeOfToTokyo = LocalDateTime.of
                (
                        airportArrivalDateTime.toLocalDate(),
                        nextFlightTime
                );
        LocalDateTime timeInLondon = takeOfToTokyo
                .plusHours(11)
                .plusMinutes(50);

        System.out.println("\nTime in London: " + timeInLondon.toLocalTime());

//He finally gets in the plane and departs at 18:45 from London.
// It takes him 11 hours and 50 minutes to land in Tokyo.
// What time is it in London?
// What date and time is it in Tokyo?
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime inLondon = timeInLondon.atZone(london);
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime timeInTokyo = inLondon.withZoneSameInstant(tokyoZone);
        System.out.println("Time in Tokyo: " + timeInTokyo.toLocalTime());

//After two hours he manages to arrive to his hotel in Tokyo and
// sleeps for 9 hours straight until he wakes up abruptly.
// At what time is his manager hitting him in the head with the pillows to wake him up?
        LocalDateTime wakeupDateTime = LocalDateTime.of(timeInTokyo.toLocalDate(), timeInTokyo.toLocalTime())
                .plusHours(2)
                .plusHours(9);
        System.out.println("\nwake up time: " + wakeupDateTime);

//        They tell him that the advertisement shooting starts in 47 minutes.
//        When is that exactly?
        LocalDateTime advShootingStart = wakeupDateTime
                .plusMinutes(47);
        System.out.println("\nadvertisement shooting starts at " + advShootingStart.toLocalTime());

//They throw him with his clothes and make up set into the limousine and rush towards the studio arriving just in time.
// However, Mugatu received a private phone call from his assistant Katinka that lasted 546 seconds.
// How much time in minutes and seconds did Mugatu have to get prepared in the limousine?
        long callDuration = 546;
        Duration between = Duration.between(wakeupDateTime.plusSeconds(callDuration), advShootingStart);
        System.out.println("\ntime he needs to prepare: " + durationToString(between));

//        After 7 hours the shooting is over.
//        Lunch time is round 13:00 and dinner time is around 20:00.
//        Should Mugatu have lunch or dinner?
        LocalDateTime endOfShooting = advShootingStart
                .plusHours(7);
        LocalTime lunchTime = LocalTime.parse("13:00");
        LocalTime dinnerTime = LocalTime.parse("20:00");

        if (endOfShooting.toLocalTime().isAfter(lunchTime) &&
                endOfShooting.toLocalTime().isBefore(dinnerTime)) {
            System.out.println("\nYou should eat dinner!");
        } else {
            System.out.println("\nyou should eat lunch!");
        }

//        After three days and 12 hours,
//        Mugatu finally takes his flight back to London.
//        After the 11 hours and 50 minutes of flight back, he lands in London.
//        What time is it in Tokyo?
//        What date is it in London?
        LocalDateTime landInLondon = endOfShooting
                .plusDays(3)
                .plusHours(12)
                .plusHours(11)
                .plusMinutes(50);
        ZonedDateTime inTokyo = landInLondon.atZone(tokyoZone);

        ZonedDateTime backtimeInLondon = inTokyo.withZoneSameInstant(london);
        LocalDateTime londonLocalDateTime = backtimeInLondon.toLocalDateTime();
        System.out.println("\nDate in London: " + londonLocalDateTime);

//        At the airport he gets surrounded by 173 fans and
//        it takes him 12 seconds to give each one of them an autograph.
//        How many hours and minutes did he spend dispatching his fans?
        long numberOfFan = 173;
        long autographyTime = numberOfFan * 12;
        LocalDateTime afterAutography = londonLocalDateTime
                .plusSeconds(autographyTime);
        Duration spendWithFans = Duration.between(landInLondon.toLocalTime(), afterAutography.toLocalTime());
        System.out.println("\nhe spend " + durationToString(spendWithFans.abs()));

//        Mugatu arrives at his hotel one hour later and decides to go to the sauna.
//        This one is only open from 9:00 to 14:00 and from 16:00 to 20:00.
//        Can he at least manage to stay in the sauna for half an hour?
        LocalDateTime arriveToHotel = afterAutography
                .plusHours(1);
        System.out.println("\narrive to sauna : " + arriveToHotel);
        checkIfHeCanUseSauna(arriveToHotel);

//        The special one-hour massage offered by the hotel is on Thursdays and Sundays,
//        and if it is a leap year, also on Saturdays.
//        Can Mugatu be lucky enough to get one of those?
        DayOfWeek dayOfWeek = arriveToHotel.getDayOfWeek();
        if (dayOfWeek.equals("THURSDAY") || dayOfWeek.equals("SUNDAY")) {
            System.out.println(" he can use one-hour massage offered by the hotel!");
        }
        boolean leapYear = arriveToHotel.toLocalDate().isLeapYear();
        if (dayOfWeek.equals("SATURDAY") && leapYear) {
            System.out.println(" he can use one-hour massage offered by the hotel!");
        }

//One week later,
// the advertisement is broadcasted at 18:30 in Tokyo’s time.
// When does Mugatu have to turn on the TV in London to be able to see it?
        LocalDateTime advBroadcast = arriveToHotel
                .plusWeeks(1);

        ZonedDateTime advBroadcastZoneInLondon = advBroadcast.atZone(london);
        ZonedDateTime advBroadcastZoneInTokyo = advBroadcastZoneInLondon.withZoneSameInstant(tokyoZone);
        LocalDateTime advBroadcastDateTimeInTokyo = advBroadcastZoneInTokyo.toLocalDateTime();
        System.out.println("tima a week later in Tokyo: " + advBroadcastDateTimeInTokyo);
        LocalDateTime advertisementStartLondon= LocalDateTime.of(advBroadcastDateTimeInTokyo.toLocalDate(), LocalTime.of(18, 30));

        System.out.println("\nhe should to turn on the TV at: " + advertisementStartLondon.toLocalTime());

        //The advertisement lasts 29 seconds. Fifteen seconds afterwards his manager calls him on the phone to congratulate
        // him for his popularity increase. At what time exactly does this happen? What day of the week is this?
        LocalDateTime managerCallTime = advertisementStartLondon
                .plusSeconds(29)
                .plusSeconds(15);
        System.out.println("\nhis manager called at: " + managerCallTime.toLocalTime() + " Uhr.it was " + managerCallTime.getDayOfWeek());

        //How many days have passed by since he woke up at the beginning of the timetable?
        Period periodSinceBeginning = Period.between(start.toLocalDate(), managerCallTime.toLocalDate());
        int daysSinceBeginning = periodSinceBeginning.getDays();
        System.out.println("\nDays since beginning: " + daysSinceBeginning);

        //Mugatu gets paid for the timetable rights 1.39 Euro per minute of his privacy since the beginning of the
        //timetable until the end, except for the time of the private call that Mugatu had with Katinka. How much
        //is he paid for this reportage?

        long totalMinutesSpent = LocalDateTime.of(start.toLocalDate(), start.toLocalTime()).until(managerCallTime
                        .minusSeconds(546)
                , ChronoUnit.MINUTES);
        int moneyToPay = (int) (totalMinutesSpent * 1.39);
        System.out.println("\nTotal Money to pay: " + moneyToPay + "€");

    }

    private void checkIfHeCanUseSauna(LocalDateTime arriveToSauna) {
        checkIfTimeIsEnough(arriveToSauna, LocalTime.parse("09:00"), LocalTime.parse("14:00"));
        checkIfTimeIsEnough(arriveToSauna, LocalTime.parse("16:00"), LocalTime.parse("20:00"));
    }

    private void checkIfTimeIsEnough(LocalDateTime arriveToSauna, LocalTime openHour, LocalTime closeHour) {
        if (arriveToSauna.toLocalTime().isAfter(openHour) &&
                arriveToSauna.toLocalTime().isBefore(closeHour)) {
            Duration remainedTime = Duration.between(closeHour, arriveToSauna.toLocalTime());
            if (remainedTime.abs().toMinutes() > 30) {
                System.out.println("\nyou can use sauna between " + openHour + " - " + closeHour);
            }
        } else {
            System.out.println("he can Not use sauna between " + openHour + "-" + closeHour);
        }
    }

    private void showMessage(boolean isLate, String ifIsTrue, String ifIsFalse) {
        if (isLate) {
            System.out.println(ifIsTrue);
        } else {
            System.out.println(ifIsFalse);
        }
    }

    private String durationToString(Duration between) {
        long hour = between.toHours();
        long minute = between.minusHours(hour).toMinutes();
        long seconds = between.minusHours(hour).minusMinutes(minute).getSeconds();

        return hour + " hours "
                + minute + " minutes "
                + seconds + " seconds.";
    }
}
