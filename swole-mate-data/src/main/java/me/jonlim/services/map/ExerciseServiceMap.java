package me.jonlim.services.map;

import me.jonlim.model.Exercise;
import me.jonlim.services.CrudService;

import java.util.Set;

public class ExerciseServiceMap extends AbstractMapService<Exercise, Long> implements CrudService<Exercise, Long> {

  @Override
  public Set<Exercise> findAll() {
    return super.findAll();
  }

  @Override
  public Exercise findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Exercise save(Exercise object) {
    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Exercise object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
