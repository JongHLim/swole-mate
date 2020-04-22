package me.jonlim.swolemate.model;

import java.util.Set;

public class Exercise extends BaseEntity {

  private String exerciseType;

  private Set<ExerciseSet> exerciseSetList;

  public Exercise(String exerciseType, Set<ExerciseSet> exerciseSetList) {
    this.exerciseType = exerciseType;
    this.exerciseSetList = exerciseSetList;
  }

  public String getExerciseType() {
    return exerciseType;
  }

  public void setExerciseType(String exerciseType) {
    this.exerciseType = exerciseType;
  }

  public Set<ExerciseSet> getExerciseSetList() {
    return exerciseSetList;
  }

  public void setExerciseSetList(Set<ExerciseSet> exerciseSetSet) {
    this.exerciseSetList = exerciseSetSet;
  }
}
