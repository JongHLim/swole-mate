package me.jonlim.model;

public class WorkoutType extends BaseEntity {

  private String workoutName;

  public WorkoutType(String workoutName) {
    this.workoutName = workoutName;
  }

  public String getWorkoutName() {
    return workoutName;
  }

  public void setWorkoutName(String workoutName) {
    this.workoutName = workoutName;
  }
}
