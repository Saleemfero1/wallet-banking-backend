package wallet.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wallet.banking.model.Transaction;
import wallet.banking.service.TransactionService;

import java.util.List;
@CrossOrigin("*")

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private  TransactionService transactionService;

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<String>deleteTransactionByTransactionId(@PathVariable("transactionId")String transactionId){
    return new ResponseEntity<>(transactionService.deleteTransaction(transactionId), HttpStatus.ACCEPTED);
    }

    @GetMapping("/{accountNumber}")
    public  ResponseEntity<List<Transaction>> getAllTransaction(@PathVariable("accountNumber")String accountNumber){
        return new ResponseEntity<>(transactionService.getAllTransaction(accountNumber),HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> createTransaction(@RequestBody Transaction transaction){
        return new ResponseEntity<>(transactionService.createTransaction(transaction),HttpStatus.OK);
    }

}
