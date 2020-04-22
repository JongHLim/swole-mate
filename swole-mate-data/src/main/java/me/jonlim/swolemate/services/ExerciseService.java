package me.jonlim.swolemate.services;

import me.jonlim.swolemate.model.Exercise;

public interface ExerciseService extends CrudService<Exercise, Long> {

  Exercise findByName(String name);

}
