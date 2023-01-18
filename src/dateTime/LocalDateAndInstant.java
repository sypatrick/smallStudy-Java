package dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class LocalDateAndInstant {
    public static void main(String[] args) {
        /**
         * Date는 1970/1/1 부터 현재 시간까지의 초를 계산하여 반환한다.
         * 오프셋, UTC, GMT (https://meetup.nhncloud.com/posts/125)
         * LocalDateTime은 타임존을 가지고 있지 않다. 오프셋과 표준시와 같은 추가 정보가 제공되지 않는 한 타임라인의 한 특정 지점(Instant)을 나타 낼 수 없다.
         * Instant는 UTC 타임라인의 한 순간(moment)을 나타낸다. 1970년 UTC의 첫 번째 모멘트의 발생 이후 nano초 동안의 시간입니다.
         */

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime xMas = LocalDateTime.of(2023, Month.DECEMBER, 25, 0, 0, 0);
        //어디에서도 크리스마스가 12/25 인것은 변하지 않음
        System.out.println(now); // 2023-01-19T00:29:23.549096800
        System.out.println(xMas); // 2023-12-25T00:00

        LocalDate nowDate = LocalDate.now();
        LocalDate xMasDate = LocalDate.of(2023,Month.DECEMBER,25);
        System.out.println(nowDate); // 2023-01-19
        System.out.println(xMasDate); // 2023-12-25

        Instant now1 = Instant.now(); // 2023-01-18T15:29:23.549096800Z
        Instant expired = now1.plusMillis(10000);
        System.out.println(now1); // 2023-01-18T15:29:23.549096800Z
        System.out.println(expired); // 2023-01-18T15:29:33.549096800Z

        Date now2 = new Date();
        System.out.println(now2.getTime()); //1674055763551
    }
}
