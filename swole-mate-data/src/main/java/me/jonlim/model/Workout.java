package me.jonlim.model;

import java.time.LocalDate;
import java.util.Set;

public class Workout extends BaseEntity {

  private LocalDate workoutDate;
  private WorkoutType workoutType;
  private Set<Exercise> exercises;

  public Workout(LocalDate workoutDate, WorkoutType workoutType, Set<Exercise> exercises) {
    this.workoutDate = workoutDate;
    this.workoutType = workoutType;
    this.exercises = exercises;
  }

  public LocalDate getWorkoutDate() {
    return workoutDate;
  }

  public void setWorkoutDate(LocalDate workoutDate) {
    this.workoutDate = workoutDate;
  }

  public WorkoutType getWorkoutType() {
    return workoutType;
  }

  public void setWorkoutType(WorkoutType workoutType) {
    this.workoutType = workoutType;
  }
}
