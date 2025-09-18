/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratory_3;

import java.util.ArrayList;
import java.util.List;
import logic.*;


public class Laboratory_3 {

    public static void main(String[] args) {
        
   
        Client client_1 = new Client("Monica", "708730373", "87313142", "monica12@gmail.com", 21, "BancoCostaRica");
        Client client_2 = new Client("Joy", "704350876", "7777-7777", "joy23@gmail.com", 22, "BancoCostaRica");

        // 2) Crear cuentas
        SavingsAccount account1 = new SavingsAccount(
                "2025-01-01", 6, 0.05f,
              "ACC-SAV-001", 50000, client_1, "BancoCostaRica");

        CheckingAccount account2 = new CheckingAccount(
                0.03f, "ACC-CUR-001", 30000, client_2, "BancoCostaRica");

       List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        // 4) Operaciones individuales
        System.out.println("---- Individual operations ----");
        account1.deposit(5000);   // Cliente1 deposita 5 mil
        account1.withdraw(2000);  // Cliente1 retira 2 mil

        account2.deposit(3000);   // Cliente2 deposita 3 mil
        account2.withdraw(1000);  // Cliente2 retira 1 mil

        // 5) Transferencias SINPE de 1000 colones en ambas direcciones
        System.out.println("\n---- SINPE transfers ----");
        SimpeMobile.transfer(account1, "7777-7777", "BancoCostaRica", 1000, "Pago a Joy", accounts);
        SimpeMobile.transfer(account2, "87313142", "BancoCostaRica", 1000, "Pago a Monica", accounts);

        // 6) Estado final de las cuentas
        System.out.println("\n---- Final statement of accounts ----");
        System.out.println(account1);
        System.out.println(account2);

        // 7. Mostrar bitácora de operaciones
        System.out.println("\n---- Binnacle ----");
        SimpeMobile.log.printAll();
        SavingsAccount.log.printAll();
        CheckingAccount.log.printAll();
        
    }
}
