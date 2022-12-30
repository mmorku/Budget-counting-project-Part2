import java.util.ArrayList;
import java.util.Arrays;

public class Budget {
    private int sumOfIncome = 0;
    private int sumOfExpenses = 0;

    FullIncomeList[] income = new FullIncomeList[100];
    FullExpensesList[] expenses = new FullExpensesList[100];

    ArrayList<FullIncomeList> fullIncomeListArrayList = new ArrayList<>();
    ArrayList<FullExpensesList> fullExpensesListArrayList = new ArrayList<>();

    private int sumOfIncomeList = 0;
    private int sumOfExpensesList = 0;

    private String balance;


    public void addIncomeToArrayList(ArrayList arrayList) {
        if (sumOfIncomeList == income.length) {
            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }

    }
    public void addIncomeToList(FullIncomeList fullIncomeList) {
        if (sumOfIncomeList == income.length) {
            throw new ArrayIndexOutOfBoundsException("Pajamų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        income[sumOfIncomeList] = fullIncomeList;
        sumOfIncomeList++;
        System.out.println(Arrays.toString(income));
    }

    public void addExpensesToList(FullExpensesList fullExpensesList) {
        if (sumOfExpensesList == expenses.length) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas pilnas, pašalinkite dalį sąrašo ir kartokite iš naujo.");
        }
        expenses[sumOfExpensesList] = fullExpensesList;
        sumOfExpensesList++;
        System.out.println(Arrays.toString(expenses));
    }

    public void getFullIncomeList() {
        if (sumOfIncomeList == 0) {
            throw new NullPointerException("Pajamų sąrašas tuščias.");
        }
        for (FullIncomeList FullIncomeList : income) {
            if (FullIncomeList != null) {
//                System.out.printf("Pajamų sąrašas: %s \n", income);
                sumOfIncome += FullIncomeList.getTotalSum();
                System.out.printf("Pajamų suma. VISO: %s Eur \n", sumOfIncome);
            }
        }
    }

    public void getFullExpensesList() {
        if (sumOfExpensesList == 0) {
            throw new ArrayIndexOutOfBoundsException("Išlaidų sąrašas tuščias.");
        }
        for (FullExpensesList FullExpensesList : expenses) {
            if (FullExpensesList != null) {
//                System.out.printf("Išlaidų sąrašas: %s \n", expenses);
                sumOfExpenses += FullExpensesList.getTotalSum();
                System.out.printf("Išlaidų suma. VISO: %s Eur\n", sumOfExpenses);
            }
        }
    }

    public double getBalance() {
        return balance == null || balance.isEmpty() ? Double.NaN : Double.parseDouble(balance = String.valueOf(sumOfIncome - sumOfExpenses));

//        double balance = Double.parseDouble(String.valueOf(sumOfIncome)) - Double.parseDouble(String.valueOf(sumOfExpenses));
//        System.out.printf("Balanso suma. VISO: %d Eur\n", balance);

//        if (balance != null) {
//            System.out.printf("Balanso suma. VISO: %d Eur\n", balance);
//        } else {
//            throw new ArrayIndexOutOfBoundsException("Balansas yra 0 Eur");
//        }
    }
}
