package roomescape.controller.dto;

import java.time.LocalDate;
import roomescape.domain.Reservation;
import roomescape.domain.ReservationTime;

public record ReservationRequest(
        String name,
        LocalDate date,
        Long timeId
) {
    public Reservation toEntity(ReservationTime time) {
        return new Reservation(name, date, time);
    }
}
