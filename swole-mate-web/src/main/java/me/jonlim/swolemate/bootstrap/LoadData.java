package me.jonlim.swolemate.bootstrap;

import me.jonlim.model.*;
import me.jonlim.services.ExerciseService;
import me.jonlim.services.WorkoutService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

@Component
public class LoadData implements CommandLineRunner {

  private final ExerciseService exerciseService;
  private final WorkoutService workoutService;

  public LoadData(ExerciseService exerciseService, WorkoutService workoutService) {
    this.exerciseService = exerciseService;
    this.workoutService = workoutService;
  }

  @Override
  public void run(String... args) throws Exception {

    ExerciseSet chestSet1 = new ExerciseSet(2, 10, 135);
    ExerciseSet chestSet2 = new ExerciseSet(5, 10, 225);
    HashSet<ExerciseSet> chestSets = new HashSet<>();
    chestSets.add(chestSet1);
    chestSets.add(chestSet2);
    ExerciseType chestExercise1 = new ExerciseType("Bench Press");
    Exercise chestExercise = new Exercise(chestExercise1, chestSets);

    HashSet<Exercise> exercises = new HashSet<>();
    exercises.add(chestExercise);
    WorkoutType chestType = new WorkoutType("Chest");
    Workout chestWorkout = new Workout(LocalDate.now(), chestType, exercises);

    workoutService.save(chestWorkout);
    System.out.println("Loaded workouts...");

  }
}
