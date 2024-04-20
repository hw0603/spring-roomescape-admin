package roomescape.dao;

import java.util.List;
import roomescape.domain.Reservation;

public interface ReservationDao {
    List<Reservation> findAll();

    Reservation add(Reservation reservation);

    void delete(Long id);

    void deleteAll();

    boolean isExist(Long id);
}
