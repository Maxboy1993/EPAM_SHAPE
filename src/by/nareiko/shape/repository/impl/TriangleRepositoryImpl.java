package by.nareiko.shape.repository.impl;

import by.nareiko.shape.entity.Triangle;
import by.nareiko.shape.repository.TriangleRepository;
import by.nareiko.shape.specification.TriangleSpecification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriangleRepositoryImpl implements TriangleRepository {
    private List<Triangle> triangles = new ArrayList<>();
    @Override
    public boolean add(Triangle triangle) {
        return triangles.add(triangle);

    }

    @Override
    public boolean remove(Triangle triangle) {
        return triangles.remove(triangle);

    }

//    @Override
//    public void sort(Comparator triangle) {
//
//    }

    @Override
    public List<Triangle> query(TriangleSpecification specification) {
        List<Triangle> triangleList = triangles.stream().filter(specification).collect(Collectors.toList());
        return triangleList;
    }
}
