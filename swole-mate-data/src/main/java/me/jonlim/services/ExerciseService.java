package me.jonlim.services;

import me.jonlim.model.Exercise;

public interface ExerciseService extends CrudService<Exercise, Long> {

  Exercise findByName(String name);

}
