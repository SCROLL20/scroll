package com.codingdojo.savetravels.controllers;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@Autowired
	expense expenseService;
	
	@GetMapping("/")
	public String home() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}
	
	@PostMapping("/expenses")
	public String index(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {	
		model.addAttribute("expense", models.Expense.findExpense(id));
		return "edit.jsp";
	}
	
	@PostMapping("/expenses/edit/{id}")
	public String update(
			@PathVariable("id") Long id, 
			Model model, 
			@Valid @ModelAttribute("expense") models.Expense expense, 
			BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("expense", models.Expense.findExpense(id));
			return "redirect:/edit/{id}";
		}else {
			expense.updateExpense(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String showExpense(@PathVariable("id") Long id, Model model) {
		model.addAttribute("expense", models.Expense.findExpense(id));
		return "show.jsp";
	}
	
	@RequestMapping("/expenses/delete/{id}")
	public String deleteExpense(@PathVariable("id") Long id) {
		Object expense = models.Expense.findExpense(id);
		models.Expense.updateExpense(expense);
		return "redirect:/expenses";
	}
	
}