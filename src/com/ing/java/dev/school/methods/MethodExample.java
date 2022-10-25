package com.ing.java.dev.school.methods;

public class MethodExample {

    // Do one thing
    // Bad
    public void saveCashFlow(Income income, Expense expense){
        incomeReposiroty.save(income);
        expenseRepository.save(expense);
    }
    // Good
    public void saveIncome(Income income){
        incomeReposiroty.save(income);
    }
    public void saveExpense(Expense expense){
        expenseRepository.save(expense);
    }

    // has no side effects
    public boolean checkPassword(String username, String password) { // checkPasswordAndInitializeSession()
        if (/*username matches the password*/) {
            Session.initialize();
            return true;
        }
        return false;
    }

    //extract conditions to meaningful methods
    public void checkPath(int[][] adjacencyMatrix, int u, int v) {
        int[] bestRates = new int[10];

        if (adjacencyMatrix[u][v] > 0
                && bestRates[u] < Integer.MAX_VALUE
                && bestRates[u] * adjacencyMatrix[u][v] < bestRates[v]) {
        }

        if (isDirectRoute(adjacencyMatrix, u, v)
                && hasAnAssignedCost(bestRates, u)
                && isItMoreEfficientPath(adjacencyMatrix, bestRates, u, v)) {
        }
    }

    //avoid flag arguments
    public Booking book(Customer customer, boolean isPremium) {
        if (isPremium) {
            // logic for premium book
        } else {
            // logic for regular booking
        }
    }


}
