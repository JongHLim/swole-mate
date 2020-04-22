package me.jonlim.swolemate.services.map;

import me.jonlim.swolemate.model.Workout;
import me.jonlim.swolemate.services.WorkoutService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class WorkoutServiceMap extends AbstractMapService<Workout, Long> implements WorkoutService{

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
    return super.save(object);
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
