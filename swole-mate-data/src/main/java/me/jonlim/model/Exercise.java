package me.jonlim.model;

import java.util.Set;

public class Exercise extends BaseEntity {

  private ExerciseType exerciseType;

  private Set<ExerciseSet> exerciseSetSet;

  public Exercise(ExerciseType exerciseType, Set<ExerciseSet> exerciseSetSet) {
    this.exerciseType = exerciseType;
    this.exerciseSetSet = exerciseSetSet;
  }

  public ExerciseType getExerciseType() {
    return exerciseType;
  }

  public void setExerciseType(ExerciseType exerciseType) {
    this.exerciseType = exerciseType;
  }

  public Set<ExerciseSet> getExerciseSetSet() {
    return exerciseSetSet;
  }

  public void setExerciseSetSet(Set<ExerciseSet> exerciseSetSet) {
    this.exerciseSetSet = exerciseSetSet;
  }
}
