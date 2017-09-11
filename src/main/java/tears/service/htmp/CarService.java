package tears.service.htmp;

import tears.model.htmp.Car;

/**
 * @author Vladimir on 8/21/2017.
 */
public interface CarService {

        /**
         * @return list of cars.
         */
        Car[] getCars();

        /**
         * @param number is car's number.
         * @return {@link Car} entity by given car number.
         */
        Car getCarByNumber(String number);
}
