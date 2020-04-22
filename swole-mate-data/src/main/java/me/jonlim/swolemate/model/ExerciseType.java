package me.jonlim.swolemate.model;

public class ExerciseType extends BaseEntity {

  private String exerciseName;

  public ExerciseType(String exerciseName) {
    this.exerciseName = exerciseName;
  }

  public String getExerciseName() {
    return exerciseName;
  }

  public void setExerciseName(String exerciseName) {
    this.exerciseName = exerciseName;
  }
}
