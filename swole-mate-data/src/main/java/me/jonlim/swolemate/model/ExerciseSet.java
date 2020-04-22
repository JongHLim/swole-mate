package me.jonlim.swolemate.model;

public class ExerciseSet extends BaseEntity {

  private int sets;
  private int reps;
  private int weight;

  public ExerciseSet(int sets, int reps, int weight) {
    this.sets = sets;
    this.reps = reps;
    this.weight = weight;
  }

  public int getSets() {
    return sets;
  }

  public void setSets(int sets) {
    this.sets = sets;
  }

  public int getReps() {
    return reps;
  }

  public void setReps(int reps) {
    this.reps = reps;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
