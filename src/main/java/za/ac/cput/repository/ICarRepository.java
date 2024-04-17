package za.ac.cput.repository;

import za.ac.cput.domain.Car;
import java.util.List;

public interface ICarRepository extends IRepository <Car, String> {

    public List<Car> getAll();
}
