package wallet.banking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import wallet.banking.model.Transaction;
@Repository
public interface TransactionRepository extends MongoRepository<Transaction,String> {
}
