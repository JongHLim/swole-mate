package me.jonlim.swolemate.bootstrap;

import me.jonlim.swolemate.model.*;
import me.jonlim.swolemate.services.WorkoutService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;

@Component
public class LoadData implements CommandLineRunner {

  private final WorkoutService workoutService;

  public LoadData(WorkoutService workoutService) {
    this.workoutService = workoutService;
  }

  @Override
  public void run(String... args) throws Exception {

    HashSet<Exercise> exercises = new HashSet<>();
    ExerciseSet benchSet1 = new ExerciseSet(2, 10, 135);
    ExerciseSet benchSet2 = new ExerciseSet(5, 10, 225);
    HashSet<ExerciseSet> benchSets = new HashSet<>();
    benchSets.add(benchSet1);
    benchSets.add(benchSet2);
    Exercise bench = new Exercise("Bench Press", benchSets);
    exercises.add(bench);

    ExerciseSet fliesSet1 = new ExerciseSet(5, 10, 30);
    HashSet<ExerciseSet> fliesSets = new HashSet<>();
    fliesSets.add(fliesSet1);
    Exercise flies = new Exercise("Flat Chest Flies", fliesSets);
    exercises.add(flies);

    WorkoutType chestType = new WorkoutType("Chest");
    Workout chestWorkout = new Workout(LocalDate.now(), chestType, exercises);
    workoutService.save(chestWorkout);

    HashSet<Exercise> exercises2 = new HashSet<>();
    ExerciseSet squatSet1 = new ExerciseSet(5, 4, 255);
    HashSet<ExerciseSet> squatSets = new HashSet<>();
    squatSets.add(squatSet1);
    Exercise squats = new Exercise("Squat", squatSets);
    exercises2.add(squats);

    ExerciseSet lungesSet1 = new ExerciseSet(5, 10, 30);
    HashSet<ExerciseSet> lungesSets = new HashSet<>();
    lungesSets.add(lungesSet1);
    Exercise lunges = new Exercise("Dumbbell Lunges", lungesSets);
    exercises2.add(lunges);

    WorkoutType legsType = new WorkoutType("Legs");
    Workout legsWorkout = new Workout(LocalDate.now(), legsType, exercises2);
    workoutService.save(legsWorkout);

    System.out.println("Loaded workouts...");

  }
}
