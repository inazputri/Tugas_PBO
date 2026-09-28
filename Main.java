public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Inaz", "Putri");
        bank.addCustomer("bq", "Kamila");
        bank.addCustomer("Alifia", "Putri");

        Customer nasabahInaz = bank.getCustomer(0);
        Customer nasabahBq = bank.getCustomer(1);
        Customer nasabahAlifia = bank.getCustomer(2);

        Account rekeningInaz = new Account(800000);
        nasabahInaz.setAccount(rekeningInaz);

        Account rekeningBq = new Account(1500000);
        nasabahBq.setAccount(rekeningBq);

        Account rekeningAlifia = new Account(100000);
        nasabahAlifia.setAccount(rekeningAlifia);

        System.out.println("===== DATA BANK =====");
        System.out.println("Jumlah nasabah: " + bank.getNumOfCustomers());

        System.out.println("\n===== DATA INAZ =====");
        System.out.println("Nama: " + nasabahInaz.getFullName());
        System.out.println("Saldo awal: Rp " + nasabahInaz.getAccount().getBalance());

        System.out.println("Setor tunai: Rp 200000");
        nasabahInaz.getAccount().deposit(200000);

        System.out.println("Saldo akhir: Rp " + nasabahInaz.getAccount().getBalance());

        System.out.println("\n===== DATA BQ =====");
        System.out.println("Nama: " + nasabahBq.getFullName());
        System.out.println("Saldo awal: Rp " + nasabahBq.getAccount().getBalance());

        System.out.println("Tarik tunai: Rp 350000");
        nasabahBq.getAccount().withdraw(350000);

        System.out.println("Saldo akhir: Rp " + nasabahBq.getAccount().getBalance());

        System.out.println("\n===== DATA ALIFIA =====");
        System.out.println("Nama: " + nasabahAlifia.getFullName());
        System.out.println("Saldo awal: Rp " + nasabahAlifia.getAccount().getBalance());

        System.out.println("Tarik tunai: Rp 350000");
        nasabahAlifia.getAccount().withdraw(350000);

        System.out.println("Saldo akhir: Rp " + nasabahAlifia.getAccount().getBalance());
    }
}