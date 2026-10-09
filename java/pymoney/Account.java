import java.util.*;
import java.time.LocalDate;

public class Account {

    private int solde;
    private String accountNumber;
    private TypeAccount typeAccount;
    private User user;
    List<Operation> operation = new ArrayList<>();

    public Account(int solde, String accountNumber, TypeAccount typeAccount, User user) {
        this.solde = solde;
        this.accountNumber = accountNumber;
        this.typeAccount = typeAccount;
        this.user = user;
    }

    public void transaction(TypeOperation typeOperation, int amount) {

        Operation operation = new Operation(this, typeOperation, amount);
        this.operations.add(operation);
        typeOperation.getCode() =='C' ? this.solde += amount: this.solde -= amount;
    }
}
