package Planes;
import java.util.Objects;

public class PassengerPlane extends Plane
{
    private int passengersCapacity;

    public PassengerPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }
    public int getPassengersCapacity() {
        return passengersCapacity;
    }
    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                        '}');
    }
    @Override
    public boolean equals(Object object) {
        if (!super.equals(object) && !(object instanceof PassengerPlane) && !(this == object)) return false;
        PassengerPlane plane = (PassengerPlane) object;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
