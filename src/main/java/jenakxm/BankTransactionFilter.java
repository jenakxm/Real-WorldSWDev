package jenakxm;

import java.time.Month;
import java.util.List;

public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}
