package me.jonlim.model;

public class Exercise extends BaseEntity {

  private ExerciseType exerciseType;

  private ExerciseSet exerciseSet;

  public ExerciseType getExerciseType() {
    return exerciseType;
  }

  public void setExerciseType(ExerciseType exerciseType) {
    this.exerciseType = exerciseType;
  }
}
