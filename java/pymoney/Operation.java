import java.util.*;
import java.time.LocalDate;

public class Operation {

    private String account;
    private TypeOperation typeOperation;
    private int amount;
    private LocalDate date = new LocalDate.now();

    public Operation(String account, TypeOperation typeOperation, int amount, LocalDate date) {
        this.amount = amount;
        this.typeOperation = typeOperation;
        this.amount = amount;
        this.date = date;

    }
}