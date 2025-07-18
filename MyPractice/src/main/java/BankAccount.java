import java.time.LocalDateTime;

public class BankAccount {
    private String ownerName;
    private int balance;
    private LocalDateTime openDate;
    private boolean isBlocked;

    // Конструктор
    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.openDate = LocalDateTime.now();
        this.isBlocked = false;
    }

    // Метод пополнения счета
    public boolean deposit(int amount) {
        if (amount <= 0 || isBlocked) {
            return false;
        }
        balance += amount;
        return true;
    }

    // Метод снятия денег
    public boolean withdraw(int amount) {
        if (amount <= 0 || isBlocked || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    // Метод перевода средств
    public boolean transfer(BankAccount otherAccount, int amount) {
        if (otherAccount == null || isBlocked || otherAccount.isBlocked || amount <= 0 || amount > balance) {
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    // Геттеры
    public String getOwnerName() {
        return ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    // Метод для блокировки/разблокировки счета (сеттер)
    public void setBlocked(boolean blocked) {
        this.isBlocked = blocked;
    }
}
