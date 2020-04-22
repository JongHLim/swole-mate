package me.jonlim.swolemate.controllers;

import me.jonlim.swolemate.services.WorkoutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/workouts")
@Controller
public class WorkoutController {

  private final WorkoutService workoutService;

  public WorkoutController(WorkoutService workoutService) {
    this.workoutService = workoutService;
  }

  @RequestMapping({"", "/", "/index", "index.html"})
  public String listWorkouts(Model model) {

    model.addAttribute("workouts", workoutService.findAll());
    return "workouts/index";

  }
}
