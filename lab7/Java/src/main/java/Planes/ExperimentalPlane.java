package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private ClassificationLevel classificationPlane;

    public ExperimentalPlane(String planeModel, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type,
                             ClassificationLevel classificationLevel)
    {
        super(planeModel, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationPlane = classificationLevel;
    }

    public ClassificationLevel getClassificationPlane(){
        return classificationPlane;
    }
    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
