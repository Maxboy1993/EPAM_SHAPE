package by.nareiko.shape.specification.impl;

import by.nareiko.shape.entity.Triangle;
import by.nareiko.shape.specification.TriangleSpecification;

public class TriangleSpecificationById implements TriangleSpecification {
    private long desireId;

    public TriangleSpecificationById(long desireId) {
        super();
        this.desireId = desireId;
    }


    @Override
    public boolean test(Triangle triangle) {
        return triangle.hasId(desireId);
    }
}
