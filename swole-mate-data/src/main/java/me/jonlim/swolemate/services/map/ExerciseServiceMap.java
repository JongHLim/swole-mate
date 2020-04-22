package me.jonlim.swolemate.services.map;

import me.jonlim.swolemate.model.Exercise;
import me.jonlim.swolemate.services.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ExerciseServiceMap extends AbstractMapService<Exercise, Long> implements ExerciseService {

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
    return super.save(object);
  }

  @Override
  public void delete(Exercise object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Exercise findByName(String name) {
    return null;
  }
}
