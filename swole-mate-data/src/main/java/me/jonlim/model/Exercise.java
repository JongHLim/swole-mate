package me.jonlim.model;

import java.util.Set;

public class Exercise extends BaseEntity {

  private ExerciseType exerciseType;

  private ExerciseSet exerciseSet;

  private Set<ExerciseSet> exerciseSetSet;

  public Exercise(ExerciseType exerciseType, ExerciseSet exerciseSet, Set<ExerciseSet> exerciseSetSet) {
    this.exerciseType = exerciseType;
    this.exerciseSet = exerciseSet;
    this.exerciseSetSet = exerciseSetSet;
  }

  public ExerciseType getExerciseType() {
    return exerciseType;
  }

  public void setExerciseType(ExerciseType exerciseType) {
    this.exerciseType = exerciseType;
  }

  public ExerciseSet getExerciseSet() {
    return exerciseSet;
  }

  public void setExerciseSet(ExerciseSet exerciseSet) {
    this.exerciseSet = exerciseSet;
  }

  public Set<ExerciseSet> getExerciseSetSet() {
    return exerciseSetSet;
  }

  public void setExerciseSetSet(Set<ExerciseSet> exerciseSetSet) {
    this.exerciseSetSet = exerciseSetSet;
  }
}
