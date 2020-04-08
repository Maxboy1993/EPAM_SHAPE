package by.nareiko.shape.repository;

import by.nareiko.shape.entity.Triangle;
import by.nareiko.shape.specification.TriangleSpecification;

import java.util.Comparator;
import java.util.List;

public interface TriangleRepository {
    boolean add(Triangle triangle);
    boolean remove(Triangle triangle);
//    void sort(Comparator triangle);

    List<Triangle> query(TriangleSpecification specification);
}
