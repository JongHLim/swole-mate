package me.jonlim.model;

import java.time.LocalDate;

public class Workout extends BaseEntity {

  private LocalDate workoutDate;
  private WorkoutType workoutType;

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
