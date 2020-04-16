package me.jonlim.services.map;

import me.jonlim.model.Exercise;
import me.jonlim.model.Workout;
import me.jonlim.services.CrudService;

import java.util.Set;

public class WorkoutServiceMap extends AbstractMapService<Workout, Long> implements CrudService<Workout, Long> {


  @Override
  public Set<Workout> findAll() {
    return super.findAll();
  }

  @Override
  public Workout findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Workout save(Workout object) {
    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Workout object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
