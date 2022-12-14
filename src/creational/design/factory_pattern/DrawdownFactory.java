package creational.design.factory_pattern;

import java.util.Map;
class Account{}
class DrawdownPrototype{}
class SinglePBRDrawdown{}
public interface DrawdownFactory {

    enum DrawdownCreationMode {
        RAW, WITH_DEFAULTS
    }

    void resetPrototypes(Map<Account, DrawdownPrototype> prototypes);

    SinglePBRDrawdown createSinglePbr(Account account, DrawdownCreationMode mode);

    RecurringPBRDrawdown createRecurringPbr(Account account, DrawdownCreationMode mode);

    SingleUFPLUSDrawdown createSingleUfplus(Account account, DrawdownCreationMode mode);

    RegularUFPLUSDrawdown createRegularUfplus(Account account, DrawdownCreationMode mode);

    PensionPaymentDrawdown createPensionPayment(Account account, DrawdownCreationMode withDefaults);

    OMODrawdown createOMOPbr(final Account account, final DrawdownCreationMode mode);
}

class RecurringPBRDrawdown{}
class SingleUFPLUSDrawdown{}
class PensionPaymentDrawdown{}
class RegularUFPLUSDrawdown{}
class OMODrawdown{}