package wallet.banking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import wallet.banking.model.Account;
@Repository
public interface AccountRepository extends MongoRepository<Account,String> {
}
