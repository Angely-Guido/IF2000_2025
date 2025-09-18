/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.time.LocalDateTime; // Para obtener la fecha y hora actual
import java.util.ArrayList;     // Lista para guardar los registros
import java.util.Collections;   // Para devolver la lista sin que pueda modificarse desde afuera
import java.util.List;


public class Binnacle {
    
    private int idEvento = 0;

    
    private final List<String> transactions = new ArrayList<>();

    public void record(String event, String accountNumber, String clientId, double amount, double balanceAfter) {
        idEvento++;
        
        String line = String.format(
                "Idevent=%d | Event=%s | Date=%s | NumberAccount=%s | IdClient=%s | Amount=%.2f | FinalBalance=%.2f",
                idEvento, event, LocalDateTime.now(), accountNumber, clientId, amount, balanceAfter);

        transactions.add(line);
    }

    public List<String> getEntries() {
        return Collections.unmodifiableList(transactions);
    }

    public void printAll() {
        for (String e : transactions) {
            System.out.println(e);
        }
    }

}
    

