public class Main_bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Иван");
        BankAccount acc2 = new BankAccount("Ольга");

        System.out.println("Начальные данные по первому аккаунту:"
                + "\nИмя: " + acc1.getOwnerName()
                + "\nБаланс счёта: " + acc1.getBalance()
                + "\nДата открытия счёта: " + acc1.getOpenDate()
                + "\nЗаблокирован ли счёт: " + acc1.isBlocked());

        System.out.println("\nНачальные данные по второму аккаунту:"
                + "\nИмя: " + acc2.getOwnerName()
                + "\nБаланс счёта: " + acc2.getBalance()
                + "\nДата открытия счёта: " + acc2.getOpenDate()
                + "\nЗаблокирован ли счёт: " + acc2.isBlocked());

        System.out.println("\nПополнение Иван: " + acc1.deposit(500) +
                ". Текущий баланс: " + acc1.getBalance());     // true
        System.out.println("Снятие Иван: " + acc1.withdraw(200));        // true
        System.out.println("Баланс Иван: " + acc1.getBalance());         // 300

        System.out.println("Перевод Иван → Ольга: " + acc1.transfer(acc2, 100)); // true
        System.out.println("Баланс Иван: " + acc1.getBalance());         // 200
        System.out.println("Баланс Ольга: " + acc2.getBalance());        // 100

        acc1.setBlocked(true);
        System.out.println("\nЗаблокирован ли счёт Ивана? " + acc1.isBlocked());;
        System.out.println("Попытка снять 50 у.е. с заблокированного счета: " + acc1.withdraw(50) + ". Текущий баланс: " + acc1.getBalance()); // false

    }
}
