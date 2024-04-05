package personal.ex.DevicesClass;

/**
 * @author Radu Miron
 */
public interface Chargeable {
    void charge(int duration);

    int getBatteryLevel();
}
