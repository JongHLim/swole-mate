package me.jonlim.swolemate.model;

import java.util.Set;

public class Exercise extends BaseEntity {

  private String exerciseType;

  private Set<ExerciseSet> exerciseSetSet;

  public Exercise(String exerciseType, Set<ExerciseSet> exerciseSetSet) {
    this.exerciseType = exerciseType;
    this.exerciseSetSet = exerciseSetSet;
  }

  public String getExerciseType() {
    return exerciseType;
  }

  public void setExerciseType(String exerciseType) {
    this.exerciseType = exerciseType;
  }

  public Set<ExerciseSet> getExerciseSetSet() {
    return exerciseSetSet;
  }

  public void setExerciseSetSet(Set<ExerciseSet> exerciseSetSet) {
    this.exerciseSetSet = exerciseSetSet;
  }
}
